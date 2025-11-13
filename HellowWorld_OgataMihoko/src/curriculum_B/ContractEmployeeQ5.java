package curriculum_B;

public class ContractEmployeeQ5 extends EmployeeQ5 {
	public ContractEmployeeQ5(String idQ5, String nameQ5) {
		super(idQ5, nameQ5);
	}

	@Override
	public int calculateDailyWageQ5(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}
