
public class ArrayMul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,2,3,},{3,4,5},{6,7,8}};
		//int j=1;
		int rowadd=0;
		int coladd=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				rowadd=rowadd+arr[i][j];
				
			}
			System.out.println(rowadd);
			rowadd=0;
			coladd=coladd+arr[i][i];
			System.out.println(coladd);
		}

	}

}
