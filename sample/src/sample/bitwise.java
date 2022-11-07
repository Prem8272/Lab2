package sample;

import java.util.Scanner;

public class bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner rel=new Scanner(System.in);
		System.out.println("Enter the value for a and b: ");
		a=rel.nextInt();
		b=rel.nextInt();
		System.out.println("a & b: " +(a&b));
		System.out.println("a | b: " +(a|b));
		System.out.println("a ^ b: " +(a^b));
		System.out.println("-a: " +(-a));
		System.out.println("-b: " +(-b));
	

	}

}
