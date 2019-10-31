package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileoperations {
    public static void main(String[] args) throws IOException {

        String location1="usingfilewrite.txt";
       /* String location2="usingfilebuffer.txt";
        String location3="usingbyte.txt";
        String location4="usingpaths.txt";
        String content1="im done using filewriter";
        String content2="im done using bufferwriter";
        String content3="im done using byte";
        String content4="im done using paths";

        FileWriter file1=new FileWriter(location1);
        file1.write(content1);
        file1.close();
        FileWriter file2=new FileWriter(location2);
        BufferedWriter buf=new BufferedWriter(file2);
        buf.write(content2);
        buf.close();
        FileOutputStream usingfile=new FileOutputStream(location3);
        byte[] writeallof=content3.getBytes();
        usingfile.write(writeallof);
        Path pathval=Paths.get(location4);
        Files.write(pathval,content4.getBytes());*/

        FileReader reader=new FileReader(location1);
        BufferedReader newbuffer=new BufferedReader(reader);
        String linereader;
        while ((linereader=newbuffer.readLine())!=null){
            System.out.println(linereader);
        }


    }
}
