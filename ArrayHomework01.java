import java.util.Scanner;

public class ArrayHomework01 {
	 public static void main(String[] args) {
		 
		 //我的思路是先加一个数进去，然后冒泡排序，再输出
		 Scanner myScanner = new Scanner(System.in);

			int[] arr = { 99, 2, 3, 8,106 };

			outerWhile:
				while (true) {
				int[] arrNew = new int[arr.length + 1];

				for (int i = 0; i < arr.length; i++) {

					arrNew[i] = arr[i];
				}

				System.out.println("请输入添加的元素值：");

				arrNew[arrNew.length - 1] = myScanner.nextInt();

				arr = arrNew;
				
				int temp = 0;
				for(int i = 0; i < arr.length - 1; i++) { 
					for(int j = 0; j < arr.length - 1 - i; j++) {
						if(arr[j] > arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						
						}
					}
				}

		 		System.out.println("扩容后数组的值为：");
		 		for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + "\t");
			    }
		 		System.out.println(" ");
				// innerWhile:
				while (true) {
					System.out.println("是否继续添加 y/n");
					char key = myScanner.next().charAt(0);
					if (key == 'y' || key == 'n') {
						if (key == 'y') {
							break;
						} else {
							break outerWhile;
						}
					} else {
						System.out.println("输入有误，请重新输入，是否继续添加");

						continue;
					}
				}
				}
	 
	 }
	 

}
