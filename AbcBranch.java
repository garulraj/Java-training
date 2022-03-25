public class AbcBranch extends AbcMobileShop
{
int discount;
public AbcBranch(int discount)
{
//super(5);
this.discount = discount;
System.out.println("Branch "+ this.discount);
}
public AbcBranch()
{
super(10);
System.out.println("Tumbler free");
}
public static void main(String[] args)
{

AbcBranch mobile = new AbcBranch();
//AbcBranch iphone = new AbcBranch(10);
}
}