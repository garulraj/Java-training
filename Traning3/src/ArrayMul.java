import java.util.Scanner;

public class ArrayMul {

	

	  public static int StringChallenge(String str) {
	    // code goes here  
	int count=0;
	    for(int i=0;i<str.length();i++){

	      if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	    {
	      count++;
	    }
	    }//System.out.println(count);


	    return count;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.println("Please enter the str:");
	    System.out.print(StringChallenge(s.nextLine())); 
	    //System.out.println(count);
	  }

	}