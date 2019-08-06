package com.re01.myclient.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test22 {
    String c = "c", d = "d";

    public void a() {
        String source = "e://122.txt",
                directory = "e://123.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(directory,true);
            byte[] bytes=new byte[1024];
            int read = fileInputStream.read(bytes);
            while (read!=-1){
                fileOutputStream.write(bytes,0,read);
                read=fileInputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void b(){
        String source = "e://122.txt",
                directory = "e://123.txt";
    }

    public static void main(String[] args) {
        Test22 test22 = new Test22();
        test22.b();
    }
}
