package com.wj.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wj
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {

        String filePath="/Users/dreamtank/IdeaProjects/chapter18/src/com/txt/hello.txt";
        BufferedReader br=null;
        String line ="";
        int lineNum=0;

        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line =br.readLine()) != null){
                System.out.println(++lineNum+line);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
