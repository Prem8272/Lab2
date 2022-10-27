package sample;

import java.util.Scanner;

public class checkpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p1, p2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Password:");
		p1=sc.next();
		System.out.println("Confirm your password : ");
		p2=sc.next();
		sc.close();
		if(p1.equals(p2)) {
			System.out.println("Confirmed");
			
		}
		else
		{
			System.out.println("not confirmed");
		}

	}
}
