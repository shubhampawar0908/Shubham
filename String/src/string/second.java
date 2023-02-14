package string;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		
		
		System.out.println("Enter State:");
		Scanner sc =new Scanner(System.in);
		String state=sc.next();
		
		state.toLowerCase();
		
		
		if(state.equals("Maharashtra"))
		{
			System.out.println("Maharshtra- namaskar maharashtrian");
		}
		else if (state.equals("Karnataka"))
		{
			System.out.println("Namaskaram kannadiga");
		}
		else if (state.equals("Andhrapradesh"))
		{
			System.out.println("Vanakkam Madrasi");
		}
		else
		{
			System.out.println("Application not support for"+" "+state);
		}
		
		
		

	}

}
