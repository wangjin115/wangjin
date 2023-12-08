public class Array {
	public static void main(String[] args) {
		
		double[] hens = {3, 5, 1, 10, 22, 1.4, 5.6};
		double totalWeight = 0;
		for( int i = 0; i < hens.length; i++) {
			totalWeight += hens[i];
			
		}
		System.out.println("总体重=" + totalWeight + "平均体重=" + (totalWeight / hens.length));
	}
		
	}