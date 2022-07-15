import java.util.Scanner;
public class sml {
	int temp,n,sm;


	public void input()
	{
		System.out.print("\n Entert How many numbers:");
		Scanner in =new Scanner(System.in);

		n=in.nextInt();
	
		for(int i=1;i<=n;n++)
		{
			System.out.print("\n?");
			temp=in.nextInt();			
			if(i==1)
			{
				temp=sm;
			}
			else if(temp>sm)
				temp=sm;
				
		}
		System.out.printf("\n The Smalles  numbers is:%d",sm);

		}
	
	
	}


