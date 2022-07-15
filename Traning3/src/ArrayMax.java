
public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,4,3,8,1,9};
		int min=arr[0];
		
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println(min);
		
		int max=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}System.out.println("max is"+max);

	}

}
