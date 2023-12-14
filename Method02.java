
public class Method02 {
	public static void main(String[] args) {
		
		int [][] map = {{0, 0, 1}, {0, 2, 0}, {0, 1, 0}};
		myTools tools = new myTools();
		tools.printArr(map);
		
		tools.printArr(map);
		
	}

}
//创建一个类

class myTools{
	//方法，接收一个二维数组
	public void printArr(int[][] map) {
		System.out.println("======");
		//遍历map数组
	for(int i = 0; i < map.length; i++){
		for(int j = 0; j < map[i].length; j++) {
			
			System.out.print(map[i][j] + " ");
			
		}
		System.out.println(" ");
	}
	
	}
}

