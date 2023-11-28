package com.films;

import com.films.classes.XmlParser;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class XmlParsingTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private static XmlParser xmlParser;

    @Before
    public void setUp() {
        xmlParser = new XmlParser();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testPrintSerial() {
        xmlParser.serial();
        String output = outputStream.toString();
    }

    @Test
    public void testPrintCartoon() {
        xmlParser.cartoon();
        String output = outputStream.toString();
    }

    @Test
    public void testPrintFilms() {
        xmlParser.films();
        String output = outputStream.toString();
    }


}
