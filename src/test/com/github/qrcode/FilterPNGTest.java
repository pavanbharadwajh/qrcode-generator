package com.github.qrcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilterPNGTest {
    @Test
    public void getDescription() throws Exception {
        QrcodeGenerator qr = new QrcodeGenerator();
        String actual_value = "PNG files";
        assertEquals(actual_value,qr.File_Type);
    }

  /*  @Test
    public void accept() throws Exception {
       // QrcodeGenerator.FilterPNG qr = new QrcodeGenerator.FilterPNG();
        QrcodeGenerator qr = new QrcodeGenerator();
        String actual_value = "http://hello.com";
        assertEquals(actual_value,qr.Name);
    }
*/
}