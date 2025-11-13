package curriculum_B;

public class ContractEmployeeQ7 extends EmployeeQ7 implements Payable {

	public ContractEmployeeQ7(String name, int hours) {// コンストラクタ設定
		super(name, hours);
	}

	@Override
	public int calculatePay(int hoursWorked) {// interface引用
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}
