import java.util.Arrays;

public class LoopSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,4,1,9,7,5};
		
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				i=-1;
			//System.out.println(arr[i]);	
		
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
