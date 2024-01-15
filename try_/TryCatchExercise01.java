package com.wj.try_;

/**
 * @author wj
 * @version 1.0
 */
public class TryCatchExercise01 {
    public static void main(String[] args) {
        System.out.println(method());
    }
    public static int method(){
        try {
            String[] names =new String[3];
            if (names[1].equals("tom")){
                System.out.println(names[1]);
            }else {
                names[3]="wj";
            }
           return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        }
        finally {
            return 4;
            }
        }
    }



