
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		

		for(int i=2;i<=200;i++) {
			boolean isPrime=true;
		for(int j=2;j<i;j++) {
			
			if(i%j==0) {
			isPrime=false;
			break;
			//System.out.println("not prime");
			}
		}
		
		
		if(isPrime) {
			System.out.println(i);
			//pc++;
		}
		
		
		}
		
		
	}

}
