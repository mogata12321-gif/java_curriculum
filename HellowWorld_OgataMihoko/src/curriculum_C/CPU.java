package curriculum_C;

import java.util.Random;

public class CPU {
	private int hand;
	private Random rand = new Random();

	public void decideHand() {
		this.hand = rand.nextInt(3);
	}

	public int getHand() {// ユーザーにCPUが何の手を出したかを見せたいためgetterを使用
		return hand;
	}

	public String cpuHandwork() {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "";
		}
	}
}
