public class MulHomework06 {
	public static void main(String[] args) {
//	
//		计算1+（1+2）+（1+2+3）+。。。。。+（1+2+3+。。。+100）
//		思路
//		先用for循环
		
		int sum = 0;
		for(int i = 1;i <= 100;i++) {
			 for(int j = 1;j <= i;j++) {
				 sum += j;
				 
			 }
		}
		System.out.println("sum=" + sum);
		
	}
	}