public class ArrayCopy {
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};
		//创建一个新的数组arr2，开辟新的数据空间
		//大小arr1。length的长度
	
		
		int[] arr2 = new int[arr1.length];
		//遍历arr1，把每个元素拷贝到arr2对应的元素位置
		
		for(int i = 0;i < arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		//修改arr2的值
		
		arr2[0] = 100;
		 
		//输出arr1
		
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr1[i]);	
		}
		//输出arr2
		
		for(int i = 0;i < arr2.length;i++) {
			System.out.println(arr2[i]);	
		}
	}
		
		
		
	}