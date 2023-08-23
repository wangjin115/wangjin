public class MulHomework05 {
	public static void main(String[] args) {
		
//		计算这个序列的和：1 - 1/2 + 1/3 - 1/4 + 1/5 - ... - 1/100。
		
//		思路
//		定义一个sum，当分母是偶数就在sum基础上减去，分母是奇数就在sum基础上加上
//		第一步要判断是奇数还是偶数
		double sum = 0.0;
		for(int i = 1;i <= 100;i++) {
			if(i % 2 == 0) {
				sum -= 1.0 / i;
			}else {
				sum += 1.0 / i;
			}
			
			
		}
		System.out.println("sum=" + sum);
		
		
		
	}
	
	}
		