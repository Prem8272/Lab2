package sample;

import java.util.Scanner;

public class relationalOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		a=read.nextInt();
		b=read.nextInt();
		System.out.println("a>b : "+(a>b));
		System.out.println("a<b : "+(a<b));
		System.out.println("a>=b : "+(a>=b));
		System.out.println("a<=b : "+(a<=b));
		System.out.println("a==b : "+(a==b));
		System.out.println("a!=b : "+(a!=b));
		

	}

}
