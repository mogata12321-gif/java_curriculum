package curriculum_B;

public class Question2 {
	/*
	 * 【概要】if・switvh文使用
	 */

	public static void main(String[] args) {

		// Q1 
		int score = 75;// 変数scoreに75を代入
		if (score >= 60) {// 60以上であるように条件提示
			System.out.println("合格です！");
		} // 結果を出力

		// Q2
		int age = 25;// 変数ageに25を代入
		if (age >= 20 && age <= 30) {// 20歳以上かつ30歳以下で条件提示
			System.out.println("適正年齢です");// 条件に当てはまる出力
		} else {//上記条件以外
			System.out.println("対象外です");// 条件に当てはまる出力
		}

		// Q3
		int age2 = 18;// age2に18を代入
		if (age2 >= 20) {// age2は20以上の場合分け
			System.out.println("成人です");// 「成人です」と出力
		} else if (age2 >= 13 && age2 <= 19) {// age2が13以上かつ19以下である場合分け
			System.out.println("ティーンエイジャーです");// 「ティーンエイジャーです」と出力
		} else {// それ以外の場合
			System.out.println("子供です");// 「子供です」と出力
		} // 閉じる

		// Q4
		int x = 30;// 30を代入
		int y = 15;// 15を代入
		int z = 50;// 50を代入
		if (x > y && x > z) {// XがYZよりも大きい場合
			System.out.println(x);// Xを表示
		} else if (x < y && y > z) {// YがXZよりも大きい場合
			System.out.println(y);// Yを表示
		} else {// 上記当てはまらない場合、つまりZが一番大きい場合
			System.out.println(z);// Zを表示
		} // ifを閉じる
			// 一つずつバージョン　if型使用

		// Q5
		int num = 5;// numに5を代入
		if (num > 0) {// numが0より大きければ
			System.out.println("正の数です");// 「正の数です」と出力
		} else if (num == 0) {// numが0であれば
			System.out.println("0です");// 「0です」と出力
		} else {// 上記に当てはまらない場合
			System.out.println("負の数です");// 「負の数です」と出力
		} // 閉じる

		// Q6
		int value = 50;// valueに50を代入
		String result2 = (value % 2 == 0) ? "偶数です" : "奇数です"; // 偶数ならという内容で三項演算子使用
		System.out.println(result2);// 結果を出力

		// Q7
		int score2 = 20;// score2に20を代入
		if (score2 >= 90) {// score2が90よりも大きい場合
			System.out.println("優");// 「優」と出力
		} else if (score2 <= 89 && score2 >= 70) {// score2が70-89の場合
			System.out.println("良");// 「良」と出力
		} else if (score2 <= 69 && score2 >= 50) {// score2が50-69の場合
			System.out.println("可");// 「可」と出力
		} else {// 上記に当てはまらない場合
			System.out.println("不可");// 「不可」と出力
		} // 閉じる

		// Q8
		String input = "";// 文字列として何も挿入されていないことを示す
		if (input == null || input.equals("")) {// inputがnullまたは何も入力されていない場合(ここではequalsを使用)
			System.out.println("入力が無効です");// 「入力が無効です」と出力
		} else {// それ以外の場合
			System.out.println("入力内容は" + input + "です"); // inputの内容と文字列を出力
		} // 閉じる

		// Q9
		int day = 1; // 曜日を表す　(1:月曜 2:火曜 3:水曜 …)
		switch (day) {// switchを使用
		case 1:// 1と入力された場合
			System.out.println("月曜日");// 「月曜日」と出力
			break;// 出力を独立させるため
		case 2:// 2と入力された場合
			System.out.println("火曜日");// 「火曜日」と出力
			break;// 出力を独立させるため
		case 3:// 3と入力された場合
			System.out.println("水曜日");// 「水曜日」と出力
			break;// 出力を独立させるため
		case 4:// 4と入力された場合
			System.out.println("木曜日");// 「木曜日」と出力
			break;// 出力を独立させるため
		case 5:// 5と入力された場合
			System.out.println("金曜日");// 「金曜日」と出力
			break;// 出力を独立させるため
		case 6:// 6と入力された場合
			System.out.println("土曜日");// 「土曜日」と出力
			break;// 出力を独立させるため
		case 7:// 7と入力された場合
			System.out.println("日曜日");// 「日曜日」と出力
			break;
		default:// 上記以外の場合
			System.out.println("無効な入力です");
		}// switchを閉じる

		// Q10
		int month = 9;// 月を表す
		switch (month) {// switchを使用
		case 12, 1, 2:// 12,1,2と入力された場合
			System.out.println("冬");// 「冬」と出力
			break;// 出力を独立させるため
		case 3, 4, 5:// 3,4,5と入力された場合
			System.out.println("春");// 「春」と出力
			break;// 出力を独立させるため
		case 6, 7, 8:// 6,7,8と入力された場合
			System.out.println("夏");// 「夏」と出力
			break;// 出力を独立させるため
		default:// 上記以外の場合
			System.out.println("秋");// 「秋」と出力
		}
	}
}
