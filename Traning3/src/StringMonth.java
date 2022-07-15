
public class StringMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="12/08/1995";
		
		String months[]= {"jan","feb","Mar", "Apr", "May","Jun","jul","Aug","sep"};
		
		String cut[]=input.split("/");
		//cut[0].contains(input)
		//System.out.println(cut[1]);
		
		int change=Integer.parseInt(cut[1]);
		//System.out.println(change);
		
		String name=months[change-1];
		//System.out.println(name);
		
		String latest=cut[0]+name+cut[2];
		System.out.println(latest);

	}

}
