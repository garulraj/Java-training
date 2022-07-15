
public class DesendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using single loop.
		
		int brr[]= {10,24,5,78,55};
		//sort in ascending
		
		for(int i=0;i<brr.length;i++) {
			for(int j=i+1;j<brr.length;j++) {
				if(brr[i]>brr[j]){
					int temp=brr[i];
					brr[i]=brr[j];
					brr[j]=temp;
				}
			}
			
			
		}
		 for(int i=brr.length-1;i>=0;i--) {	
			 System.out.println(brr[i]);
			  
		 }

			
		
		

		
	}

}
