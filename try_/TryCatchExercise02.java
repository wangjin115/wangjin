package com.wj.try_;

/**
 * @author wj
 * @version 1.0
 */
public class TryCatchExercise02 {
    public static void main(String[] args) {
        System.out.println(method());
    }
    public static int method(){
        int i=1;
        try {
            i++;
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
           // return ++i;
            return i++;
        }
        finally {
            ++i;

            System.out.println("i="+i);
            return i;
        }
    }
}




