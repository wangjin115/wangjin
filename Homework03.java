package digui;

public class Homework03 {
	public static void main(String[] args) {
		Book book = new Book("三国",190);
		book.info();
		book.updatePrice();
		book.info();
		
	}

}
//定义方法实现更改某本书的价格
class Book{
	String name;
	double price;
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){
		if(price>150) {
			 price =150;
		}else if(price>100) {
			 price=100;
		}else {
			 
		}
	}
		public void info() {
			System.out.println(this.name + "的价格是" + this.price);
		}
	
}