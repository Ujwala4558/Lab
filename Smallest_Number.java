package Abc;

	import java.util.Scanner;
	public class Smallest_Number
	{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the Number 1 : ");
			double n1 = input.nextDouble();
			System.out.print("Enter the Number 2 : ");
			double n2 = input.nextDouble();
			System.out.print("Enter the Number 3 : ");
			double n3 = input.nextDouble();
			System.out.print("The smallest value is " + Math.min(Math.min(n1, n2), n3));
		}	
	}

