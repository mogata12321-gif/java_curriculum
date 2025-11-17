package curriculum_C;

import java.util.Scanner;

public class Player {
	private int hand;

	public void playerHand() {
		Scanner sc = new Scanner(System.in);
		System.out.println("グー(0), チョキ(1), パー(2) を入力: ");
		this.hand = sc.nextInt();
	}

	public int getHand() {
		return hand;
	}

	public String playerHandwork() {
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
