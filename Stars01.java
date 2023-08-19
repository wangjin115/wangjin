
public class Stars01 {
	public static void main(String[] args) {
		
		int rows = 5;    //行数
		int i = 1;
		while(i <= rows) {
			int k = 1;      //打印空格
			while(k <= rows - i) {
				System.out.print(" ");
				k++;
			}
			int j =1;        //打印星号
			while(j <= 2 * i -1) {
				if(j == 1 || j == 2 * i - 1 || i == rows) {
					System.out.print("*");
				}else {
					System.out.print(" ");
					}
				j++;
			
		}		
//			换行
			     System.out.print("\n");
			     i++;
		    }
		
		
	   }
	}