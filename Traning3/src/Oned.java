
public class Oned {
	private int []a;
	
	public Oned()
	{
		a = new int[] {10,20,30,40,50};
				
	}

	public void min()
	{
		int max;
		int min;
		
		max=a[0];
		
		min=a[0];
		
		for(int i=0;i<5;i++)
		{
			if(min>a[i])
				min=a[i];
			

			if(max<a[i])
				max=a[i];
			
		}
			System.out.printf("\n %d", min);
			System.out.printf("\n %d", max);

			
			
		
			
	}
}
