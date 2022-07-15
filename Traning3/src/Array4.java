
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {10, 20, 35, 550, 888, 98,7};
		int max1=arr[0];
		int max2=0;
		int max3=0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max1) {
				max3=max2;
				max2=max1;
				max1=arr[i];
				
			}else if(arr[i]>max2) {
				max3=max2;
				max2=arr[i];
			}
		}System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);

	}

}
