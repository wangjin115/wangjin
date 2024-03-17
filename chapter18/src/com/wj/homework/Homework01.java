package com.wj.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wj
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {

        String directoryPath ="/Users/dreamtank/IdeaProjects/chapter18/src/com/txt";
        File file=new File(directoryPath);
        if (!file.exists()){
            if (file.mkdirs()){
                System.out.println("创建"+directoryPath+"成功");
            }else {
                System.out.println("创建"+directoryPath+"失败");
            }
        }
        String filePath=directoryPath+"/hello.txt";
        file=new File(filePath);
        if (!file.exists()){
            if (file.createNewFile()){
                System.out.println(filePath+"创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello");
                bufferedWriter.close();

            }else {
                System.out.println(filePath+"创建失败");
            }
        }else {
            System.out.println(filePath+"已经存在，不再重复创建");
        }
    }
}
