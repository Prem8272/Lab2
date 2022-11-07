package sample;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p=new Scanner(System.in);
		System.out.println("Enter any number to check its Odd or even: ");
		int num=p.nextInt();
		if((num%2)==0)
		{
			System.out.println("We are inside the true-block!");
			System.out.println("Given number is Even number!");
		}
		else
		{
			System.out.println("We are inside the false-block!");
			System.out.println("Given number is ODD number!");
		}
		System.out.println("we are outside the if block!");

	}

}
