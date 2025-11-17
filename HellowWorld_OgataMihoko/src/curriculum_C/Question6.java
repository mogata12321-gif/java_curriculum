package curriculum_C;

public class Question6 {

	public static void main(String[] args) {

		Player player = new Player();// newで実体作成
		CPU cpu = new CPU();

		while (true) {
			player.playerHand();// 作成した実態の中身を取り出す
			cpu.cpuHand();

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
	}
}
