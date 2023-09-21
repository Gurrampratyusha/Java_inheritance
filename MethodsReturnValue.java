package inheritance;

public class MethodsReturnValue {
     int x=100;
     String str = "java";
	public int sum()
	{
		int a=10;
		int b=20;
		int result = a+b;
		return result;
	} 
	
	public String concatmethod()
	{
		String str1 = "selenium";
		String str2 = "training";
		String result = str1+str2;
		return result ; 
	} 
	
	public void printmethod()
	{
		System.out.println("global interger valuue " +x);
		System.out.println("global string value " +str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsReturnValue obj = new MethodsReturnValue();
		System.out.println(obj.concatmethod());
		//System.out.println(obj.sum());
		 int value = obj.sum();
		 System.out.println(value);
		obj.printmethod();
	}

}
