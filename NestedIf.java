import java.util.Scanner;


public class NestedIf{
	public static void main(String[] args) {
		 
		
/*
 * 参加歌手比赛，初赛成绩大于8.0进入决赛，否则淘汰。
 * 并根据性别提示进入男子组或女子组
 */
		
		/*
		 * 思路
		 * 1.创建Scanner对象，接收用户输入
		 * 2.接收成绩保存到double score
		 * 3.使用if-else判断 如果初赛成绩大于8.0进入决赛，否则淘汰
		 * 进入决赛，再接收char gender 使用if-else输出信息
		 */
	Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入成绩");
	double score = myScanner.nextDouble();
	   if(score > 8.0) {
		   System.out.println("请输入性别");
		   char gender = myScanner.next().charAt(0);
	         if( gender == '男') {
	        	 System.out.println("进入男子组");
	         }
	         else if( gender == '女') {
	        	 System.out.println("进入女子组");
	         }
	        	 else{
	             System.out.println("性别输入错误");
	        
	        
	         }
	   }
	   else{
		   System.out.println("你被淘汰了");
	   }
	   
	   myScanner.close();
	}
}