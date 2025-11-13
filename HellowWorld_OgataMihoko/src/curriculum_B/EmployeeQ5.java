package curriculum_B;

public abstract class EmployeeQ5 {
	protected String id;
	protected String nameQ5;

	public EmployeeQ5(String idQ5, String nameQ5) {
		this.id = idQ5;
		this.nameQ5 = nameQ5;
	}

	public abstract int calculateDailyWageQ5(int hoursWorked);
}
