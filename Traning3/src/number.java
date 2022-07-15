
public class number {

	public void input()
	{
		int n=10;
		int i,j,k=1;
		
		//how many times loop need to run.
		
		for(i=1;i<=n;i++)
		{
			//Printing new line.
			System.out.print("\n");
			//print space.
			
			for(j=1; j<=n-i;j++)
				System.out.print(" ");

			for(j=1,k=i;j<=i;j++,k++)
	
			System.out.printf("%d",k%10);
			
			//printing other side.
			for(j=1, k-=2; j<i;j++, k--)
				System.out.printf("%d",k%10);
			

		}
		
	}
}
