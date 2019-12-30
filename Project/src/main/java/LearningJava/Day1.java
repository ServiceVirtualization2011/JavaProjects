package LearningJava;
// in here we use this to assign the value otherwise its was not assinged.
public class Day1 {
	
	int a;
	int b;
	public void getdata(int a, int b)
	 	{
	     this.a = a;
	     this.b = b;	   
		}
	public void setdata ()
	{
		System.out.println("The value of variable a ="+a);
		System.out.println("The value of variable a ="+b);
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
 Day1 obj = new Day1();	// init first obj for the class Day1
	obj.getdata(4,6);
	obj.setdata();
 Day1 obj2 = new Day1();   // init second obj of same class
  obj2.getdata(2, 3);
  obj2.setdata();
}
}

