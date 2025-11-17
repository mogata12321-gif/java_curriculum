package curriculum_C;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
        Player player = new Player(sc);
        CPU cpu = new CPU();


		while (true) {
			player.inputHand();// 作成した実態の中身を取り出す
			cpu.decideHand();

			System.out.println("あなたの手:" + player.playerHandwork());
			System.out.println("CPUの手:" + cpu.cpuHandwork());

			int p = player.getHand();
			int c = cpu.getHand();

			if (p == c) {
				System.out.println("あいこ！");
			} else if (p == 0 && c == 1 || p == 1 && c == 2 || p == 2 && c == 0) {
				System.out.println("あなたの勝ち！");
				break;// ここで終了するためbreak挿入
			} else {
				System.out.println("あなたの負け！");
			}
		}
		sc.close();
	}
}
