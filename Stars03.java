

public class Stars03 {
	public static void main(String[] args) {
		

		int rows = 5;
		int i = 1;
		do {
			
			int k = 1;
			do {
				System.out.print(" ");
				k++;
			}while(k <= rows - (i - 1));             //do while 做这个空心金字塔，最后一层会出现问题，最终为总行数所在行数等于0的时候
			                                     //他会先输入一个空格，再进行判断，所以最后一层的星星是会向后移
			                                      //试着把i换成i-1，整体都向里面多进一个空格可以解决这个问题
			
			int j = 1;
			do {
				if(j == 1 || j == 2 * i - 1 || i == rows) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
					j++;
			}while(j <= 2 * i - 1);
			
			System.out.print("\n");
			i++;
		}while(i <= rows);
				
			
			    
		    }
		
		
	}
	