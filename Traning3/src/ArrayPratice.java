
public class ArrayPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int arr[]= {3,2,5,8,9,1};
		int min = arr[0];
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println(min);*/
		
		int brr[][]= {{10,20,5},
					 {4,12,8},
					 {8,5,15}};
		int row=0; int coladd=0;
		for(int i=0;i<brr.length;i++) {
			int j=0; int k=0;
			for(;j<brr.length;j++) {
				//System.out.print(brr[i][j]+" ");
				 row=row+brr[i][j];				 
				 }coladd=coladd+brr[i][k];
			
			//System.out.println();
			//System.out.println(row);
			row=0;
			System.out.println(coladd);
			coladd=0;
		}

	}

}


