
public class SineX {

	public void display()
	{
		int n=10;
		int i,j, fact, mul = 1;
		fact = 1;
		for(i=1,j=1;i<=n;i++,j+=2)
		{
			System.out.printf("\n %d %d %d %d", i, j, mul,fact);
			mul=mul*-1;
			fact = fact* (j+1);	
			fact = fact* (j+2);			

		}
	}
}
