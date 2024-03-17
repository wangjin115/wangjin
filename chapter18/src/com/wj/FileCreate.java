package com.wj;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author wj
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
    public void create01(){
        String filePath="";
        File file = new File(filePath);
        try {
            file.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void create02(){
        File parentFile = new File("");
        String fileName="";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
