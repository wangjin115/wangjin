import java.util.Scanner;

public class MulHomework02 {
	public static void main(String[] args) {
		//判断一个整数是否为水仙花数
        //水仙花数是指一个3位数,各个位上的数字立方和等于其本身
//		思路
//	    得到各个位上的数字
//		百位=n/100，十位=n%100/10，各位n%10
//		进行判断
		 Scanner myScanner = new Scanner(System.in);
	        System.out.print("请输入一个三位整数（100-999）：");
	        int number = myScanner.nextInt();
	   if(number >= 100 && number < 1000){
		   
	        int n = number;
	        int n1 = number / 100;
	        int n2 = number % 100 / 10;
	        int n3 = number % 10;
	        
	   
	        if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n) {
	        	System.out.println("是水仙花数");
	        	
	        }else {
	        	System.out.println("不是水仙花数");
	        	
	        }
	   }else {
		   System.out.println("输入的整数有误，请重新输入！");
	   }
	        myScanner.close();
	}
}