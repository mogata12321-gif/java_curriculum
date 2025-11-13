package curriculum_B;

public class FullTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1200;// 全インスタンスで同じ値を共有し、定数にしたいためfinal必要

	public FullTimeEmployee(String id, String name) {// IDと名前は変更できない値のためコンストラクタ使用
		super(id, name);// FullTimeEmployee を作るとき、Employee に必要な初期化処理は親に任せる
	}

	@Override // abstractを返したよということをわかりやすくするため記入
	public int calculateDailyWage(int hoursWorked) {
		int baseHours = (hoursWorked < 8) ? hoursWorked : 8;// 三項演算子使用
		int overtimeHours = (hoursWorked - 8 > 0) ? hoursWorked - 8 : 0;

		return baseHours * HOURLY_RATE + (int) (overtimeHours * HOURLY_RATE * 1.25);
		//overtimeHoursは少数になる可能性あるため(int)で明示的変換必要
	}
}
