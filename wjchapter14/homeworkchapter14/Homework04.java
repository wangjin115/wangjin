package com.wj.homeworkchapter14;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author wj
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {

    }
    @Test

    public void testList(){
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,20,"red"));
        dao.save("003",new User(3,15,"black"));
        List<User> list = dao.list();
        System.out.println(list);
        dao.update("003",new User(3,58,"milan"));
        System.out.println("===修正後===");
        list= dao.list();
        System.out.println(list);
        System.out.println("===削除===");
        dao.delete("001");
        list=dao.list();
        System.out.println(list);
        System.out.println("id=003:"+dao.get("003"));

    }
}
class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
     map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
      map.put(id, entity);
    }
    public List<T> list(){
        List<T> list =new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key :keySet) {
            list.add(get(key));
        }

        return list;
    }
    public void delete(String id){
        map.remove(id);
    }

}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
