package digui;

public class Homework13 {
	public static void main(String[] args) {

		Circle01 c = new Circle01();
		PassObject po = new PassObject();
		po.printAreas(c, 5);
	}

}
class Circle01 {
	double radius;

	public Circle01() {

	}
	public Circle01(double radius) {
		this.radius = radius;

	}
	public double findArea() {  //返回面积
		return 3.14 * radius * radius;

	}
	public void setRadius(double radius) {  //添加方法修改对象半径
		this.radius = radius;
	}

}
//要求输出半径和面积
class PassObject {
	public void printAreas(Circle01 c, int times) {
		System.out.println("redius\tarea");
		for (int i = 1; i <= times; i++) {  //输出1-times之间的整数半径
			c.setRadius(i); //修改半径值
			System.out.println((double)i + "\t" + c.findArea());

		}
	}
}