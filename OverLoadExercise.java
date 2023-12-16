
public class OverLoadExercise {
	public static void main(String[] args) {
		Methods method = new Methods();
		System.out.println(method.max(23, 25));
		System.out.println(method.max(23.9, 25));
		System.out.println(method.max(23.3, 25.8, 68.0));
		System.out.println(method.max(23.3, 25.8, 68));
	}

}

class Methods {
	// int2个数，求最大值，使用三元运算符
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;

	}

	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;

	}
	// 三个数里的最大值

	public double max(double n1, double n2, double n3) {
		double max = n1 > n2 ? n1 : n2;
		return max > n3 ? max : n3;
	}
	
	public double max(double n1, double n2,int n3) {
		System.out.println("调用double n1, double n2,int n3方法");
		double max = n1 > n2 ? n1 : n2;
		return max > n3 ? max : n3;
	}
}