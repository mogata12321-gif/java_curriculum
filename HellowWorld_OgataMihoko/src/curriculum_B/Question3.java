package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		// Q1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// Q2
		for (int even = 2; even <= 20; even++) {
			if (even % 2 == 0) {
				System.out.println(even);
			}

		}

		// Q3
		for (int down = 10; down >= 1; down--) {
			System.out.println(down);

		}

		// Q4
		int sum = 0;
		for (int original = 1; original <= 100; original++) {
			sum = sum + original;
			if (sum == 5050) {
				System.out.println(sum);
			}
		}

		// Q5
		for (int line = 1; line <= 5; line++) {// 行の数
			for (int triangle = 1; triangle <= line; triangle++) {// 三角形の数
				System.out.print("*");// 「ln」はいらない（横並びのため）
			}
			System.out.println();
		}

		// Q6
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;// 一つずつカウントアップしていくという意味
		}

		// Q7
		int even2 = 2;
		while (even2 <= 20) {
			System.out.println(even2);
			even2 += 2;// ひとつ飛ばしで上がっていくという意味（この文章の位置はここでOK：20までの数字を出力した後にひとつ飛ばしにすという処理）
		}
		
		// Q8
		int down2 = 10;
		while (down2 >= 1) {
			System.out.println(down2);
			down2--;// 一つづつ下がっていくという意味
		}

		// Q9
		int number = 1;// 1という数字から始めますよという意味
		int sum2 = 0;// 合計を求めるたに変数を設定しておく
		while (number <= 100) {// 100よりも小さい数を指定
			sum2 = sum2 + number;// 合計は数字を合わせていくという意味
			number++;// 数字はひとつづつ上がっていくという意味
		} // ここで数字の処理は一旦まとめる（ここでまとめないと合計された数字がひとつづつ全て出力されてしまうため）

		System.out.println(sum2);// 合計を出力

		// Q10
		//			Scanner sc = new Scanner(System.in);//クラスのインスタンスを作成、さらにコンソールを最初に示す
		//			System.out.println("数値を入力してください:");//数値を入力する際のユーザー目線の文字の出力を提示
		//
		//			int num10 = sc.nextInt();//ユーザーからの入力された数値を一旦nunm10に代入
		//
		//			while (num10 != 0) {//num10が0ではない場合、繰り返すということをwhileで示す
		//			    System.out.println("入力された数値: " + num10);//ユーザーが入力した数値を提示
		//			    num10 = sc.nextInt();//再びコンソールから読み取りnum10に代入、ここで0になったら終了
		//			}//ループの本体はここまで
		//
		//			System.out.println("終了しました");//ループから抜け出した際に表示される文字出力
		//			sc.close();//Scannerを閉じる
		/*
		 * Q10について、Q11に影響が出るためテキスト表示にする
		 */

		// Q11
		for (int multi = 1; multi <= 9; multi++) {// かけられる数字を範囲指定
			for (int j = 1; j <= 9; j++) {// かける数字を範囲指定

				String a = String.format("%02d", multi);// 01,02など0から始まるように数字から文字に置き換える
				String b = String.format("%02d", j);// 上記同様
				String c = String.format("%02d", multi * j);// 上記同様、かけた後の表示も0から始まるように置き換え

				System.out.print(a + " * " + b + " = " + c);// 出力される基本の型

				if (j < 9) {// 縦線を入れる時の条件指定
					System.out.print(" || ");// 条件を指定し出力されるもの	
				}
			}
			System.out.println();// 改行をして欲しいので	
		}

		// Q12
		Scanner sc = new Scanner(System.in);//S cannerを使用すると明記
		Random rand = new Random();// 予測できないランダムな値が必要なためRandomクラスを使用

		System.out.println("商品名を「、」区切りで入力してください：");// ユーザーから最初に見える文字列を出力
		String input = sc.nextLine();// ユーザーが文字列に入力した文字を認識させるコード(「、」も含めたいためnextLine()を使用)

		String[] items = input.split("、"); // split型を使用「、」で分割して配列にするため[]の配列記号を使用

		// テレビとディスプレイに使う共通ランダム値を生成
		int tvStock = rand.nextInt(12); // 0～11(Randomは0からスタートするため)
		int displayStock = 11 - tvStock; // 合計が常に11になるように

		// 拡張for文で順番に処理
		for (String item : items) {// 変数itemを定義づけする(普通のfor文では数字しか扱えないが拡張forぶんは文字も使用可能なため)

			switch (item) {// 場合分け開始
			case "テレビ":
			case "ディスプレイ":
				// 条件演算子(三項演算子)によってどちらの商品か判定し出力内容を変える
				int stock = item.equals("テレビ") ? tvStock : displayStock;// テレビかディスプレイどちらが入力されたかの変数を新しく設定
				System.out.println(item + "の残り台数は" + stock + "台です");
				break;

			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				// 他の指定商品は毎回ランダム表示
				System.out.println(item + "の残り台数は" + rand.nextInt(12) + "台です");
				break;

			default:
				// それ以外の文字列が来た場合
				System.out.println("『 " + item + " 』は指定の商品ではありません");
			}
		}
		sc.close();// Scannerを閉じる
	}
}
