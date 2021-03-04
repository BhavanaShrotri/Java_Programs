/******************************************************************************

                           String Buffer Operations

*******************************************************************************/

public class SBuffer
{
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Namaste India");
		System.out.println("String : "+s);
		int a=s.length();
		System.out.println("Length of String : "+a);
		s.reverse();
		System.out.println("Reverse String : "+s);
		String s1=new StringBuffer(s).reverse().toString();
		System.out.println("New String : "+s1);
		System.out.println(s1.equals(s));
		s.reverse().insert(8,"🙏  ");
		System.out.println("Insert to String : "+s);
		s.append(" 😊");
	  	System.out.println("Append to String : "+s);
	    
	}
}