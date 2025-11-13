package curriculum_B;

public class Main {

	public static void main(String[] args) {
		// Q4：呼び出し
		Greeting hello = new Greeting(); // ← newでインスタンス作成
		hello.sayHello();

		// Q5：呼び出し
		// Animal のインスタンス（実体）を作成
		Animal lion = new Animal();//lionと言う変数を設定、new Animalと言うオブジェクトを作ると宣言

		// setter で値を入れる
		lion.setName("ライオン");//ライオンを入力する
		lion.setLength(2.1);
		lion.setSpeed(80);

		// getter で値を取得して表示
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");

		// 「オブジェクト指向まとめ」
		//　Q4でabstractに変化したためQ1からQ3まで文字に変更
		//		// Q1 
		//		 Employee emp = new Employee();// 新しいオブジェクト作成
		//		 emp.name = "山田太郎";
		//		 emp.work();
		//		
		//		// Q2
		//		 Employee empQ2 = new Employee();
		//		 empQ2.employeeId = "E001";
		//		 empQ2.nameQ2 ="佐藤太郎";
		//		 empQ2.showInfo();
		//		
				// Q3
//				 Employee empQ3 = new Employee();// Q4でabstractに変化したため文字に変更
//				 empQ3.setEmployeeId("E002");
//				 empQ3.setNameQ3("山田花子");
//				 System.out.println("社員ID:" + empQ3.getEmployeeId() + ", 名前:" + empQ3.getNameQ3());

		// Q4
		FullTimeEmployee full = new FullTimeEmployee("E100", "正社員太郎");// FullTimeEmployeeのインスタンスを作りたいため変更できない値設定
		PartTimeEmployee part = new PartTimeEmployee("P200", "パート花子");// 変更できない値設定

		System.out.println("正社員の給与: " + full.calculateDailyWage(9) + "円");// 9時間働いた場合
		System.out.println("パート社員の給与: " + part.calculateDailyWage(9) + "円");

	}
}
