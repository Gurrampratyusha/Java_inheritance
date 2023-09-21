package inheritance;

public class HomePage extends Base {
      
	public void HomePagetest()
	{
		System.out.println("test for home page");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HomePage obj = new HomePage();
      obj.openbrowser("chrome");
      login("admin", "admin");
      obj.HomePagetest();
      obj.logout();
}

}
