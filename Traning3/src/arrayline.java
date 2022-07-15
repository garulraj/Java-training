
public class arrayline {
	public static void main(String[] args)
	{
		int [] a= {10, 20, 30};
		int [] b = {40,50};
		int i;

		int len = a.length + b.length;
		int [] c = new int[len];
		
		// switching the values.
		
		for(i=0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		int j=0;
		for(i=a.length;i<c.length;i++)
		{
			c[i] = b[j];
			j++;
		}
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
