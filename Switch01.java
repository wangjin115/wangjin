
import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {

//	编写一个程序，该程序可以接收字符，如a，b，c，d，e。。。
//		a表示星期一，b表示星期二。。。。
//		根据用户的输入显示信息
//		思路
//		1.创建scanner
//		2.使用switch完成匹配

		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入一个字符（a-g）：");
		char c1 = myScanner.next().charAt(0);
		// java中，只要有值返回，就是一个表达式
		switch (c1) {
		case 'a':         //case的值必须是常量，不能是变量
			System.out.println("今天星期一");  
			break;
		case 'b':
			System.out.println("今天星期二");
			break;
		case 'c':
			System.out.println("今天星期三");
			break;
		case 'd':
			System.out.println("今天星期四");
			break;
		case 'e':
			System.out.println("今天星期五");
			break;
		case 'f':
			System.out.println("今天星期六");
			break;
		case 'g':
			System.out.println("今天星期日");
			break;

		default:
			System.out.println("你输入的字符不正确");
			break;
		}

		System.out.println("退出了switch，继续执行程序");

		myScanner.close();
	}
}