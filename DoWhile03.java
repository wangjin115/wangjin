
/*问题
 * 如果不还钱就要挨打，直到还钱为止
 * 
 * 思路
 * 1.循环问还钱吗
 * 2.使用char answer接收回答，定义一个scanner对象
 * 3.do-while 的while判断如果是y就不再循环
 */

import java.util.Scanner;

public class DoWhile03 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in); // 建立scanner，接收回答
		char answer = ' ';

		do { // 第一步do while
			System.out.println("挨打！"); // 循环语句 这程序有个问题，一上来就挨打
			System.out.println("问:还钱吗？y/n");
			answer = myScanner.next().charAt(0); // 接收回答
			System.out.println("他的回答是" + answer);
			// System.out.println("挨打！");
		} while (answer != 'y'); // 回答是y就退出程序

		System.out.println("不打了，程序继续");

		myScanner.close();
	}
}