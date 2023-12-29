package com.wj.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        teacher.printInfo();
        System.out.println("---------------------------");
        Student student = new Student("小明", '男', 15, "000001");
        student.printInfo();

        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '男', 18, "000002");
        persons[1] = new Student("red", '女', 15, "000003");
        persons[2] = new Teacher("king", '男', 32, 8);
        persons[3] = new Teacher("mary", '女', 31, 5);
        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i]+" ");
            homework13.test(persons[i]);
//            配列を反復処理する
//            一つのpersons値を入力してテスト・メソッドに渡す
        }

    }
    public void bubbleSort(Person[] persons){

        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }

    }
//    親クラスへの参照が子クラスの型を指し示すことができるため、
//    ここでPersonオブジェクトを受け取る。
    public void test(Person p){
        if (p instanceof Student){
            Student s1 = (Student) p;
            s1.study();
        }
        if (p instanceof Teacher){
            Teacher t1= (Teacher) p;
            t1.teach();
        }

    }
}
