
import java.util.Scanner;
public class MulFor01 {
	public static void main(String[] args) {
//		统计3个班的成绩，每个班有5名同学
//		求出各个班的平均分和所有班级的平均分（学生的成绩从键盘输入）。
//		统计3个班的及格人数，每个班有5名同学
		
//		思路：
//		化繁为简：
//		1.先计算一个班，5个同学的成绩，使用for
//		1.1创建scanner对象，接收用户输入 score
//		1.2得到该班级的平均分，定义一个doubel sum 把该班级5个学生的成绩累积
		
//		2.统计3个班的平均分，每个班5个人
//		
//		3.所有班级的平均分
//		3.1定义一个变量，double totalScore 累积所有学生的成绩
//		当多重循环结束后，totalScore/3*5
//		
//		4.统计三个班及格人数
//		4.1定义变量 int passNum = 0；当有一个学生成绩 >= 60,passNum++;
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;            //第六步 三个班级成绩总和
		int passNum = 0;
		for(int i = 1;i <= 3;i++) {        //第五步，三个班级     int classNum =3
		

			double sum = 0;       //一个班级的总分
			for(int j = 1;j <= 5;j++) {        //第一步，计算一个班的成绩      int stuNum = 5
			System.out.println("第" + i + "个班级第" + j + "个学生的成绩是");   //第二步创建对象，接收成绩
			
			double score = myScanner.nextDouble();
			if(score >= 60) {               //8.及格人数 
				passNum++;
			}
		//	System.out.println("成绩为" + score);
			
			sum += score;        //第三步得到一个班所有学生的总和
			
		}
		System.out.println("总成绩为" + sum + "平均分" + (sum / 5));   //第四步算平均分   5换成班级
		totalScore += sum;
		}
		
		
		System.out.println("所有班级总成绩为" + totalScore + "平均分为" + totalScore / 15);    //7.三个班平均值
		System.out.println("及格人数=" + passNum);
		
		
		myScanner.close();
	}
	}