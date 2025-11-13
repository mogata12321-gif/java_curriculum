package curriculum_B_Q5;

public class ContractEmployee extends Employee {
	public ContractEmployee(String idQ5, String name) {
		super(idQ5, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}
