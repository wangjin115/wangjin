
//关于分支控制的练习


import java.util.Scanner;
//在代码中导入这个包

public class If01{
	public static void main (String[] args) {
		
	Scanner myScanner = new Scanner(System.in);   //创建一个Scanner对象，将其与键盘输入关联
	System.out.println("请输入年龄");
	int age = myScanner.nextInt();  //使用Scanner对象的方法来获取用户的输入。使用nextInt来读取一个整数
	if(age > 18) {          //只有if是单分支
		System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱");
		
	}
	else {                //加else是双分支
		System.out.println("你的年龄不大这次放过你了");
	}
			
	    System.out.println("程序继续");
	    
	    
	    myScanner.close();
	    
	    
	    
	}
}

