package Q21;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) 
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter your name: ");
			String name = input.nextLine();
			System.out.println("Hello "+name+","+ " please choose your category: ");
			System.out.println("1.Employee of the store\n2.Affliate of the store\n3.Customer");
			int n0=input.nextInt();
			switch(n0)
			{
				case 1:
				System.out.println("Enter your bill: ");
				float bill_emp = input.nextFloat();
				double bill_e0 = bill_emp-(bill_emp*0.3);
				if(bill_e0>100)
				{
					double bill_e1 = Math.floor((bill_e0/100)*5);
					double bill_e2 = bill_e0-bill_e1;					
					System.out.println(name+" Your bill is "+bill_e2);
				}
				else
				{
					System.out.println(name+" Your bill is "+bill_e0);
				}
				break;
				
			case 2:
				System.out.println("Enter your bill: ");
				float bill_afe = input.nextFloat();
				double bill_a0 = bill_afe-(bill_afe*0.1);
				if(bill_a0>100)
				{
					double bill_a1 = Math.floor((bill_a0)/100)*5;
					double bill_a2 = bill_a0-bill_a1;
					System.out.println(name+" Your bill is "+bill_a2);
				}
				else
				{
					System.out.println(name+" Your bill is "+bill_a0);
				}
				break;
				
			case 3:
				System.out.println("Are you a customer over 2 years:\n1.True \n2.False");
				Boolean answer = input.nextBoolean(); 
				if(answer==true)
				{
					System.out.println("Enter your bill : ");
					float bill_cus = input.nextFloat();
					double bill_c0 = (bill_cus*0.95);
						if(bill_c0>100)
						{							
							double bill_c1 = Math.floor(bill_c0/100)*5;
							double bill_c2 = bill_c0-bill_c1;
							System.out.println(name+"," + "You get 5% discount for being a loyal custumer: "+bill_c2);
						}
						else
						{
							System.out.println(name+","+ "You get 5% discount for being a loyal custumer: "+bill_c0);
						}
				}		
				if(answer==false)
				{
					System.out.println("Enter your bill amount: ");
					float bill0 = input.nextFloat();
					if(bill0>100)
					{
						double bill1 = Math.floor(bill0/100)*5;
						double bill = bill0-bill1;
						System.out.println(name+"," + " your bill is "+(bill0-bill1));
					}
					else
					{
						System.out.println(name+"," +" your bill is "+bill0);
						break;
						
					}
				}
			}
				
		}
}

