package curriculum_B;

class SalaryCalculatorQ7 {
    public void printDailyPay(Payable employee, int hoursWorked) {// printDailyPayというメソッドを作成　Payableが実装されているため
        int salary = employee.calculatePay(hoursWorked);// このemployeeはPayableの型を引き継いでる実際には FullTimeContractのcalculatePay()
        System.out.println(employee.getName() + " さんの日給は " + salary + " 円です。");
    }
}
// 責任を分けて、保守しやすくするためこのクラスを作成　計算と表示方法のみ作成のため返り値なし