package curriculum_B_Q6;

public class FullTimeEmployee extends Employee {
	// EmployeeQ6を作るときにidとnameを受け取って自分自身のidとnameに設定する
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {// interfaceを使用
		int hourlyRate = 1250;
		int overtime = (hoursWorked - 8 > 0) ? hoursWorked - 8 : 0;// 三項演算子使用
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
		// returnを返したいから（計算結果をinterfaceに返したいから）上記の計算を作成
	}
}