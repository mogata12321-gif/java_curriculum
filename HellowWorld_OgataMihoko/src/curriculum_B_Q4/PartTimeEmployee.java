package curriculum_B_Q4;

public class PartTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1000;//変更できない値を設定

	public PartTimeEmployee(String id, String name) {// コンストラクト設定一度しか入力できない値
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;// PartTimeは働いた数だけなので
	}
}
