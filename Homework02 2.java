package digui;

public class Homework02 {
	public static void main(String[] args) {
		String[]strs= {"red","black","green","yellow"};
	//	String[]strs= null;
		A02 a02 = new A02();
		Integer index=a02.find("b", strs);
		if(index == null) {
			System.out.println("字符串输入有误");
		}
		else if(index == -1) {
			System.out.println("没找到");		
			
		}else {
			System.out.println("找到了，查找的index="+index);
		}
		
	}

}
//在某字符串中查找某字符是否存在，并返回索引，如果找不到返回-1

class A02{

	public Integer find(String findStr,String [] strs){
		if (strs != null && strs.length >0) {  
			
		for(int i=0;i<strs.length;i++) {
			if(findStr.equals(strs[i])){
				return i;	
			}
		} 
		return -1;
	}else {
		return null;
	}
		
	}
}