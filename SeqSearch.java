import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {

		/*
		 * ヒント： 1.文字列アレイを定義します 
		 * 2.ユーザー入力を受け取る，一つずつ比較してみる，もしあれば、結果を出力する，そして，プログラムを終了する
		 */

		String[] names = { "小红", "小黄", "小绿", "小黑" };

		Scanner myScanner = new Scanner(System.in);

		System.out.println("名前を入力してください");
		while (true) {
			String findName = myScanner.next();

			int index = -1;

			for (int i = 0; i < names.length; i++) {
				if (findName.equals(names[i])) {
					System.out.println("おめでとうございます" + findName + "見つかりました" + "添字は" + i + "です");
					index = i;
					break;

				}
			}

			if (index == -1) {
				System.out.println("残念です" + findName + "を見つけません" + "名前を再入力してください");
			}

		}

	}

}