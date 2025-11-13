package curriculum_B_Q7;

public class ContractEmployee extends Employee implements Payable {

	public ContractEmployee(String name, int hours) {// コンストラクタ設定
		super(name, hours);
	}

	@Override
	public int calculatePay(int hoursWorked) {// interface引用
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}
