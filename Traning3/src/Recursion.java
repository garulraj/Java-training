
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec(1);

	}
	
	private static void rec(int i) {
		// TODO Auto-generated method stub
 		//int i=1;
		int j=2;
		int result = i*j;
		System.out.println(result);
		i++;
	
		if(result<18) {
			rec(i);
		}
	
	
}
}
