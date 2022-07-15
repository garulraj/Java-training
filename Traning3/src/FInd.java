import java.util.Scanner;
public class FInd {
   int smallest,hig;
	public void least()
	{
		int n;
		System.out.print("Entert How many Numbers please:");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int temp;
			System.out.print("\n?");
			temp=in.nextInt();
			
			if(i==1)
				smallest = temp;
			else
			{
				if(smallest>temp)
					smallest=temp;
			}
			if(i==1)
				hig=temp;
			else {
				if(hig<temp) {
					hig=temp;
				}
			}
		
	}
		System.out.printf("\n %d %d",smallest,hig);

	}
	
}
