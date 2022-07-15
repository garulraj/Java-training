import java.util.Arrays;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[]= {1,2,3,6,0,4,5};
		sorting(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.);
		}				
		
	
		private static int[] sorting(int arr[]) {
		// TODO Auto-generated method stub

		//```	int arr[]= {10,20,5, 9, 35,15};
			
			for(int i=0;i<arr.length-1;i++) {
				
				if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i=-1;
				}
		
	}
			return arr;
}	}
