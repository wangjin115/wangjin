
public class MethodDetail {
	public static void main(String[] args) {

		AA aa = new AA();
		int[] arr = { 1, 2, 2, 4, 6, 7, 8 };

		int res = aa.getSumAndSub(arr);
		System.out.println("和=" + res);
		//int[] res = aa.getSumAndSub(1,8);
		//System.out.println("和=" + res[0]);
		// System.out.println("差=" + res[1]);
		 
	}

}

class AA {
//	public int[] getSumAndSub(int n1, int n2) {
//		
//		int[] resArr = new int[2];
//		resArr[0] = n1 + n2;
//		resArr[1] = n1 - n2;
//		return resArr;
//		
//	}

	public int getSumAndSub(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += i;

		}

		return sum;
	}

}