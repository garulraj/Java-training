import java.util.Scanner;

public class Interactive {
	//int n;

	private Boolean isPrime(int n)
	{
		Boolean isPrime = true;
		
		int upto = (int) Math.sqrt(n);
		for(int i=2; i<=upto;i++)
		if(n %i ==0)
		{
			 isPrime = false;
			 break;
		}
	   return isPrime;
	}
	

	private Boolean fib(int n)
	{
		Boolean fib = false;
		int f1=1, f2=1;
		int f;
		while(f2<=n)
		{
			if(n==f2)
			{
				fib = true;
				break;
			}
				f=f1+f2;
				f1=f2;
				f2=f;
				
		}
		return fib;
		
	}
	public void start()
	{
		int n;
	do{
		System.out.print("\n Entert the no:\n");
		Scanner in=new Scanner(System.in);		
		n=in.nextInt();
		if(n==0)
		{
			System.out.print("Thank you");
			break;
		}
		if(isPrime(n))
			System.out.printf("\n %dIts Prime number", n);
		else
			System.out.printf("\n %dIts Not Prime number", n);
		
		if(fib(n))
			System.out.printf("\n %dIts fib number", n);
		else
			System.out.printf("\n %dIts Not fib number", n);
	}while(n!=0);
	}
}
