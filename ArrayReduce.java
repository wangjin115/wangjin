import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		Scanner myScanner = new Scanner(System.in);

		while (true) {

			int[] arrNew = new int[arr.length - 1];

			for (int i = 0; i < arr.length - 1; i++) {

				arrNew[i] = arr[i];

			}

			arr = arrNew;
			
			System.out.println("配列の値は：");
			for (int i = 0; i < arr.length; i++) {

				System.out.print(arr[i] + "\t");
			}

			System.out.println(" ");
			System.out.println("縮小を続けますか？ y/n");
			char key = myScanner.next().charAt(0);

			if (key == 'n') {
				break;
			}
			if (arr.length == 1) {

				System.out.println("これ以上縮小できません");
				break;

			}

		}


		System.out.println("システムが縮小を終了しました");
		myScanner.close();

	}

}