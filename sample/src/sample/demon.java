package sample;

import java.util.Scanner;

public class demon {
	int a,b;
	Scanner s=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter Two numbers:");
		a=s.nextInt();
		b=s.nextInt();
	}
	void process()
	{
		a++;
		b++;
	}
	void display()
	{
		System.out.println("a:"+a+"b:"+b);
	}
	public static void main(String[] args)
	{
		demon d=new demon();
		d.get();
		d.process();
		d.display();
	}
}
