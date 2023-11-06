package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {

	boolean[] primeJudge = new boolean[101];
		for (int i = 1; i < primeJudge.length; i++) {
			
			//primeJudgeにtrue代入
		primeJudge[i] = true;
		
		int numberDivided = 2;
		while (numberDivided < primeJudge.length) {
		for ( i = numberDivided + 1; i < primeJudge.length; i++);
		if(i % numberDivided == 0) {
		 primeJudge[i] = false;
		 continue;
		}}
		
	numberDivided += 1;
		}
	
	// 素数を出力する
	for (int i = 2; i < primeJudge.length; i++) {
		if (primeJudge[i]) {
			System.out.println(i);
		}
	}
	}}
		
