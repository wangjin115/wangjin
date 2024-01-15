package com.wj.arrays_;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

/**
 * @author wj
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0]=new Book("红楼梦",100);
        books[1]=new Book("新版金瓶梅",90);
        books[2]=new Book("青年文摘",10);
        books[3]=new Book("java从入门到放弃",300);

        Book.bubble(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //从小到大
//                int i1=(Integer)o1;
//                int i2 = (Integer) o2;
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
               double n1= book1.getPrice()-book2.getPrice();
               if (n1>0) {
                   return 1;
               }else if (n1<0){
                   return -1;
                }else {
                   return 0;
               }
            }
        });

//        Book.bubble2(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                //从小到大
//                int i1=(Integer)o1;
//                int i2 = (Integer) o2;
//                return i1-i2;
//            }
//        });

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);

        }

    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void bubble2(Book[] books, Comparator c){

        for (int i = 0; i < books.length-1; i++) {
            for (int j = 0; j < books.length-1-i; j++) {

                if (c.compare(books[j].getName().length(),books[j+1].getName().length())>0){
                    Book tempbook=books[j];
                    books[j] =books[j+1];
                    books[j+1]= tempbook;
                }

            }

        }
    }
    public static void bubble(Book[] books, Comparator c){

        for (int i = 0; i < books.length-1; i++) {
            for (int j = 0; j < books.length-1-i; j++) {

                if (c.compare(books[j],books[j+1])>0){
                  Book temp=books[j];
                  books[j]=books[j+1];
                  books[j+1]=temp;
                }
                
            }
            
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}