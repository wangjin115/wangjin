
import java.util.Scanner;

public class NestedIf01 {
	public static void main(String[] args) {

//根据淡旺季的月份和年龄，打印票价
		/*
		 * 4-10月旺季： 成人（18-60）：60 儿童（<18）:半价 老人（>60）:1/3
		 * 
		 * 淡季： 成人：40 其他；20
		 */

		/*
		 * 分析 1.淡旺季 if-else 2.旺季多分支 3.淡季双分支
		 */

		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入月份（1-12）：");

		int month = myScanner.nextInt();

		if (month >= 1 && month <= 12) {

			if (month >= 4 && month <= 10) {
				System.out.print("旺季");

				int ticketPrice = 60;
				System.out.print("请输入年龄：");

				int age = myScanner.nextInt();
				if (age < 18) {
					System.out.print("票价为" + ticketPrice / 2);
				} else if (age >= 18 && age <= 60) {
					System.out.print("票价为" + ticketPrice);
				} else {
					System.out.print("票价为" + ticketPrice / 3);
				}

			} else {
				System.out.print("淡季");
				int ticketPrice = 40;
				System.out.print("请输入年龄：");

				int age = myScanner.nextInt();

				if (age >= 18 && age <= 60) {
					System.out.print("票价为" + ticketPrice);

				} else {
					System.out.print("票价为" + ticketPrice / 2);
				}

			}

		} else {
			System.out.print("输入月份有误，请重新输入");
		}
		myScanner.close();
	}
}
