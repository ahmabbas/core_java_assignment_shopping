public class Employee{
	private int bill;
	private String name;


	public Employee(String name, int bill) {
		super();
		this.bill = bill;
		this.name = name;
		float bill_emp = bill;
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
	}

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


}
