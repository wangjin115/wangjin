package digui;

public class Homework01 {

	public static void main(String[] args) {

		A01 a = new A01();
		double[] arr = { -1, 0, -3.5};
	//	double[] arr = null;
		Double res = a.max(arr);
		if (res != null) {
			System.out.println("max=" + res);
		} else {
			System.out.println("arr输入有误");
		}

	}
}
//实现求某个数组的最大值，并返回
class A01 {
	public Double max(double[] arr) {      
		if (arr != null && arr.length > 0) {   //此处补充了如果数组是null或者{},那么需要这么操作
			double max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			return max;

		} else {
			return null;

		}

	}
}
