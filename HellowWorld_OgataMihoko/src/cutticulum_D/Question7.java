package cutticulum_D;

import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) throws Exception {
		// newで実体を作成色々と
		Scanner sc = new Scanner(System.in);

		System.out.print("プレイヤー名を入力してください: ");// ユーザーに見える文字
		String name = sc.nextLine();

		Player player = new Player(name);
		Daemon daemon = new Daemon("daemon_status.txt");

		FileWriter log = new FileWriter("battle_log.txt");// battle_log.txtを読み込むという意味

		log.write("=== バトルログ ===\n");// バトルログを書くよという意思表示\nで改行する
		log.write(player.name + " vs " + daemon.name + "\n\n");

		Random rand = new Random();

		while (true) {
			Character first, second;// 作成したCharacterメソッドの変数firstとsecondを動詞に作成

			// ① 先攻決定（SPが高い → 同じならランダム）
			if (player.sp > daemon.sp) {
				first = player;
				second = daemon;
			} else if (daemon.sp > player.sp) {
				first = daemon;
				second = player;
			} else {
				first = rand.nextBoolean() ? player : daemon;// rand.nextBoolean()がtrueならplayer
				second = (first == player) ? daemon : player;
			}

			// ② 先攻の攻撃
			first.attack(second);
			log.write(first.name + " の攻撃 → " + second.name + " のHP: " + second.hp + "\n");

			if (second.isDead()) {
				log.write("\n勝者: " + first.name + "\n");
				System.out.println(first.name + " の勝ち！！");
				break;
			}
			// ③ 後攻の攻撃
			second.attack(first);
			log.write(second.name + " の攻撃 → " + first.name + " のHP: " + first.hp + "\n");

			if (first.isDead()) {
				log.write("\n勝者: " + second.name + "\n");
				System.out.println(second.name + " の勝ち！！");
				break;
			}

			log.write("------------------------------\n");
		}

		log.close();// メモを閉じる
		System.out.println("バトルログを battle_log.txt に出力しました。");
	}
}