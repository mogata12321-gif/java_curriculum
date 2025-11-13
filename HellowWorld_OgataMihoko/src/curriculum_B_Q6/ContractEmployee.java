package curriculum_B_Q6;

public class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {// interfaceを適用
		return hoursWorked * 1000;// returnで返す（計算）
	}
}
