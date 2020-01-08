package co.cjpark.sort;

public class MainApp {

		public static void main(String[] args) {
			Rank rank = new Rank();
			int[] result;
			int[] sungjuk = {90, 40, 100, 100, 80, 90, 70, 46, 87, 99};
//			rank.run(sungjuk);
			
			Sort sort = new Sort();
//			result = sort.selectionSort(sungjuk, 1);
			result = sort.bubbleSort(sungjuk);
			
			for(int i = 0; i<result.length; i++) {
				System.out.print(result[i] + " ");
			}
						
			
		}
}
