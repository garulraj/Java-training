import java.util.Scanner;

public class h2 {
	int n;
public void Solution() {
    
        System.out.print("Enter N value:");
        Scanner in= new Scanner(System.in);
        n = in.nextInt();
         
            /*if(n%2!=0)
            System.out.println("Weird");
            else if(n==2 || n==4)
            System.out.println("Not Weird");
            else if(n>=6 && n<=20)
            	if(n%2==0) {
            System.out.println("Weird");
            	}
            else if((n>=20 && n%2==0)&&(n==2 || n==4))
            System.out.println("Not Weird");*/
        
        if((n%2==1)||(n==2 || n==4))
        	  System.out.println("Weird");
        else
        	  System.out.println("Not Weird");
        

        
    }
}


