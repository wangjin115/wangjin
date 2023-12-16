package digui;

public class Recursion01 {
	public static void main(String[] args) {

		T t = new T();
		t.test(4);
		int res = t.factorial(5);
		System.out.println("5的阶乘 = " + res);
	}

}

class T {
	public void test(int n) {
		if (n > 2) {
			test(n - 1);
		}
		System.out.println("n=" + n);
	}

	//factorial阶乘，阶乘的公式n！=1*2*3****（n-1）*n
	public int factorial(int n) {
		if (n == 1) {
			return 1;//谁调用就把结果返回给谁，注意是结果的返回

		} else {
			return factorial(n - 1) * n;
		}
	}
}
