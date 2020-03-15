package javaProgramming;

public class Swapping {

	public static void main(String[] args) {
		 int a=10 , b=20;
		 
		 //logic 1 with third variable
		 
		 /*System.out.println("Befoer swapping a is "+a+" and b is "+b);
		 int t=a;
		 a=b;
		 b=t;
		 System.out.println("After swapping a is "+a+" and b is "+b);*/
		 
		 //-----------------------------------------------------------
		 
		//logic 2 without third variable
		 
		 /*System.out.println("Befoer swapping a is "+a+" and b is "+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After swapping a is "+a+" and b is "+b);*/
		 
		//-----------------------------------------------------------
		 
			//logic 3 without third variable
		 
		 /*System.out.println("Befoer swapping a is "+a+" and b is "+b);
		 
		 a=a*b;
		 b=a/b;
		 a=a/b;
		 System.out.println("After swapping a is "+a+" and b is "+b);*/
			 
		//-----------------------------------------------------------
		 
			//logic 4 single line
		 
		 System.out.println("Befoer swapping a is "+a+" and b is "+b);
		 
		b=a+b-(a=b);
		
		 System.out.println("After swapping a is "+a+" and b is "+b);
		 
	}

}
