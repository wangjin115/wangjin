
import java.util.Scanner;

public class SwitchExercise01 {
	public static void main(String[] args) {
		/*
		 * 学生成绩大于60分，输出合格，低于60分输出不合格 输入的成绩不能大于100
		 */

		/*
		 * 两种方式，1.可以用分支完成 2.switch，需要进行一个转换 如果成绩【60，100】，（int）（成绩/60） = 1
		 * 如果成绩【0，60】，（int）（成绩/60） = 0
		 */

		// 第一种使用分支完成

		/*
		 * Scanner myScanner = new Scanner(System.in);
		 * System.out.println("请输入学生的成绩（0-100）："); double score =
		 * myScanner.nextDouble(); if (score >= 1 && score <= 100) { if (score >= 60) {
		 * System.out.println("合格");
		 * 
		 * } else { System.out.println("不合格"); }
		 * 
		 * } else System.out.println("输入有误，请输入1-100");
		 * 
		 * myScanner.close();
		 * 
		 */

		// 第二种使用switch完成

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入学生的成绩（0-100）：");
		double score = myScanner.nextDouble();
		if (score >= 1 && score <= 100) {
			switch ((int) (score / 60)) {
			case 0:
				System.out.println("不合格");
				break;
			case 1:
				System.out.println("合格");
				break;
			}

		} else
			System.out.println("输入有误，请输入1-100");

		myScanner.close();

	}
}
