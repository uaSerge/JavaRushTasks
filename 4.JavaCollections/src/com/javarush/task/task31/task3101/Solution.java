package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File newFileName = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath,newFileName);
        File[] list = path.listFiles();
        List<File> fileList = new ArrayList();

        for (File file : list
                ) {
            if (file.length() > 50) FileUtils.deleteFile(file);
            else fileList.add(file);
        }

        Collections.sort(fileList);

        try {
            FileOutputStream writer = new FileOutputStream(newFileName);
//            BufferedWriter writer = new BufferedWriter(outputStream);

            for (File file : fileList
                    ) {
//              FileReader fileReader = new FileReader(file);
                FileInputStream reader = new FileInputStream(file);
                try {
                    while (reader.available()>0) {
                        writer.write(reader.read());
                        writer.flush();
                    }
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                writer.write('\n');
                writer.flush();
            }
 //           outputStream.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
