package Test;

import java.util.Scanner;

public class SwapTwoNumbers {
//	private static Scanner in;

	public static void main (String[] args)
	{
		int x = 15;
		int y = 25;
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After swap x= "+x);
		System.out.println("After swap y= "+y);
		
		int a, b, temp;
		System.out.println("Enter a and b");
		Scanner xx = new Scanner(System.in);
		a = xx.nextInt();
		b = xx.nextInt();
		System.out.println("Number befor swapping\n a =" +a+"\n b =" +b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Number after swapping\n a =" +a+"\n b =" +b);
		xx.close();
	}
	
	
}
