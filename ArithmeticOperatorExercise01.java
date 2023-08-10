public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
		
		int i = 1;
		i = i++; //规则使用一个临时变量（1）temp=i；（2）i=i+1； （3）i=temp；
		
		System.out.println(i);
		
		
		int a = 1;
	     a = ++a;//规定使用一个临时变量（1）j=j+1；（2）temp=j；（3）j=temp；
		
		System.out.println(a);
		
		int c = 1;
		c = ++c;
		System.out.println(c);
		
		
		int k1 = 10;
		int k2 = 20;
		int k = k1++;
		System.out.print("k=" + k);
		System.out.println("k2=" + k2);
		k = --k2;
		System.out.print("k=" + k);
		System.out.println("k2=" + k2);
				
		
		int days = 59;
		int weeks = days/7;
		int leftDays = days % 7;
		System.out.println(days + "天 合" + weeks + "星期" + leftDays + "天");
		
		
		double huaShi = 234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("华氏温度" + huaShi + "对应的摄氏温度=" + sheShi);
		
				
		
	}
		
		
		
	}