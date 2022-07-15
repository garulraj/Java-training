import java.util.Scanner;
public class Hpgr4 {
	int n, i, sum;
	public void integer()
	{
		System.out.print("\n Entet the N value:");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
	}

	public void calc()
	{
		for(i=1;i<=10;i++)
		{   
			//sum =i*n;
			System.out.printf(" \n %d x %d =%d", i, n, i*n);
		}
	}
}
