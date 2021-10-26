public class Affliate {
	private String name;
	private int bill;
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
	public Affliate(String name, int bill) {
		super();
		this.name = name;
		this.bill = bill;
		float bill_afe = bill;
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
	}

}
