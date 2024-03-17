package com.wj;

/**
 * @author wj
 * @version 1.0
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        int cpuNums=runtime.availableProcessors();
        System.out.println(cpuNums);
    }
}
