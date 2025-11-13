package curriculum_B_Q7;

class Main {
	public static void main(String[] args) {
		Payable emp1 = new FullTimeEmployee("正社員太郎", 9);// 実際に正社員クラスの実態を持たせるためemp１設定、型はinterface
		Payable emp2 = new FullTimeEmployee("正社員花子", 8);
		Payable emp3 = new ContractEmployee("契約社員次郎", 9);
		Payable emp4 = new ContractEmployee("契約社員三子", 7);

		SalaryCalculator calculator = new SalaryCalculator();// SalaryCalculatorQ7出力のため実体化変数を設定

		calculator.printDailyPay(emp1, 9);
		calculator.printDailyPay(emp2, 8);
		calculator.printDailyPay(emp3, 9);
		calculator.printDailyPay(emp4, 7);
	}
}
