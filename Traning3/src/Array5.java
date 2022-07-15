
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,25,7,13,66};
		int len=arr.length;
		int brr[]=new int[len];
		int j=5;		
			
		for(int i=0;i<arr.length;i++) {	
			System.out.println(arr[i]);
		}
		System.out.println("After reverse da!!");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
