package com.flightreservation.flightreservation.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EmailUtil_sendItenary_62ffc27e5a_Test {
    private static final String EMAIL_SUBJECT = "Flight Itinerary";
    private static final String EMAIL_BODY = "Please find your flight itinerary attached.";

    @Mock
    private JavaMailSender javaMailSender;

    @Mock
    private MimeMessage mimeMessage;

    @Captor
    private ArgumentCaptor<String> stringArgumentCaptor;

    @Captor
    private ArgumentCaptor<File> fileArgumentCaptor;

    private EmailUtil emailUtil;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(javaMailSender.createMimeMessage()).thenReturn(mimeMessage);
        emailUtil = new EmailUtil(javaMailSender);
    }

    @Test
    public void testSendItenary_Success() throws MessagingException {
        String toAddress = "test@example.com";
        String filePath = "/path/to/itinerary.pdf";

        emailUtil.sendItenary(toAddress, filePath);

        verify(javaMailSender, times(1)).send(mimeMessage);
        verify(mimeMessage, times(1)).setRecipient(any(), stringArgumentCaptor.capture());
        verify(mimeMessage, times(1)).setSubject(stringArgumentCaptor.capture());
        verify(mimeMessage, times(1)).setText(stringArgumentCaptor.capture());
        verify(mimeMessage, times(1)).addAttachment(any(), fileArgumentCaptor.capture());

        assertEquals(toAddress, stringArgumentCaptor.getAllValues().get(0));
        assertEquals(EMAIL_SUBJECT, stringArgumentCaptor.getAllValues().get(1));
        assertEquals(EMAIL_BODY, stringArgumentCaptor.getAllValues().get(2));
        assertEquals(new File(filePath), fileArgumentCaptor.getValue());
    }

    @Test
    public void testSendItenary_MessagingException() throws MessagingException {
        String toAddress = "test@example.com";
        String filePath = "/path/to/itinerary.pdf";

        doThrow(MessagingException.class).when(mimeMessage).setRecipient(any(), any());

        emailUtil.sendItenary(toAddress, filePath);

        verify(javaMailSender, times(0)).send(mimeMessage);
    }
}
