

public class VarParameter01 {
	public static void main(String[] args) {
		HspMenthod m = new HspMenthod();

		System.out.println("接收的参数的和是" + m.sum(1, 3, 5));
		System.out.println("接收的参数的和是" + m.sum(1, 3));

	}

}

class HspMenthod {
	
	public int sum(int... num) {
		System.out.println("接收的参数个数为" + num.length);
		int res = 0;
		for (int i = 0; i < num.length; i++) {
			res += num[i];
		}
		return res;
	}
}
