package selfintroduction;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);
		Person person2 = new Person("尾形美帆子", 15, 1.8, 100.0);
		
		// 情報を出力
		person1.print();
		person2.print();
		
		// 人数の合計を出力（ここでは2人）
		Person.printCount();
	}
}