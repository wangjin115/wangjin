public class For01 {
	public static void main(String[] args) {

		int count = 3;
		for (int i = 0, j = 0; i < count; i++, j += 2) {
			System.out.println("i=" + i + "j=" + j);
		}

		// 打印1-100之间所有的9的倍数的整数，统计个数及总和

		// 思路分析
		// 化繁为简
//		1.完成输出1-100 的值
//		2.在输出的过程中进行过滤，只输出9的倍数 a % 9 == 0
//		3.统计个数 定义一个变量int count = 0；当条件满足时 count++
//		4.总和，定义变量int sum = 0；当条件满足时累积 sum += a

//		为了更好的适应需求，把范围的开始的值和结束的值，做成变量
//		进一步9倍数也做成变量

		int count01 = 0; // 统计个数
		int sum = 0; // 总和
		int start = 1; // 开始结束的值做成变量
		int end = 1000;
		int t = 5; // 倍数
		for (int a = start; a <= end; a++) { // 改成变量

			if (a % t == 0) { // 改成变量
				System.out.println("a=" + a);
				count01++;    //满足条件就会计数
				sum += a;    //sum=sum+a    满足条件就求和

			}
		}

		System.out.println("count=" + count01);
		System.out.println("sum=" + sum);

		
	}

}