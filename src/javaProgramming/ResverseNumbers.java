package javaProgramming;

import java.util.Scanner;

public class ResverseNumbers {

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Please enter value");
		int num=sc.nextInt();
		
		// Logic 1 using algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);*/
		
		/*int x=10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);*/
		int rows = 5;
	  
			for(int i = rows; i >= 1; --i) {
	            for(int j = 1; j <= i; ++j) {
	                System.out.print(" * " + " ");
	            }
	            System.out.println();
	        }
	}	
		
	

}
