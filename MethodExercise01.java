
public class MethodExercise01 {
	public static void main(String[] args) {

		A a = new A();
		if(a.isOdd(10)) {
			System.out.println("是奇数");
		}else {
			System.out.println("是偶数");

	}
	}

}

class A {
	
	public boolean isOdd(int num) {
//		if (num % 2 == 0) {
//			
//			return true;
//		} else {
//			
//			return false;
//		}

		return num % 2 != 0;
	}

}