
public class Object01 {

	 public static void main(String[] args) {
		 
		 //使用面向对象的方式来解决
		 //使用OOP面向对象解决
		 //实例化一只猫/创建一只猫对象
		 //1.new Cat创建一只猫
		 //2.Cat cat1 把创建的猫赋给cat1
		 
		Cat cat1 = new Cat();
		 cat1.name = "小白";
		 cat1.age = 3;
		 cat1.color = "白色";
		 
		 //创建第二只猫，并赋给cat2
		 
		 Cat cat2 = new Cat();
		 cat2.name = "小花";
		 cat2.age = 100;
		 cat2.color = "花色";
		 
		 //怎么访问对象的属性
		 System.out.println("第一只猫的信息\n" + cat1.name + " " + cat1.age + " " +
		 cat1.color);
		 System.out.println("第二只猫的信息\n" + cat2.name + " " + cat2.age + " " +
				 cat2.color);
	 }
}

//定义一个猫类cat 自定义的数据类型 
class Cat {
	//属性 （成员变量，字段field），可以是基本数据类型，也可以是引用类型（另一个对象或数组）
	String name; 
	int age;
	String color;
	//String[] master;
	
}