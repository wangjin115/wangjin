
public class MethodExercise02 {

	public static void main(String[] args) {
		//我的思路是建立二维数组，遍历打印
		//他的思路是输入行列字符打印图形
		tuiXing tuiXing = new tuiXing();
		
	  int[][] arr =new int [4][4];
	  tuiXing.printTuixin(arr);
	  
	  
	//	tuiXing.printTuixing(4,4,'#');
		
		
	}
}

class tuiXing{
	public void printTuixin(int[][]arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print('#');
			}
			System.out.println();
		}
	}
	
	
//	public void printTuixing(int row, int col,char c) {
//	for(int i =0;i<row;i++) {
//		for(int j =0;j<col;j++) {
//		System.out.print(c);
//	}
//		System.out.println(" ");
//	}
//	}
	
}