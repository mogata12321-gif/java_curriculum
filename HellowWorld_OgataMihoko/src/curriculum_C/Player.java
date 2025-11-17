package curriculum_C;

import java.util.Scanner;

public class Player {
	private int hand;
	private Scanner sc;
	
	 // Scannerをmainから受け取るコンストラクタ
    public Player(Scanner sc) {
        this.sc = sc;
    }

    public void inputHand() {
        while (true) {
            System.out.print("グー(0)、チョキ(1)、パー(2) を入力: ");
            if (sc.hasNextInt()) {
                int h = sc.nextInt();
                if (h == 0 || h == 1 || h == 2) {
                    this.hand = h;
                    return;
                }
            } else {
                sc.next(); // 数字以外を読み捨て
            }
            System.out.println("⚠ 0〜2 の数字を入力してください");
        }
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
