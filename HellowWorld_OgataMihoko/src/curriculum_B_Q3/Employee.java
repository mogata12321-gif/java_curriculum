package curriculum_B_Q3;

public class Employee {
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
}
