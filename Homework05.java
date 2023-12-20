package digui;

public class Homework05 {
	public static void main(String[] args) {
		
		Circle circle = new Circle(3);
		
		System.out.println("面积是"+ circle.ares());
		System.out.println("周长是"+ circle.length());
	}

}
//提供圆的半径，算圆的面积和周长
 class Circle{
	 double r;
	 public Circle(double r) {
		 this.r=r;
	 }
	 public double ares() {
		 return 3.14*r*r;
		 
	 }
	 public double length() {
		 return 2*3.14*r;
		 
	 }
 }