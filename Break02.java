
import java.util.Scanner;
public class Break02 {
	public static void main(String[] args) {
		
//	要求
//		实现登录验证，有3次机会，如果用户名为“丁真”，密码为“666”提示登录成功
//		否则提示还有几次机会
		
//	思路
//		1.创建scanner对象接收用户输入
//		2.定义string name；String passwd；保存用户名和密码
//		3.定义一个变量，int chance 记录还有几次登录机会
//		4.最多循环3次（登录3次），如果满足条件就提前退出
		
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int maxChance = 3;
		for(int i = 1;i <= 3;i++) {            //这地方有两种写法 或者写出 for(int i = 1;maxChance > 0;i++) {
			System.out.println("请输入用户名：");
			 name = myScanner.next();
			System.out.println("请输入密码：");
			 password = myScanner.next();
			 if("丁真".equals(name) && "666".equals(password)) {
			System.out.println("登录成功！");
			 break;
			  
			   }else {
				 maxChance--;                    //如果次数用完提示登录失败的写法
				if(maxChance > 0) {          
					 System.out.println("还有" + maxChance + "次登录机会"); 
					 
				}else {
					System.out.println("登录失败！");  
				 }
			 }
		
		}
		myScanner.close();
	}
	}
	
	