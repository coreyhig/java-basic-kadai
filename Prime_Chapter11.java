package kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] args) {
		
		boolean [] primeJudge = new boolean[101];
		
		for( int i = 1; i < primeJudge.length; i++ ) {
			primeJudge[i] = true;
		}
		
		int numberDivide = 2;
		while (numberDivide < primeJudge.length) {
			for(int i = numberDivide + 1; i < primeJudge.length; i++) {
				if( i % numberDivide == 0) {
					primeJudge[i] = false;
					continue;
				}
			}
			
			numberDivide += 1;
		}
		
		for( int i =2; i < primeJudge.length; i++) {
			if (primeJudge[i]) {
				System.out.println(i);
			}
		}
	}
}