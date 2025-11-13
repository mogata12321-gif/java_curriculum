package curriculum_B_Q6;

interface Billable {
	int costForDay(int hoursWorked);// 「働いた時間(hoursWorked)を受け取って、1日の費用(costForDay)を整数で返すメソッド」

	String getName();// Mainクラスで出力する際使用するため明記

	String getId();
}