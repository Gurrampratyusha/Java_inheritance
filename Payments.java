package inheritance;

public class Payments extends HomePage {
      public void payments()
      {
    	  System.out.println("test payments page");
    	 
      }
      
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Payments obj = new Payments();
      obj.openbrowser("chrome");
      login("admin", "admin@123");
      obj.HomePagetest();
      obj.payments();
      obj.logout();
	}

}
