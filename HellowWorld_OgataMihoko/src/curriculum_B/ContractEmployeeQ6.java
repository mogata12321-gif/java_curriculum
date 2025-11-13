package curriculum_B;

public class ContractEmployeeQ6 extends EmployeeQ6 {
	public ContractEmployeeQ6(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {// interfaceを適用
		return hoursWorked * 1000;// returnで返す（計算）
	}
}
