package LearningJava;

import java.util.Scanner;

public class Palindrom {

 public static void main(String[] args) {
	System.out.println("THis is java");

    String str, rev = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string:");
    str = sc.nextLine();

    int length = str.length();

    for ( int i = length - 1; i >= 0; i-- )
       rev = rev + str.charAt(i);

    if (str.equals(rev))
       System.out.println(str+" is a palindrome");
    else
       System.out.println(str+" is not a palindrome");

 }

 }
	
	
	 
		

