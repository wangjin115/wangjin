

public class Break {
	public static void main(String[] args) {
		
//		1-100 数求和，求出当和第一次大于20的当前数
//		思路
//		1.循环1-100，求和sum
//		2.当sum>20时，记录当前数，然后break
//		3.多种输出方式，可以在for循环外 int n = 0，在break前将i的值赋给n，最后输出n
//		也可以如以下方式
//		还可以在if中直接输出i
		int sum = 0;
		int i;
		for( i = 1;i <= 100;i++) {

			sum += i;	
			if(sum > 20) {
				System.out.println("和>20");
				
				break;
			}
				
			
		}
	
		System.out.println("当前数是" + i);
				
	}
	}