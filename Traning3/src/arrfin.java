import java.util.Scanner;
public void arrfin {

 
	
	   public static void main(String[] args)
	   {
	      int N, original, remove, last=0;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Number: ");
	      N= scan.nextInt();
	      
	      original = N;
	      while(N>0)
	      {
	         remove = num%10;
	         last = (last*10) + remove;
	         N = N/10;
	      }
	      
	      if(original==last)
	         System.out.println("\nYes, the number is equal to its reverse.");
	      else
	         System.out.println("\nNo, the number is not equal to its reverse.");
	   }
	}


