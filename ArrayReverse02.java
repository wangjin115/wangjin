public class ArrayReverse02 {
	public static void main(String[] args) {
		
		int[] arr1 = {11, 22, 33, 44, 55, 66};
		int[] arr2 = new int[arr1.length];
		for(int i = arr1.length-1, j = 0; i >= 0; i--,j++) {
			arr2[j] = arr1[i];
			
		}
		
		arr1 = arr2;
		
		for(int i = 0;i < arr1.length;i++) {
			System.out.print(arr1[i] + "\t");
	}
	}
		
		
		
	}
		