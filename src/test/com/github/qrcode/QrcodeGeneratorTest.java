package com.github.qrcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class QrcodeGeneratorTest {
    @Test
    public void ret_web_name() throws Exception {
    QrcodeGenerator qr = new QrcodeGenerator();
    String actual_value = "http://hello.com";
    assertEquals(actual_value,qr.Name);
    }
}