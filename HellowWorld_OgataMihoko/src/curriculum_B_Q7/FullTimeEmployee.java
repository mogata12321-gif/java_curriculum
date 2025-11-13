package curriculum_B_Q7;

public class FullTimeEmployee extends Employee implements Payable {

	public FullTimeEmployee(String name, int hours) {// SOILDのL、EmployeeQ7を邪魔しないように新しいメソッドを設置
		super(name, hours);
	}

	@Override // interfaceにあるメソッドを上書きするため記入
	public int calculatePay(int hoursWorked) {
		int hourlyRate = 1250;
		int overtime = (hoursWorked < 8) ? hoursWorked : 8;
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
	}
}
//int overtime = Math.max(0, hours - 8);