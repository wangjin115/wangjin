public class MulHomework03 {
	public static void main(String[] args) {
		
//		输出1-100之间不能被5整除的数，每5个一行
		
		int count =0;
	for(int i = 1;i <= 100;i++) {
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
				if(count % 5 == 0) {
					System.out.println();
			}
			
			
			}
//			if(count % 5 == 0) {
//				System.out.println();       对于这段代码，我有一个问题，为什么位置不一样会出现格式的不同
//		}
	}
	      // 如果最后一行没有满5个数，补充换行
	      if (count % 5 != 0) {
	      System.out.println();
	    }
	
		
	}
	}