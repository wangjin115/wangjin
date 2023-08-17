
public class While02{
	public static void main(String[] args) {
		
		
		//打印1-100之间所有能被3整除的数
		
	int i = 1;
	
	int endNum = 100;
	
	int t = 3;
	while(i <= endNum) {          //范围1-100
		if(i % t == 0) {          //被整除
			System.out.println(i);	
		}

		i++;
		
	}	
	    
	
//	打印40-200之间所有的偶数
	
	int j = 40;
	int end = 200;
	while(j <= end) {
		if(j % 2 == 0) {
			System.out.println(j);
			
		}
		j++; 
	}
		
	}
	
		
	}