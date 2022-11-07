package sample;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num=p.nextInt();
		if(num%2==0 && num%3==0)
		System.out.println(num+" is Divisible by 2 & 3");
		
		if(num%2==0 || num%3==0)
		System.out.println(num+" is Divisible by 2 or 3");
		
		if(num%2==0 ^ num%3==0)
		System.out.println(num+" is Divisible by 2 or 3,but not both");

	}

}
