package curriculum_B;

public class FullTimeEmployeeQ7 extends EmployeeQ7 implements Payable {

	public FullTimeEmployeeQ7(String name, int hours) {// SOILDのL、EmployeeQ7を邪魔しないように新しいメソッドを設置
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