
class Main
{
	public static void main(String[] args) {
		String name = "suhasnidgundi";
		
		String Fname = "suhas";
		String Sname = "nidgundi";
		int newFName = Fname.length();
		int newSName = Sname.length();
		
		String FullName = Fname.concat(Sname);
		
		System.out.println("1. Length Of String : "+name.length());
		
		String result = (newFName>newSName) ? "First Name is Greater Than Sirname" : "Sirname is Greater Than First Name";
		System.out.println(result);
		
		System.out.println(FullName);
		
	}
}
