
public class PattenJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int row=0;row<5;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print("* ");
			}System.out.println();
		}*/
		
		for(int col=5;col>0;col--) {
			for(int row=5;row<col;row--) {
				System.out.print(" *");
			}System.out.println();
		}
		
		
	}

}
