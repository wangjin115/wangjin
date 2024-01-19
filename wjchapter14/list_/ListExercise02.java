package com.wj.list_;

import java.util.*;

/**
 * @author wj
 * @version 1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {
      //  List list = new ArrayList();
        List list = new LinkedList();
      //  List list = new Vector();
        list.add(new Book("红楼梦",100,"曹雪芹"));
        list.add(new Book("西游记",50,"吴承恩"));
        list.add(new Book("水浒传",90,"施耐庵"));
        list.add(new Book("三国演义",80,"罗贯中"));
      //  list.add(new Book("西游记",50,"吴承恩"));
        for (Object o :list) {
            System.out.println(o);
        }
//        list.sort(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book= (Book) o1;
//                Book book2= (Book) o2;
//                double priceVal=book.getPrice()-book2.getPrice();
//                if (priceVal>0){
//                    return 1;
//                }else if (priceVal<0){
//                    return -1;
//
//                }else {
//                    return 0;
//
//                }
//
//            }
//        });
        Book.sort(list);
        System.out.println("===排序后===");
        for (Object o :list) {
            System.out.println(o);
        }

    }

}
class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public static void sort(List list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                Book book = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book);
                }
            }
        }
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t" +
                "价格：" + price +"\t"+
                "作者：" + author +"\t" ;
    }
}
