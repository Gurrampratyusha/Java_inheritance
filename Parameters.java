package inheritance;

public class Parameters {
       
	public void login(String username,String password)
	{
		System.out.println("enter user name " + username);
		System.out.println("enterpassword " + password);
		System.out.println("sign into mail box ");
	}
	
	
	public void composeEmail(String text)
	{
		System.out.println("compose a n Email with text as:" + text);
	}	
	
	public void logout()
	{
		System.out.println("click on logout button");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameters obj= new Parameters();
		
	       obj.login("aa","bb");
	       obj.composeEmail("cc");
	       obj.logout();
	}

}
