

public class DoWhile{
	public static void main(String[] args) {
		
	int i = 1;
	do {
		System.out.println("你好" + i);
		i++; 
		
	}while(i <= 10);
	
	System.out.println("退出dowhile 继续执行");
		
	
	
	
	int j = 1;
	int sum = 0;
	
	do {
		
		sum += j;
		
		j++; 
		
	}while(j <= 100);
	
	System.out.println(sum);
	}
	
}
	