
public class Looping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=45;
		int rem=0;
		int result=0;
		while(no>0) {
			rem=no%10;
			result=result+rem;
			no=no/10;			
		}System.out.println(result);
		if(result>9) {
			System.out.println(result%9);
		}
		
	}
			
	



}
