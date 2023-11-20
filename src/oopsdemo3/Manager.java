package oopsdemo3;

public class Manager extends Employee{
	private String department;
	public Manager(String name, double basic, String address,String dpt) {
		super(name, basic, address);
		this.department=dpt;
	}

	@Override
	double totalpay() {
		double totalAmount = 0;
        double houseRentAllowance = (basic * 0.08);
        double dearnessAllowance = (basic * 0.3);
        double medicalAllowance = 1500;
        totalAmount = basic + houseRentAllowance
        + dearnessAllowance + medicalAllowance;
        return totalAmount;
	}
	
	void show() {
		super.show();
		System.out.println("Departmemt:\t\t"+department);
	}

}
