package co.cjpark.sort;

public class Rank {
	//순위 정하기 - 외부에서 인자 전달받아 씀
	private int[] score;
	private int[] rank;
	
	private void arrayInit (int[] num) {		//score 배열을 받아서 num 으로 넣고, 들어온 값들은 rank -> 1 로 지정된다
														//순위를 구하기 위한 배열 초기화
		
		score = new int[num.length];		//초기화 -> 메모리 내 주소 할당
		rank = new int[num.length];
		for(int i=0; i<num.length; i++) {
			score[i] = num[i];
			rank[i] = 1;
		}
	}
	
	private void rankAlgorithm () {
		for(int i=0; i<score.length; i++) {			//전체 회전위한 바깥루프
			for(int j=i+1; j<score.length; j++) {		//실제 순위 결정 시작 하는 이너루프
				if(score[i] < score[j])
					rank[i] ++;
				else if(score[i] > score[j])
					rank[j] ++;
			}			//순위 결정 끝
		}
	}
	
	private void toPrint() {
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i] + " " + rank[i]);
		}
	}
	
	public void run(int[] outNum) {
		arrayInit(outNum);
		rankAlgorithm();
		toPrint();
	}
	
}
