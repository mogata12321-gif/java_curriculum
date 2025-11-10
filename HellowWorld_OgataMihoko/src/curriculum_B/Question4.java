package curriculum_B;

import java.util.Scanner;// Q6で使用

public class Question4 {

	public static void main(String[] args) {

		// Q1
		int[] scores = { 1, 2, 3, 4, 5 };// 配列入力をする
		for (int X : scores) {// 配列の中身を数字に範囲指定
			System.out.println(X);
		}

		System.out.println();

		// Q2
		int[] arrayQ2 = { 10, 20, 30, 40, 50 };
		for (int Y = arrayQ2.length - 1; Y >= 0; Y--) {// 配列の最初は0からスタートのため−1必要
			System.out.println(arrayQ2[Y]);// Array配列の中から[Y]を取り出すというイメージ(順番ではないため)
		}

		System.out.println();

		// Q3
		int[] array = { 3, 5, 7, 9, 11 };
		int sum = 0;// 合計値を入力するため変数を作成
		for (int Z : array) {// arrayの中身をひとつづつZという変数に変換
			sum = sum + Z;// 数字に直したものを足していく
		} // 上記システムをまとめて出力する
		System.out.println(sum);

		System.out.println();

		// Q4
		int[] arrayQ4 = { 12, 7, 9, 21, 5, 18 };
		// 最大値と最小値を最初の要素で初期化
		int max = arrayQ4[0];// 配列内の要素を取り出す
		int min = arrayQ4[0];// 上記同じ

		for (int a = 1; a < arrayQ4.length; a++) {// 配列内
			if (arrayQ4[a] > max) {
				max = arrayQ4[a];
			}
			if (arrayQ4[a] < min) {
				min = arrayQ4[a];
			}
		}
		System.out.println("最大値は" + max + "です");
		System.out.println("最小値は" + min + "です");

		System.out.println();

		// Q5			
		int[] arrayQ5 = { 1, 2, 3, 4, 5 };

		for (int f = 0; f < arrayQ5.length; f++) {// 関数中の文字を数字に変換
			arrayQ5[f] = arrayQ5[f] * 2;// 変数が掛け算にする
			System.out.println(arrayQ5[f]);
		}

		System.out.println();

		// Q6
		int[] arrayQ6 = { 4, 7, 10, 15, 20 };// 文字配列を設定

		Scanner sc = new Scanner(System.in);// Scannerを生成しますという意味
		System.out.println("数値を入力してください：");// ユーザーに入力を促すためのメッセージをコンソールに表示
		int input = sc.nextInt(); // ユーザーの入力を受け取る

		boolean found = false; // 見つかったかどうかを記録する変数を設置まずは全てを否にする

		for (int num : arrayQ6) {// 配列に含まれているか判定（拡張for文）例外として配列の文字が入力された場合
			if (num == input) {
				found = true;
				break; // 見つかったのでループ終了
			}
		}
		if (found) {
			System.out.println(input + " は配列に含まれています。");// 含まれている場合の出力
		} else {// それ以外の場合
			System.out.println(input + " は配列に含まれていません。");// 含まれている場合の出力
		}
		sc.close();// scを閉じる
		
		System.out.println();
		
		// Q7
		int[][] arrayQ7 = {{1,2}, {3,4},  {5,6}};
		for (int[] row : arrayQ7) {     // 1次元配列を取り出す
            for (int num : row) {     // その中の要素を取り出す
                System.out.println(num);
                }
		}
		
		System.out.println();
		
		// Q8
		int[][] arrayQ8 = {{10,20,30}, {40,50,60}, {70,80,90}};
		int sumQ8 = 0;// 合計の変数を設定
		for (int[] rowQ8 :arrayQ8) {
			for(int num :rowQ8) {
			sumQ8 = sumQ8 + num;
			}
		}
		System.out.println(sumQ8);
		
		System.out.println();
		
		// Q9
		int[][] arrayQ9 = {{12,15,8}, {6,19,25}, {30,2,10}};
		int maxQ9 = arrayQ9[0][0];// 最大値の変数を設定（要素を取り出す）
		int minQ9 = arrayQ9[0][0];// 上記の最小値版
		
		for (int[] rowQ9 :arrayQ9) {// 1次元配列を取り出す
			for(int numQ9 :rowQ9) {// その中の要素を取り出す
				if (numQ9 > maxQ9) {
					maxQ9 = numQ9;
				}
				if (numQ9 < minQ9) {
					minQ9 = numQ9;
				}
			}	
			}
		System.out.println("最大値: " + maxQ9);
        System.out.println("最小値: " + minQ9);
        
        System.out.println();
        
        // Q10
        int[][][] arrayQ10 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; 
        for(int[][] rowQ10: arrayQ10) {
        	for(int[] rowQ102: rowQ10){
        		for(int numQ10: rowQ102) {
        			System.out.println(numQ10);
        		}
        	}
        }
	}
}
