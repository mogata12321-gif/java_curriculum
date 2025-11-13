package curriculum_B;

public class FullTimeEmployeeQ5 extends EmployeeQ5 {

	public FullTimeEmployeeQ5(String idQ5, String nameQ5) {
		super(idQ5, nameQ5);
	}

	@Override
	public int calculateDailyWageQ5(int hoursWorked) {// EmployeeQ5を引用している
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);// returnで返す
	}
}
