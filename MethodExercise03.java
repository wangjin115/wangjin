public class MethodExercise03 {
	public static void main(String[] args) {

		P p = new P();

		p.name = "jack";
		p.age = 10;

		MyTools1 myTools = new MyTools1();
		P p2 = myTools.copyPerson(p);
		System.out.println("p的名字是" + p.name + "年龄是" + p.age);
		System.out.println("p2的名字是" + p2.name + "年龄是" + p2.age);

	}

}

class P {
	String name;
	int age;

}

class MyTools1 {
	public P copyPerson(P p) {
		P p2 = new P();
		p2.name = p.name;
		p2.age = p.age;
		return p2;

	}

}