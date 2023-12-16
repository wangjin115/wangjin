package digui;

public class RecursionExercise02 {
	public static void main(String[] args) {
		B b = new B();
		int n = 1;
		int res = b.peach(n);
		if (res != 0) {
			System.out.println("第" + n + "天有" + res + "个桃");

		}
 
	}

}

/*
 * 猴子吃桃问题 一堆桃，第一天吃其中一半，并多吃了一个 
 * 以后每天都吃其中一半，并且多吃一个，当吃到第10天时，还没吃的时候发现只剩1个桃了 
 * 问最初有几个桃
 * 
 * 思路
 * 第10天1个桃
 * 第1-9天的数量是（后一天的数量+1）*2
 */
class B {

	public int peach(int day) {
		if (day == 10) {
			return 1;

		} else if (day >= 1 && day <= 9) {
			return (peach(day + 1) + 1)* 2;

		} else {
			System.out.println("请输入1-10个桃子");
			return 0;
		}
	}

}