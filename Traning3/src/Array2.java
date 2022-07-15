
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,31,5,65,9,5,4};
		int big=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big) {
				big=a[i];
			}
		}			System.out.println(big);


	}

}
