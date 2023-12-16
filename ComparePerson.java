
public class ComparePerson {
	public static void main(String[] args) {
		Person03 p1 = new Person03("jack", 8);
		Person03 p2 = new Person03("red", 7);
		if(p1.compareTo(p2)){
			System.out.println("两人的名字和年龄相同");
			
		}else {
			System.out.println("两人的名字和年龄不同");
		}
		
	}
}

class Person03{
	String name;
	int age;
	
	public Person03(String name, int age) {
		this.name= name;             
		this.age=age;
	}
	public boolean compareTo(Person03 p) {
//		if(this.name.equals(p.name)&&this.age==p.age) {
//			return true;
//		}else {
//			return false;
//		}
//		这可以简化为：满足就返回真，不满足就返回假
		return this.name.equals(p.name)&&this.age==p.age;
		
	}
}