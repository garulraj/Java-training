
public class muk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3};
		int [] b = {5,6,7,8,4};
		
		int len1 = a.length;
		int len2 = b.length;
		int big = len1>len2?len1 :len2;
		int small = len1<len2?len1: len2;
		
		int [] c = new int[big];
		int i;
		
		for(i=0;i<small;i++)
		{
			c[i] = a[i] * b[i];
			System.out.println(c[i]);

		}
		/*c[3] = b[3];
		c[4] = b[4];		
		
 		for(i=0;i<c.length;i++);
		{
			System.out.println(c[i]);

		}*/
		if(a.length>b.length)
			c[c.length-1] = a[a.length-1];
		else if(b.length>a.length)
			c[c.length-1] = b[b.length-1];
		
		for(i=0;i<c.length;i++);
		{
			System.out.println(c[i]);

		}
	}





	}


