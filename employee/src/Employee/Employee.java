package Employee;

public class Employee {
	private int iEmpID;
	private String sEmpName;
	private float fAllowance;
	private float fBasicSalary;
	private float fIncomeTax;
	private float fGrossPay;

	Employee(int iID, String sEmpName, float fBasicSalary) {
		this.fBasicSalary = fBasicSalary;
		this.sEmpName = sEmpName;
		iEmpID = iID;

	}

	public float calNetSalary() {
		float fNetPay;
		fAllowance = fBasicSalary * 0.46f;
		System.out.println("Allowances " + fAllowance);
		fGrossPay = fBasicSalary + fAllowance;
		System.out.println("Gross Pay "+fGrossPay);

		if (fGrossPay < 5000f)
			fIncomeTax = fGrossPay * 0;
		else if (fGrossPay > 5000 && fGrossPay <= 10000)
			fIncomeTax = fGrossPay * 0.10f;
		else if (fGrossPay > 10000 && fGrossPay <= 20000)
			fIncomeTax = fGrossPay * 0.20f;
		else
			fIncomeTax = fGrossPay * 0.30f;

		System.out.println("Income Tax Deduction "+fIncomeTax);
		fNetPay = fGrossPay - fIncomeTax;
		System.out.println("Net Pay " + fNetPay);
		return fNetPay;

	}

	public int getiEmpID() {
		return iEmpID;
	}

	public String getsEmpName() {
		return sEmpName;
	}

	public float getfBasicSalary() {
		return fBasicSalary;
	}

	public float displayfAllowance() {
		return fAllowance;
	}

	public float displayfIncomeTax() {
		return fIncomeTax;
	}

	public float displayGrossPay() {
		return fGrossPay;
	}

}
