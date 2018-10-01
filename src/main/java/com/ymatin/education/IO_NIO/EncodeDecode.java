package com.ymatin.education.IO_NIO;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodeDecode {
    public static void main(String[] args) {
//        Charset charset = Charset.forName("UTF-8");
        Charset charset = StandardCharsets.UTF_8;
        String str = "Hello!";
        byte[] bytes;
        String newStr;
        // 1
        bytes = str.getBytes(charset);
        newStr = new String(bytes);
        System.out.println(newStr);

        //2
        bytes = charset.encode(str).array();
        newStr = charset.decode(ByteBuffer.wrap(bytes)).toString();
        System.out.println(newStr);

    }
}
