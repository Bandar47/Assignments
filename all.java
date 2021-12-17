package All;

import java.util.Scanner;

/* List down Data Types in Java (with wrapper class name, memory size,
range)
in a tabular format.

byte        byte       1 byte      -128 to 127
short       short      2 bytes     -32,768 to 32,767
int			integer	   4 bytes     -2billion to 2billion
long		long       8 bytes	   -9xxxxxxxx to 9xxxxxxxx
float		float      4 bytes      6 to 7 decimal digits
double 		double     8 bytes      15 decimal digits
char		character  2 bytes      1 signal
String		String     2 bytes      2*depend in each char
bool		boolean    1 bytes	    true or false	*/




public class work {
	
	//Function Definition
	public static int Factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
		//nCr
	public static int nCr(int n , int r)
	{
		int total= Factorial(n)/(Factorial(n-r)*Factorial(r));
		return total;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//print the factorial numbers from other function
		System.out.println("Enter the Function Factorial number");
		System.out.println("Factorial number ="+ Factorial(sc.nextInt()));
		
		
		//Increment and decrement with read data from user
		
		System.out.println("Enter The Number for inc or dec");
		int n;
	    n = sc.nextInt();
	    if(n>=5)
	    {
	    	n++;
	    	System.out.println(n);
	    }
	    
	    else
	    {
	    	n--;
	    	System.out.println(n);
	    }
	    
	    //Normal Factorial
	    
	    int h,fact = 1;
	    System.out.println("Enter Normal Factorial Number");
		int number=sc.nextInt();
		for(h=1;h<=number;h++)
		{
			fact*=h;
			
		}
		System.out.println(fact);
		
		//Multiplication
		System.out.println("Enter Multiplication Number");
		int x=sc.nextInt();
		for(int i=1;i<=5;i++) {
			System.out.println(x+"X"+i+"="+x*i);
		}
		
		//nCr with Factorial 
		System.out.println("Enter N Of nCr");
		int l=sc.nextInt();
		System.out.println("Enter R Of nCr");
		int a=sc.nextInt();
		System.out.println("nCr of the numbers="+nCr(l,a));
	
	}
	/*     
	                               String Concept
	                               --------------
	 In Java, string is basically an object that represents sequence of char values an array 
	 of characters works same as Java string.
     Java String class provides a lot of methods to perform operations on strings                              
	                               
	                               String Pool
	                               -----------
	 String pool is nothing but a storage area in Java heap where string literals stores.
	 It is also known as String Intern Pool or String Constant Pool. It is just like 
	 object allocation. By default, it is empty and privately maintained by the 
	 Java String class. Whenever we create a string the string object occupied some space 
	 in the heap memory. Creating a number of strings may increase the costand memory too 
	 which may reduce the performance also.
	
	*/
	
	
}