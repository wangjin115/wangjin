package digui;

public class Homework06 {

	public static void main(String[] args) {
		Cale cale = new Cale(3, 0);
		System.out.println("和是"+cale.sum());
		System.out.println("差是"+cale.minus());
		System.out.println("积是"+cale.sum());
		Double res =cale.div();
		if(res == null) {
			
		}else{
			System.out.println("商是"+cale.sum());
		}
	}
}

class Cale{
	double num1;
	double num2;
	
	public Cale(double num1,double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public double sum() {
		return num1+num2;
	}
	public double minus() {
		return num1-num2;
	}
	public double mul() {
		return num1*num2;
	}
	public Double div() {
		if(num2 ==0) {
			System.out.println("计算商时，num2不能为0");
			return null;
		}else {
		return num1/num2;
		
		}
	}
}