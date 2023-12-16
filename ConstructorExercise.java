
public class ConstructorExercise {
	public static void main(String[] args) {
		
		//第一个无参构造器:利用构造器设置所有人的 age 属性初始值都为 18
		//第二个带 pName 和 pAge 两个参数的构造器
		Person01 p = new Person01();
		System.out.println("p的年龄是"+p.age);
		Person01 p2 = new Person01();
		p2.age=18;
		System.out.println(p2.age);
		 
		Person01 p1 = new Person01("jack",15);
		System.out.println("p1\t"+p1);
		System.out.println("p1的名字是"+p1.name);
		System.out.println("p1的年龄是"+p1.age);
		
		p1.info();		
	}

} 

class Person01{
	String name;
	int age;
	
	public Person01(){	
		//age = 18;
		
	}
//	public Person01(String pName, int pAge) {
//		name= pName;
//		age=pAge;
//}
	public Person01(String name, int age) {
		this.name= name;             //构造函数系统自动调用 command+option+s
		this.age=age;                //如果类里面跟构造器里重名就➕this，相当于调用的意思吧
		System.out.println("this\t"+this);  //this和p1是一样的值,this就是指的某个对象的值，哪个对象调用，this就代表哪个对象
	}
public void info() {
	System.out.println("info\t"+this);
	System.out.println(name + "\t"+age+"\t");    
	//就近选择，如果这个方法里有个name和age的话就会输出这个方法里面的，外面的name和age呢，又是根据每个对象变化的，所以每个对象输出来的也不一样
}
	
	
}

