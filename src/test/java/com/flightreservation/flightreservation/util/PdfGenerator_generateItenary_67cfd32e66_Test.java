package com.flightreservation.flightreservation.util;

import com.flightreservation.flightreservation.domains.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PdfGenerator_generateItenary_67cfd32e66_Test {

    private PdfGenerator pdfGenerator;

    @Mock
    private Reservation reservation;

    @BeforeEach
    public void setUp() {
        pdfGenerator = new PdfGenerator();
    }

    @Test
    public void testGenerateItenary_success() {
        String filePath = "testFilePath"; // TODO: Change this to a valid file path
        pdfGenerator.generateItenary(reservation, filePath);

        // Check if the file has been created
        File file = new File(filePath);
        assertTrue(file.exists());
    }

    @Test
    public void testGenerateItenary_fileNotFound() {
        String filePath = ""; // Empty file path should throw FileNotFoundException

        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            pdfGenerator.generateItenary(reservation, filePath);
        });

        String expectedMessage = "Error in finding file";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
