
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,2,3},
					  {4,5,6},
					  {7,8,9}};
		
		int tr[][]=new int [3][3];
		
		/*for(int i=0;i<3;i++) {
			for(int j=2;j>=0;j--) {
				System.out.print(arr[i][j]);
			}System.out.println();
		}*/
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		System.out.print(tr[i][j]=arr[j][i]);
				
			}System.out.println();
		}
		
		
	}

}
