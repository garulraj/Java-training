
public class PayilagamPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stu		
		//lcm-3, 6
		/*int no1=3;int no2=6;
		int max= no1>no2?no1:no2;
		//System.out.println(max);
		while(true) {
		if((max%no1==0)&&(max%no2==0)){
			System.out.println(max);
			break;
		}max++;
		}*/	
		/*int no1=12;int no2=30;
		int min=no1<no2?no1:no2;
		//System.out.println(min);
		
		while(min>=2) {
			if((no1%min==0)&&(no2%min==0)) {
				System.out.println("Maximum diviser="+min);
				 break;
			}else
				//System.err.println("n");
			
			min--;
			
		}*/
		//sqr find.		
		/*int no=100;
	    int	i=2;
	    while(true) {
		if(no/i==i) {
			System.out.println(i);
			break;
			//
		}i++;}*/
		/*int i=5;
		int fact=1;
		while(i>=1) {
			
			fact=fact*i;
			i--;
		}System.out.println(fact);*/
		
		//1 4 27 256		
		/*int i=1;
		while(i<=4) {
			System.out.println(Math.pow(i, i));
			i++;
		}*/
		//prime no
		
		int n=3;int m=n-1;
		
		boolean flag=true;
		
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				flag=false;
			}n++;
			if(flag==true) {
				System.out.println(n);
			}
			
		}
		
		
		
		
		
		
		
		
		
		}
	}


