import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		
		//创建一个duble 数组，大小为5
	double scores[] = new double[5];
	
	//double scores[];              声明数组，这时scores是 nell 空的
	//scores = new double[5];       分配内存空间， 可以存放数据
	
	//循环输入
	Scanner myScanner = new Scanner(System.in);
	
	for(int i = 0;i < scores.length; i++) {
		System.out.println("请输入第" + (i + 1) + "个元素的值");
		scores[i] = myScanner.nextDouble();
		
	}
	//输出遍历数组
	for(int i = 0; i < scores.length; i++) {
		System.out.println("第" + (i + 1) + "个元素的值=" + scores[i]);
	}
		
	myScanner.close();
	}
		
	}