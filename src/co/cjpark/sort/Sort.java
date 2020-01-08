package co.cjpark.sort;

public class Sort {
	private int[] arr;
	
	public int[] selectionSort(int[] num, int n)	{		//내림차순, 오름차순 sort
		int min, temp;			
		arr = num;		//배열은 그 자체가 주소, 여기서 가져온 num 에 참조 시켜준다
		for(int i=0; i<arr.length-1; i++) {
			min = i;  // arr[i] 의 요소값이 가장 작다고 전재한다.
			for(int j=i+1; j<arr.length; j++) {
				
				if(n == 0) {
					if(arr[min] > arr[j])		min = j; 		// n = 0 이면 오름차순
				}else {
					if(arr[min] < arr[j])		min = j;		// 0 외 값은 내림차순
				}
				
			}
			if(min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}
	
	public int[] bubbleSort (int[] num) {		//버블소트
		int temp;
		arr = num;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public int[] quickSort (int[] num) {		//퀵소트
		
		return arr;
	}
	
}
