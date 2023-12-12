import java.util.function.BiConsumer;

public class ArrayHomework02 {
	 public static void main(String[] args) {
		 /*
		  * 
		  */
		
		 
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;//随机生成1-100的数
			
		}
		System.out.println("====arr的元素情况===");
		for(int i = 0;i < arr.length;i++) {
			
			System.out.print(arr[i] + "\t");
			
			
		}
		System.out.println();
		System.out.println("====arr的元素倒叙情况===");
		
		for(int i = arr.length - 1;i >= 0;i--) {
			System.out.print(arr[i] + "\t");
		}
		
			int max = arr[0];
			int maxIndex = 0;
		    double sum = arr[0];
		    for(int i = 1;i < arr.length;i++) {
		    	sum += arr[i];
		    	if(max < arr[i]) {
		    		max = arr[i];
		    		maxIndex = i;
		    	}
		    	
//		    	System.out.println("\nmax=" + max + "maxIndex=" + maxIndex);
//		    	System.out.println("平均值为" + sum / 10);
			
		    	
		    }
	
	    	System.out.println("\nmax=" + max + "maxIndex=" + maxIndex);
	    	System.out.println("平均值为" + sum / 10);
	    	
	    	int findNum = 8;
	    	int index = -1;
	    	for(int i = arr.length - 1;i >= 0;i--) {
	    		if(findNum == arr[i]){
	    			System.out.println("找到数值" + findNum);
	    			index = i;
	    			break;
	    		}
	    		
	    		
	    	}
	    	if(index == -1) {
    			System.out.println("抱歉没有找到数值" + findNum);
    			
    		}
		
	}
		
	 }
		 
		 
	 