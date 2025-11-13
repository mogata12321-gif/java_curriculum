package curriculum_B_Q6;

import java.util.ArrayList;// import明記必要
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Billable> employees = new ArrayList<>();// インスタンス化するためにemployees作成、interfaceをリスト化

		employees.add(new FullTimeEmployee("E001", "正社員太郎"));// リスト化
		employees.add(new FullTimeEmployee("E002", "正社員花子"));
		employees.add(new ContractEmployee("C001", "契約社員次郎"));
		employees.add(new ContractEmployee("C002", "契約社員三子"));

		for (Billable emp : employees) {// for-eatch文使用
			int salary = emp.costForDay(9);
			System.out.println(emp.getId() + "：" + emp.getName() + " さんの日給は " + salary + " 円です。");
		}
	}
}