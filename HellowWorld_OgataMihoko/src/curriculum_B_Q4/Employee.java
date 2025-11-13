package curriculum_B_Q4;

public abstract class Employee {

	private String employeeId;
	private String name;

	public Employee(String id, String name) {// コンストラクタ使用（最初に値を設定したいため）
		this.employeeId = id;
		this.name = name;
	}

	public String getEmployeeIdQ4() {
		return this.employeeId;
	}

	public String getName() {
		return this.name;
	}

	public abstract int calculateDailyWage(int hoursWorked);// 抽象メソッドabstractに変更

}
