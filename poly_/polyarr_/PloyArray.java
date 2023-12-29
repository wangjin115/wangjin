package com.wj.poly_.polyarr_;



public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] =new Person("jack",20);
        persons[1]=new Student("king",16,90);
        persons[2]=new Student("yellow",18,90);
        persons[3]=new Teacher("black",35,20000);
        persons[4]=new Teacher("white",44,25000);
        System.out.println("name"+"\t"+"age"+"\tothers");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                Student student =(Student) persons[i];
                student.stdy();
//             可以简化成一条语句   ((Student) persons[i]).stdy()

            }
            else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();

            }else if (persons[i] instanceof Person) {

            }
            else{
                System.out.println("你的类型有误");
            }

        }






    }
}
