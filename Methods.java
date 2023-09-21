package inheritance;

public class Methods {
     
	public void login()
	{
		System.out.println("enter user name ");
		System.out.println("enter password ");
		System.out.println("sign into mailbox");
	}
	
	public void ComposeEmail()
	{
		System.out.println("compose an Email");
	}
	
	public void logout()
	{
		System.out.println("click on login button ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Methods obj = new Methods();
       obj.login();
       obj.ComposeEmail();
       obj.logout();
	}

}
