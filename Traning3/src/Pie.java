
public class Pie {
	public void display()
	{
	
		double pi=0;
		int mf=1;
		int i, j;
		for(i=1, j=1;i<=100;i++, j+=2)
		{
			pi=pi + (mf)*(4.0/j);
			
			mf=mf*-1;
		
		}
        System.out.printf("\n %f ",pi);

	}

}
