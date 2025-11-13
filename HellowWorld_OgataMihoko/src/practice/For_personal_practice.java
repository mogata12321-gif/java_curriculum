package practice;

public class For_personal_practice {

	public static void main(String[] args) {

		// Question1 Q12
		int x = 15;
		String max = (x > 10) ? "OK" : "NG";
		System.out.println(max);

		// Question2 Q6
		int value = 1;
		String text = (value % 2 == 0) ? "偶数です" : "奇数です";
		System.out.println(text);

		// Q2 Q7
		int score = 30;
		if (score >= 90) {
			System.out.println("優");
		} else if (score <= 89 && score >= 70) {
			System.out.println("良");
		} else {
			System.out.println("不可");
		}

		// Q2 Q8
		String input = "";// 文字列として何も挿入されていないことを示す
		if (input == null || input.equals("")) {// inputがnullまたは何も入力されていない場合(ここではequalsを使用)
			System.out.println("入力が無効です");// 「入力が無効です」と出力
		} else {// それ以外の場合
			System.out.println("入力内容は" + input + "です");
		}
		// 	Q3 
		for (int i = 1; i <= 5; i++) {
			for (int f = 1; f <= i; f++) {
				System.out.print("✴︎");
			}
			System.out.println();
		}

		//			// Question3 Q10
		//			Scanner sc = new Scanner(System.in);
		//			System.out.println("文字を入力してください");
		//			int num = sc.nextInt();
		//			while(num != 0) {
		//				System.out.println("数値："+  num);
		//				num = sc.nextInt();
		//			}
		//			System.out.println("終了しました");

		// Question3 Q11
		for (int num11 = 1; num11 <= 9; num11++) {
			for (int num3 = 1; num3 <= 9; num3++) {
				String a = String.format("%02d", num11);
				String b = String.format("%02d", num3);
				String c = String.format("%02d", num11 * num3);
				System.out.print(a + " * " + b + " = " + c);
				if (num3 < 9) {
					System.out.print("||");
				}
			}
			System.out.println();
			// Question3 Q12
			
			
		}
	}

}
