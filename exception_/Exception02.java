package com.wj.exception_;

/**
 * @author wj
 * @version 1.0
 */
public class Exception02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
           // person=null;
            System.out.println(person.getName());
            int n1=10;
            int n2=0;
            int res=n1/n2;
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
       finally {
        }


    }
}
class Person{
    private String name="jack";

    public String getName() {
        return name;
    }
}