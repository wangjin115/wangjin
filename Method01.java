
public class Method01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak(); // 调用方法
		p1.cal01();
		p1.cal02(8);
		p1.cal02(5);
		int resreturn = p1.getSum(5, 9);
		System.out.println("getSum返回的值是" + resreturn);

	}
}

class Person {
	String name;
	int age;

	public void speak() {
		System.out.println("我是一个好人");

	}

	public void cal01() {
		int res = 0;
		for (int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("计算结果=" + res);
	}

	public void cal02(int n) {
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("计算结果=" + res);
	}

	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}

}