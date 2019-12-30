package LearningJava;

public class Palindrom2 {

	public static  void reverse (String str ) 
	{
		
		String rev="";
		System.out.println(str);
		int length = str.length();
		System.out.println("The length of string is:" + length);
		
		
		for ( int i = length - 1; i >= 0; i-- )
		       rev = rev + str.charAt(i);
///retrun rev;
		    if (str.equals(rev))
		       System.out.println(str+" is a palindrome");
		    else
		       System.out.println(str+" is not a palindrome");
		    
	}
	
	public static void compareStr(String a , String b)
	{
		 if (a.equals(b))
		       System.out.println(a+" is equal to" + b);
		    else
		       System.out.println(a+" is not equal to" + b);
		   
	}
	
	public static void main(String[] args) {
		 reverse("Automation");
		compareStr("radar","");
			}

	
}
