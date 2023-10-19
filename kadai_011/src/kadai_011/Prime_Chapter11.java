package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] primeNum = new boolean[101];
		
		for(int i = 1; i < primeNum.length; i++) {
			primeNum[i] = true;
		}
		
		int numDivided = 2;
		while(numDivided < primeNum.length) {
		 for(int i = numDivided + 1; i <primeNum.length; i++) {
			 if(i % numDivided == 0) {
				 primeNum[i] = false;
				 continue;
			 }
		 }
		 numDivided += 1;
		}
		for(int i = 2; i < primeNum.length; i++) {
			if(primeNum[i]) {
				System.out.println(i);
			}
		}
	
		
	}
}
