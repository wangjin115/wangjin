public class StringToBasic {
	public static void main(String[] args) {
		//字符转换相关练习
		
//		将基本数据类型转换成字符串
		int n1 = 100;
		float f1 =1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " ");
		
		
		
//		将字符串转换成基本数据类型
		
		String s5 = "123";
		 
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b);
//		s5为字符串
//		num1为整数
//		两个相加结果不一样
		System.out.println(s5 + 1);
		System.out.println(num1+1);
		
		
//		怎么把字符串转成字符char，含义是把字符串的第一个字符得到
//		chartA（0） 意思为得到s5字符串的第一个字符
		
		
		System.out.println(s5.charAt(0));
		
		
		
//		演示字符串转基本数据类型的细节
	}
	}