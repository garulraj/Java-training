
public class dev {

	public static void main(String[] args) 
	{
		dev de=new dev();
		de.sort1();
		
	}
		public void sort1()
		   {
		     int a[]={5,37,6,42,4,43,1};

		     int temp = 0;
		     int j=0;
		     for(int i = 0 ; i< a.length-1 ; i++)
		     {
		         boolean flag = false;
		         if(a[i]>a[i+1])
		         {
		             temp = a[i];
		             a[i] = a[i+1];
		             a[i+1] = temp;
		             flag = true;
		         }       
		         if(i == 7-2-j)
		         {
		             if(!flag) break;
		             i = -1;
		             j++;
		         }
		     }
		     
		     //print
		     for(int i = 0 ; i< a.length-1 ; i++) {
		       System.out.println(a[i]);
		   }

	}

}
