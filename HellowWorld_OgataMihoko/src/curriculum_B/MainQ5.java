package curriculum_B;

import java.util.ArrayList;// ArrayListのパッケージ使用を宣言
import java.util.List;// Listのパッケージ使うことを宣言

public class MainQ5 {
	public static void main(String[] args) {
		List<EmployeeQ5> employees = new ArrayList<>();//employeesという変数を設定（インスタンス化するため）
		employees.add(new FullTimeEmployeeQ5("E001", "正社員太郎"));// 新しくインスタンスを作成Employeeの変数id,nameQ5に入力
		employees.add(new FullTimeEmployeeQ5("E002", "正社員花子"));
		employees.add(new ContractEmployeeQ5("C001", "契約社員次郎"));
		employees.add(new ContractEmployeeQ5("C002", "契約社員三子"));
		/*
		FullTimeEmployee full = new FullTimeEmployee("E001", "正社員太郎");
		ContractEmployee cont = new ContractEmployee("C001", "契約社員花子");
		でもいいが、サブクラスを個別に扱うことになってしまうためこの問題では使用不可
		*/

		for (EmployeeQ5 emp : employees) {// EmployeeQ5はクラスとして作成したがサブクラスを作ったことにより型として使用可能
			int salary = emp.calculateDailyWageQ5(9);//
			System.out.println(emp.nameQ5 + " さんの日給は " + salary + " 円です。");
		}
	}

}
