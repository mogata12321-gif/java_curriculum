package curriculum_B;

public abstract class Employee {
	// Q1
	String name;

	public void work() {
		System.out.println(name + "は働いています");
	}

	// Q2
	String employeeId;
	String nameQ2;

	public void showInfo() {
		System.out.println("社員ID:" + employeeId + ",名前:" + nameQ2);
	}

	// Q3
	private String employeeIdQ3;
	private String nameQ3;

	public void setEmployeeId(String id) {// ID のカプセル化
		this.employeeIdQ3 = id;
	}

	public String getEmployeeId() {
		return this.employeeIdQ3;
	}

	public void setNameQ3(String name) {// 名前のカプセル化
		this.nameQ3 = name;
	}

	public String getNameQ3() {
		return this.nameQ3;
	}

	// Q4
	private String employeeIdQ4;
	private String nameQ4;

	public Employee(String id, String name) {// コンストラクタ使用（最初に値を設定したいため）
		this.employeeIdQ4 = id;
		this.nameQ4 = name;
	}

	public String getEmployeeIdQ4() {
		return this.employeeIdQ4;
	}

	public String getNameQ4() {
		return this.nameQ4;
	}

	public abstract int calculateDailyWage(int hoursWorked);// 抽象メソッドabstractに変更

}
