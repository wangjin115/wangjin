
import java.util.Scanner;

public class SwitchExercise02 {
	public static void main(String[] args) {

//		打印月份对应的季节
//		3.4.5春季 6.7.8夏季 9.10.11秋季 12.1.2冬季

//		思路分析
//		1.创建scanner
//		2.使用int month接收
//		3.使用switch来匹配，使用穿透完成

		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入一个月份(1-12)");

		int month = myScanner.nextInt();
		String season;
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "春季";
			//System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			season = "夏季";
			//System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			season = "秋季";
		//	System.out.println("秋季");
			break;
		case 12:
		case 1:
		case 2:
			season = "冬季";
			//System.out.println("冬季");
			break;
		default:
			season = "无效月份";
			//System.out.println("输入有误，重新输入");
		}

		System.out.println(month + "月对应的季节是" + season);
		myScanner.close();

	}

}