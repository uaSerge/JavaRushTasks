package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
 private FileInputStream stream;
 private String fileName;

    public TxtInputStream(String fileName)  throws FileNotFoundException, UnsupportedFileNameException{
        super(fileName);
        try {
            if (!fileName.endsWith(".txt")){
                super.close();
                throw new UnsupportedOperationException();
            }
        }  catch (UnsupportedOperationException e) {
            e.printStackTrace();
        throw new UnsupportedFileNameException();}
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{

         }
}


