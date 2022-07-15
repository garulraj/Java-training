
public class TransPoseM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}*/		
		int arr[][]= {{12,18,15},
					  {32,21,14},
					  {24,31,10}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}System.out.println();
		}

	}

}
