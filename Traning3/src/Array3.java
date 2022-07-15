
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//second max;
		
		int arr[]= {10, 25, 55, 7, 65,33};
		
		int max1 =arr[0];
		int max2=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(max1<arr[i]) {
				arr[i]=max2;
			}
			
		}System.out.println(max1);
		System.out.println(max2);

	}

}
