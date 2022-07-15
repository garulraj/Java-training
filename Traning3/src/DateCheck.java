import java.util.Scanner;

public class DateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the date");
		date=in.next();
		int count=0;		
		for(int i=0;i<date.length();i++)
		if(date.charAt(i)=='/')
		{
			count++;
		}		
		
		String s[]=date.split("/");
		
		
		if(count==2) {
		/*System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);*/
		}else
			System.out.println("Invalid input!, Please try again:");
		
		int daate= Integer.parseInt(s[0]);
		int month=Integer.parseInt(s[1]);
		int year=Integer.parseInt(s[2]);
		
		if((daate==0||daate>31)	|| (month==0||month>12) || (year==0||year>2023)){
			System.out.println("Invalid Input!");
		}
		
		else 
			System.out.println("date validated!");

			
		
	}

}
