
public class decimalToB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//decimal to binary.
		/*int decimal=10;
		String binary="";
		while(decimal>0) {
			int rem=decimal%2;
			binary=rem+binary;
			decimal=decimal/2;			
		}System.out.println(binary);*/
		
		int decimal=1010;int rem;int result=0;
		int i=0;
		while(decimal>0) {
			rem=decimal%10;
			result=(int) (result+rem*(Math.pow(2, i)));
			i++;
			decimal=decimal/10;
			
		} System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
