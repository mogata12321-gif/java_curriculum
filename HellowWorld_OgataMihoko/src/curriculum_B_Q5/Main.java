package curriculum_B_Q5;

import java.util.ArrayList;// ArrayListのパッケージ使用を宣言
import java.util.List;// Listのパッケージ使うことを宣言

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();//employeesという変数を設定（インスタンス化するため）
		employees.add(new FullTimeEmployee("E001", "正社員太郎"));// 新しくインスタンスを作成Employeeの変数id,nameQ5に入力
		employees.add(new FullTimeEmployee("E002", "正社員花子"));
		employees.add(new ContractEmployee("C001", "契約社員次郎"));
		employees.add(new ContractEmployee("C002", "契約社員三子"));
		/*
		FullTimeEmployee full = new FullTimeEmployee("E001", "正社員太郎");
		ContractEmployee cont = new ContractEmployee("C001", "契約社員花子");
		でもいいが、サブクラスを個別に扱うことになってしまうためこの問題では使用不可
		*/

		for (Employee emp : employees) {// EmployeeQ5はクラスとして作成したがサブクラスを作ったことにより型として使用可能
			int salary = emp.calculateDailyWage(9);//
			System.out.println(emp.name + " さんの日給は " + salary + " 円です。");
		}
	}

}
