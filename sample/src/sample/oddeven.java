package sample;

import java.util.Scanner;

public class oddeven {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    System.out.println("Enter a number: ");
    Scanner ob=new Scanner(System.in);
    n=ob.nextInt();
    if(n%2==0)
    {
    	System.out.println("the Entered number "+n+" is Even");
    }
    else
    	System.out.println("The Entered number "+n+" is Odd");

	}

}
