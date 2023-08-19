//打印九九乘法表
//


public class MulTable {
	public static void main(String[] args) {
		
//		外层循环控制行数  1-9行
		
		for(int i = 1;i <= 9;i++) {
		
//		内层循环控制列数（1-当前行数的列）
		
		for(int j =1;j <= i;j++) {
			
//		打印乘法表达式    "\t"是转义字符调整列间距的，使输出内容在不同的列上对齐
			
			System.out.print(j + " * " + i + " ="  + (j * i) + "\t");
		
			
			
		}
//		换行   
//	    System.out.println("");就是换行的意思，print是输出为一行，println可以实现换行
//		System.out.println(""); = System.out.print("\n");  
		
		System.out.println("");
		}
	}
	
}