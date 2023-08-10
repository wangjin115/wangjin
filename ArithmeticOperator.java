public class ArithmeticOperator {
	public static void main(String[] args) {
		
		// /的使用
		System.out.println(10 / 4);
//		注释快捷键 command+/    再按一次command+/注销注释
		System.out.println(10.0 / 4);
		
		double d = 10 / 4;
		System.out.println(d);
		
		double f = 10.0 / 4;
		System.out.println(f);
		
//		% 取模 取余数
//		公式 a % b = a - a / b * b
		
		System.out.println(10 % 3);
		System.out.println(10 % -3); // 10-10/(-3)*(-3)=1 
		
//		++的使用
//		作为独立语句使用，前++后++完全等价于i=i+1
		
		int i = 10;
		i++; 
		++i;
		
		System.out.println("i=" + i);
/*		作为表达式使用
		前++：++i先自增后赋值
		后++：i++先赋值再自增
				*/
		
		int j = 8;
//		int k = ++j;  //等价j=j+1；k=j；
//		System.out.println("k=" + k + "j=" + j);
		
		int k = j++;  //等价k=j；j=j+1;
		System.out.println("k=" + k + "j=" + j);
	}
		
	}