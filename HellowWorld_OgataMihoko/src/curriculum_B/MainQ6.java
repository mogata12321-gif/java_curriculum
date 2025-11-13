package curriculum_B;

import java.util.ArrayList;// import明記必要
import java.util.List;

public class MainQ6 {
	public static void main(String[] args) {
		List<Billable> employees = new ArrayList<>();// インスタンス化するためにemployees作成、interfaceをリスト化

		employees.add(new FullTimeEmployeeQ6("E001", "正社員太郎"));// リスト化
		employees.add(new FullTimeEmployeeQ6("E002", "正社員花子"));
		employees.add(new ContractEmployeeQ6("C001", "契約社員次郎"));
		employees.add(new ContractEmployeeQ6("C002", "契約社員三子"));

		for (Billable emp : employees) {// for-eatch文使用
			int salary = emp.costForDay(9);
			System.out.println(emp.getName() + " さんの日給は " + salary + " 円です。");
		}
	}
}