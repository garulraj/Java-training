
public class UppertoLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="arulraj1232";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {

				char c=s.charAt(i);
				System.out.println((char)(c-32));
			}
		}
	}

}
