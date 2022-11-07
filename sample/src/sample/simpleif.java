package sample;

import java.util.Scanner;

public class simpleif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=s.nextInt();
		if((num%5)==0)
		{
			System.out.println("We are inside the if-block");
			System.out.println("Given number is divisble by 5!");
		}
		System.out.println("We are outside the if-block!");
		

	}

}
