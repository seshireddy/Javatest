package firstpak;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.*;

public class hello {
	public static void main(String[] args)
	{
	
		//welcome();
		//algebra();
		//weight();
		//speed();
		//cigar();
		//algorithm();
		pyramid();
		//Scanner in = new Scanner(System.in);	
		//while(true)
		//{
		//	int done = in.nextInt();
		//	if(done == 2)
		//		break;
		//}
		//System.out.println("we are done");
		System.exit(0);
	}
	public static void welcome(){
		String greeting = "Welcome to Jaca!";
		System.out.println(greeting);
		for (int i = 0; i < greeting.length(); i++) {
			System.out.println(i);
		}
		System.out.println();
	    

		JOptionPane.showMessageDialog(null, "hello Hao");
		JOptionPane.showMessageDialog(null, "goodbye");
	}
	public static void algebra(){
		//int variable1, variable2=97;
		int a=4, b=9, c=3, d=2;
		int x=a+b/c*d-a*c/2; 
		System.out.println("the value is:"+x);
	}
	public static void weight(){
		
		float mass= Float.valueOf(JOptionPane.showInputDialog(null,"Please input the value"));
		float pound= 0.45359237f*mass;
		float stone=14*pound;
		System.out.println("The mass in Kilo is:" + mass);
		System.out.println("The mass in pound is :"+pound);
		System.out.println("The mass in stone is :"+stone);
	}
	public static void speed(){
		System.out.println("what's the current speed?");
		float current=Float.valueOf(JOptionPane.showInputDialog(null,"please input your current speed"));
		System.out.println("what's speed limit?");
		float limit=Float.valueOf(JOptionPane.showInputDialog(null,"Please input your limit"));
		if (current > limit)
			System.out.println("warning, the speed should decrease:"+(current-limit));
	}
	public static void cigar(){
		int age= Integer.valueOf(JOptionPane.showInputDialog(null,"Please input your age"));
				if(age < 18)
					System.out.println("You are too young to buy it");
				else if(age<25&& age>18)
					System.out.println("Please show your ID");
				else 
					System.out.println("feel free to buy it");
	}
	public static void algorithm(){
		int n=Integer.valueOf(JOptionPane.showInputDialog(null,"Please input value for n"));
		while (n>1) {
			System.out.println("The value is:"+n);
			if(n%2==0)
				n=n/2;
			else if (n%2 != 0)
				n=(n*3)+1;
		}
		
	}
	public static void pyramid(){
		int n=Integer.valueOf(JOptionPane.showInputDialog(null,"What height do you want?"));
		for (int i = 1; i<2*n; i +=2) {
			
			for (int k=0; k<(2*n-i/2); k++){
			System.out.print(" ");
					
			}
			for (int j=0; j<1; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

