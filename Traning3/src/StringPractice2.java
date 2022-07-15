
public class StringPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s= "hello I am Arulraj. I am from Chennai";
		/*int count=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'-'Z') {
				count++;
			}		
		}System.out.println(count);*/
		
		String s="Arulraj";
		//lr
		//System.out.println(s.contains("lr"));
		char key = 'l';
		char key2 = 'r';
		for(int i=0;i<s.length();i++) {
			//System.out.println(s.charAt(i));
			if(s.charAt(i)==key) {
				System.out.println("C");
				if(s.charAt(i+1)==key2) {
					System.out.println("h");
				}
			}
		}
		//'A' && 

	}

}
