
public class Test01 {
	public static void main(String[] args) {
		Person02 p1 = new Person02("jack",15);
		System.out.println("p1\t"+p1);
		System.out.println("p1的名字是"+p1.name);
		System.out.println("p1的年龄是"+p1.age);
		p1.info();		
		p1.add(8, 0);
	}
}
class Person02{
	String name;
	int age;
	
	public Person02(String name, int age) {
		this.name= name;             //构造函数系统自动调用 command+option+s
		this.age=age;
		System.out.println("this\t"+this);  //this和p1是一样的值,this就是指的某个对象的值，哪个对象调用，this就代表哪个对象
	}
    public void info() {
	System.out.println("info\t"+this);
	System.out.println(name + "\t"+age+"\t");    
	//因为方法参数和实例变量同名，Java 编译器会自动识别并使用实例变量，所以使用 this 关键字是可选的。
}
    public int add(int a,int b) {
    	int res = a+b;
    	return res;
    }
	
	
}

	