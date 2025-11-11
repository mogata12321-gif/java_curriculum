package curriculum_A;

public class Question1 {
	/*
	 * 【概要】変数の問題
	 */

	public static void main(String[] args) {

		// Q1 各型の変数を宣言し、変数を入力
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;

		// Q2 数字を当てはめる
		byteNum = 10;// 変数byteNumに10を代入
		shortNum = 100;// 変数shortNumに100を代入
		intNum = 1000;// 変数intNumに1000を代入
		longNum = 10000;// 変数longNumに10000を代入
		floatNum = 9.5f;// 変数floatNumに9.5fを代入
		doubleNum = 10.5;// 変数doubleNumに10.5を代入
		letter = 'a';// 変数letterに'a'を代入
		letters = "ハロー";// 変数lettersに"ハロー"を代入
		isBoolean = true;// 変数isBooleanにtrueを代入

		// Q3 問題文に沿って出力

		System.out.println(byteNum + shortNum + intNum + longNum);
		// Q1,Q2を代入しました
		System.out.println(floatNum + doubleNum);
		// 掛け算を使用しました
		System.out.println(letter + " " + letters + " " + isBoolean);
		// 空欄を入れるために工夫しました
		System.out.println(byteNum + shortNum + intNum + longNum + byteNum * 2);
		// 全て足しました（最後はかけました）
		System.out.println(byteNum * shortNum * intNum * longNum);
		// 全てかけました
		System.out.println(doubleNum / shortNum);
		// 変数同士で割りました
		System.out.println(byteNum - shortNum);
		// 変数同士で引きました

		// Q4 String型を利用して文章を出力
		String name = "山田太郎";//S tring型に"山田太郎"を代入
		System.out.println("こんにちは、" + name + "さん！");// 文章で出力

		// Q5 int型を利用して文章を出力
		int age = 25;// int型に整数25を代入
		System.out.println("年齢:" + " " + age + "歳");// 文章で出力(年齢の後に小さな空欄があったため念の為""で空欄作成)

		// Q6 sumという変数で出力
		int num1 = 10;// 合計を出すためにnum1という変数で10を代入
		int num2 = 5;// 合計を出すためにnum2という変数で5を代入
		int sum = num1 + num2;// num1とnum2を合計
		System.out.println(sum);// 合計した数を出力

		// Q7 int型を利用して文章を出力
		int score = 80;// scoreに80を代入
		score = 80 + 20;// scoreへのプラス分を合計する
		System.out.println("最終スコア:" + " " + score);// 文章を出力(小さな空欄は""で作成)	

		// Q8 変換してみる
		double price = 99.99;// 少数まである数字を代入
		int i = (int) price; // 明示的変換(小数点までの数字を整数に変換)
		System.out.println("整数価格:" + " " + i);// 変換後を出力

		// Q9 変換してみる
		String numStr = "123";// 文字として123を代入
		int number = Integer.parseInt(numStr);// 明示的変換(文字を数字に変換)
		System.out.println(number + 10);// 数字に変換したものに数字を足して出力

		// Q10 変換してみる
		int num = 50;// 整数として代入
		String str = String.valueOf(num);// 明示的変換(整数を文字に変換)
		System.out.println("得点:" + str + "点");// 変換後文章として出力

		// Q11 条件演算子
		int a = 10;// 10を代入
		int b = 20;// 20を代入
		boolean result = (a < b);// aがbより小さいかどうかをboolean変数resultに代入
		System.out.println(result);// resultの値を出力

		// Q12 条件演算子(三項演算子)
		int x = 15;// 初期値として15を代入
		String max = (x > 10) ? "OK" : "NG";// 三項演算子を使用
		System.out.println(max);// 結果を出力

		//Q13 文字置き換え
		String text = "私はJavaが好きです。Javaは楽しい！";// テキストを代入
		String text2 = text.replace("Java", "Python");// JavaをPythonにリプレイスする
		System.out.println(text2); // 結果を出力
		// replaceというメソッドを検索して使用しました
	}
}
