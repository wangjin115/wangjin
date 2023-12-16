
public class VarParameExercise {
	public static void main(String[] args) {

		HspMethod h = new HspMethod();
		System.out.println(h.showScore("jack", 99, 79, 66));

	}
}

class HspMethod {
	public String showScore(String name, double... scores) {
		double totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}

		return name + "同学" + scores.length + "门课的总成绩为" + totalScore ;
			//	+ "平均分是" + totalScore / scores.length;
	}
} 