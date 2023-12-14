
public class MethodParameter {

	public static void main(String[] args) {

		B b = new B();
		int[] arr = { 1, 2, 3 };

		b.test100(arr); // 此处的arr是上面的arr,调用的时候相当于把这个数组给到了下面的方法里
		System.out.println("main的arr数组");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		b.test200(p);
		System.out.println("main的age=" + p.age);
	}

}

class B {
	public void test200(Person p) {
//	1.    p=null; 指的是把自己制空，主方法里的内存p指向的还是age=10的对象，所以输出的还是10
//	2.	  p=new Person();
//		  p.name="tom";
//		  p.age=99;       主方法输出的还是10，因为在方法里新建了一个对象，在堆里新建了一个空间，修改的是新的空间里的值
		p.age = 1000;
		System.out.println("test200的age=" + p.age);
	}

	public void test100(int[] arr) {
		arr[0] = 100;
		System.out.println("test100的arr数组");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}

class Preson {
	String name;
	int age;

}