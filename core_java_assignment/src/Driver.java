import java.util.Scanner;

import Employee;
import Affliate;
import Custumer;

public class Driver {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		System.out.println("Hello "+name+","+ " please choose your category: ");
		System.out.println("1.Employee of the store\n2.Affliate of the store\n3.Customer");
		int response=input.nextInt();
		System.out.println("Are you a customer over 2 years, enter true/false:\n1.True \n2.False");
		Boolean answer = input.nextBoolean();
		System.out.println("Enter your bill: ");
		int bill = input.nextInt();
		if (response==1) {
			Employee cart = new Employee(name, bill);
		}
		else if (response==2) {
			Affliate cart = new Affliate(name, bill);
		}
		else if (response==3) {
			Custumer cart = new Custumer(name, bill, answer);
			
		}
	}
}
