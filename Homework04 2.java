package digui;

public class Homework04 {
	public static void main(String[] args) {
		double[] oldArr = { 70, 45, 66 };
		A03 a03 = new A03();
		double arr[] = a03.copyArr(oldArr);
		System.out.println("===新数组的元素情况===");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
//复制一个数组
class A03 {

	public double[] copyArr(double[] oldArr) {
		double[] newArr = new double[oldArr.length];
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];

		}
		return newArr;
	}
}