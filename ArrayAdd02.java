import java.util.Scanner;

public class ArrayAdd02 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		int[] arr = { 1, 2, 3 };

		// outerWhile:
		while (true) {
			int[] arrNew = new int[arr.length + 1];

			for (int i = 0; i < arr.length; i++) {

				arrNew[i] = arr[i];
			}

			System.out.println("请输入添加的元素值：");

			arrNew[arrNew.length - 1] = myScanner.nextInt();

			arr = arrNew;

			System.out.println("扩容后数组的值为：");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println(" ");
			// innerWhile:
			while (true) {
				System.out.println("是否继续添加 y/n");
				char key = myScanner.next().charAt(0);

				if (key != 'y' && key != 'n') {
					System.out.println("输入有误，请重新输入，是否继续添加");

					continue;
				}
				if (key == 'n') {

					break;
				}
				if (key == 'y') {
					break;
				}

//				if (key == 'y' || key == 'n') {
//					if (key == 'y') {
//						break;
//					} else {
//						break outerWhile;
//					}
//				} else {
//					System.out.println("输入有误，请重新输入，是否继续添加");
//
//					continue;
//				}

			}

		}
	}

}
