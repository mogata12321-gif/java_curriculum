package curriculum_B;

class MainQ7 {
	public static void main(String[] args) {
		Payable emp1 = new FullTimeEmployeeQ7("正社員太郎", 9);// 実際に正社員クラスの実態を持たせるためemp１設定、型はinterface
		Payable emp2 = new FullTimeEmployeeQ7("正社員花子", 8);
		Payable emp3 = new ContractEmployeeQ7("契約社員次郎", 9);
		Payable emp4 = new ContractEmployeeQ7("契約社員三子", 7);

		SalaryCalculatorQ7 calculator = new SalaryCalculatorQ7();// SalaryCalculatorQ7出力のため実体化変数を設定

		calculator.printDailyPay(emp1, 9);
		calculator.printDailyPay(emp2, 8);
		calculator.printDailyPay(emp3, 9);
		calculator.printDailyPay(emp4, 7);
	}
}
