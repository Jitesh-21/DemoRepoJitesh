package javaProgramming;

import java.util.ArrayList;
import java.util.List;

public class TestSizeAndLength {
	
	
	

	public static void main(String[] args) {
		String [] str=new String[10];
		str[0]="Jitesh"; str[1]="Ankur"; str[2]="Subhashis"; str[3]="AJITBHAVLE";
	
		List<String> str2=new ArrayList();
		str2.add("Jitesh");str2.add("Ankur");str2.add("Subhashis");str2.add("AJITBHAVLE");
		String str3= "OakwoodHills";
		
		System.out.println("Lenght of the String Array is "+str.length);
		System.out.println("element of the String Array is  "+str[1].length());
		System.out.println("element of the Collection is  "+str2.size());

	
		
		
	}

}
