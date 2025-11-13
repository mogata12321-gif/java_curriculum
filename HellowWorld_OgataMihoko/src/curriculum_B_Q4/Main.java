package curriculum_B_Q4;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee full = new FullTimeEmployee("E100", "正社員太郎");// FullTimeEmployeeのインスタンスを作りたいため変更できない値設定
		PartTimeEmployee part = new PartTimeEmployee("P200", "パート花子");// 変更できない値設定

		System.out.println("正社員の給与: " + full.calculateDailyWage(9) + "円");// 9時間働いた場合
		System.out.println("パート社員の給与: " + part.calculateDailyWage(9) + "円");
	}
}
