package curriculum_B;

public abstract class EmployeeQ7 implements Payable {
	// 全社員が「名前」と「労働時間」を必ず持つため抽象クラスでまとめる
	protected String name;
	protected int hours;

	public EmployeeQ7(String name, int hours) {// このクラスのコンストラクタ作成
		this.name = name;
		this.hours = hours;
	}

	public String getName() {// interfaceで作成したgetNameを実体化
		return name;
	}
}
// public abstract int calculateDailyWageQ5(int hoursWorked);これはinterfaceに含んでいるため記入不必要
