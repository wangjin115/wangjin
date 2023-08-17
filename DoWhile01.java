
public class DoWhile01 {
	public static void main(String[] args) {

		int i = 1;
		int endNum = 200;
		int count = 0;
		int n1 = 5;
		int n2 = 3;
		do {
			if (i % n1 == 0 && i % n2 != 0) {
				System.out.println("i=" + i);

				count++;

			}
			i++;

		} while (i <= endNum);

		System.out.println("个数" + count);

	}

}