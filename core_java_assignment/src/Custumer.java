public class Custumer {
	private String name;
	private int bill;
	private Boolean answer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public Boolean getAnswer() {
		return answer;
	}
	public void setAnswer(Boolean answer) {
		this.answer = answer;
	}
	public Custumer(String name, int bill, Boolean answer) {
		super();
		this.name = name;
		this.bill = bill;
		this.answer = answer;
		if(answer==true)
		{
			System.out.println("Enter your bill : ");
			float bill_cus = bill;
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
			float bill0 = bill;
			if(bill0>100)
			{
				double bill1 = Math.floor(bill0/100)*5;
				double bill2 = bill0-bill1;
				System.out.println(name+"," + " your bill is "+bill2);
			}
			else
			{
				System.out.println(name+"," +" your bill is "+bill0);
		
			}

		}
	}
}
