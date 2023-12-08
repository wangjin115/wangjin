public class ArrayReverse {
	public static void main(String[] args) {
		
		//思路分析
		//把arr0和arr5进行交换，依次类推
//		一共要交换3次，也就是数组的长度/2
//		每次交换时对应的下标是arr[i]arr[length-1-i]
		
		int[] arr =  {66,22,33,44,55,11};
		int temp = 0;
		int len = arr.length;
		for(int i = 0;i < len / 2;i++) {
			temp = arr[len - 1 - i];
			arr[len - 1 -i] = arr[i];
			arr[i] = temp;
			
		}
		
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
		
		
		
	}
		
		