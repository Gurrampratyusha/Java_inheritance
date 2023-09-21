package inheritance;

public class Base {
     
	public void openbrowser(String browser)
	{
		System.out.println("open the chrome browser" +browser);
	}  
	
	public static void login(String username,String password)
	{
		System.out.println("enter user name " + username);
		System.out.println("enterpassword " + password);
		System.out.println("sign into mail box ");
	}
	
	
	public void logout()
	{
		System.out.println("click on logout button");
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
