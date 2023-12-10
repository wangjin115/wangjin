import java.util.Scanner;

public class ArrayAdd {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		
		int[] arrNew = new int[arr.length + 1];
		
		for(int i = 0;i < arr.length;i++) {
			
			arrNew[i] = arr[i];
			
			
		}
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入添加的元素值：");
		
		arrNew[arrNew.length - 1] = myScanner.nextInt();
		
		//arrNew[arrNew.length - 1] = 4;
		
		
		arr = arrNew;
		
		System.out.println("扩容后数组的值为：");
		for(int i = 0;i < arr.length;i++) {
			
			System.out.print(arr[i] + "\t");
		}
		
		myScanner.close();
	}
		
		
		
	}