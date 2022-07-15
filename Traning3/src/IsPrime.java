import java.util.Scanner;
public class IsPrime {
	int n,i,j;
	public void getinput()
	{
	   System.out.print("Entert the number:");
       Scanner in = new Scanner(System.in);
       n=in.nextInt();
	}
	

		public Boolean Isprime(n)
			{
			Isprime upto =Math.sqrt(n);
			Boolean Isprime=True;
			for(i=2;i<=upto;i++)
			{
				if(i%n==0)
				{
					Booleaan Isprime=false;
					break;
				
					}
			}
			
			public void out()
			{
			for(i=1,j=1;i<=n;j++)
				if(Isprime(j))
				{
					i++;
				}
			System.out.printf("%d", j);
			}
			}



