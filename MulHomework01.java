public class MulHomework01 {
	public static void main(String[] args) {
		
//		某人有100000元，每经过一次路口需要缴费，
//		当现金>50000时，每次交5%，
//		当现金<=50000时，每次交1000，
//		计算该人可以经过多少次路口，使用while语句，使用break
		
//		思路
//		while语句，当money>0时就循环
//		使用if ，else if，else多分支
//		使用count++计算次数
//		初始化现金为100000，初始化次数为0
		
		double money =100000;
		int count = 0;
		while(money > 0) {
			if(money > 50000) {
				money -= money * 0.05;
				count++;
			}else if(money > 1000) {
				money -= 1000;
				count++;
			}else {
				break;
			}
		}
		System.out.println("会经过" + count + "次路口");
		
	}
}
		