package digui;

public class RecursionExercise01 {
	public static void main(String[] args) {
		A a = new A();
		int n = 8;
		int res = a.fibonacci(n);
		if (res != 0) {
			System.out.println("当n=" + n + "时," + "对应的斐波那契数为" + res);

		}
	}

}

class A {

	/*
	 * 使用递归的方式求出斐波那契数1，1，2，3，5，8，13.。。 给你一个整数，求出他对应的斐波那契值是多少 
	 * 思路 1.当n=1 是1 
	 * 2.当n=2 是2
	 * 3.当n>=3 是前两个数的和
	 */
	public int fibonacci(int n) {
		if (n >= 1) {
			if (n == 1 || n == 2) {
				return 1;

			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("请输入>=1的整数");
			return 0;
		}
	}
}
