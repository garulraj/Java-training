
public class ReverseANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no[] = {2,30,71,26,19,0,70,81,9};
		// int reverse.
		
		for(int i=0;i<no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i]>no[j]) {
					int temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}
			}
		}
		
		for(int i=0;i<no.length;i++) {
			System.out.println(no[i]);
		}
	}

}
