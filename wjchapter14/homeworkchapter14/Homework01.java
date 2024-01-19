package com.wj.homeworkchapter14;

import java.util.ArrayList;

/**
 * @author wj
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News("新型ロボットが家庭労働をサポート、快適な生活を提供"));
        list.add(new News("医療技術の最新進展、画期的な治療法が開発"));
        for (int i = list.size()-1; i >= 0; i--) {
         //   System.out.println(list.get(i));
            News news = (News) list.get(i);
            System.out.println(processTitle(news.getTitle()));
        }

    }
    public static String processTitle(String title){
        if (title==null){
            return "";
        }
        if (title.length()>15){
            return title.substring(0,15)+"...";
        }else {
            return title;
        }
    }
}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
