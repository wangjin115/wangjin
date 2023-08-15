
//单分支双分支练习

import java.util.Scanner;

public class IfExercise{
	public static void main(String[] args) {
		 
		int year = 2023;
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			 System.out.println(year + "是闰年");
			 
		}
		else {
			System.out.println(year + "不是闰年");
			
		}
		
		/*
		 * 练习
		 * 输入保国同志的芝麻信用分：
		 * 信用分为100.输出极好
		 * 信用分为（80-99】，输出优秀
		 * 【60-80】，输出一般
		 * 其他情况输出信用不及格
		 * 
		 */
		/*
		 * 思路
		 * 在代码中导入包
		 * 假定信用分数为int
		 */
		Scanner myScanner = new Scanner(System.in);
		//接收用户输入
		System.out.println("请输入信用分（1-100）：");
		int grade = myScanner.nextInt();  //使用nextInt来读取一个整数
		//对输入的信用分进行一个范围的有效判断 1-100，否则提示错误
		
		if(grade >=1 && grade <=100) {
		//4种情况，使用多分支
		
		    if(grade == 100) {
			System.out.println("信用极好");
			
		   }else if(grade > 80 && grade <= 99) {
			System.out.println("信用优秀");
		 	
		   }else if(grade >= 60 && grade <= 80) {
			System.out.println("信用一般");
		   }else {
			System.out.println("信用不及格");
		  }
		
		}else {
			System.out.println("输入无效，重新输入");
		}
		

	    myScanner.close();
	    
		}
	
}