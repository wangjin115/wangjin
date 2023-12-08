public class ArrayExercise02 {
	public static void main(String[] args) {
		
		
		int[] arr = {4,8,-33,6,888,34,55};
		int max = arr[0];//假定第一个元素就是最大值
		int maxIndex = 0;
		 
		for(int i = 1;i < arr.length;i++) {//从下标1开始遍历arr
	
		  if(max < arr[i]) {  //如果max<当前元素
			  max = arr[i];   //把max设置成当前元素
			  maxIndex = i;   //把最大下标设置成当前下标
		  } 
		
		}
		
		System.out.println("max=" + max + "最大数是第" + (maxIndex + 1) + "个数");
	}
		
	}