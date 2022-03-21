class addition{
int sum = 3;
int s = 1;
public int add_two_int(int a, int b)
{
sum = a+b;
return sum;
}
	System.out.println(addition.sum);

public static void main(String[] args)
{
	addition add = new addition();
	int s = add.add_two_int(1,2);
System.out.println("Sum of two Integer = " +s);
}
}
