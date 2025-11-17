package curriculum_D;

import java.util.Random;

public class Player extends Character {

	public Player(String name) {// Playerのランダム値を設定する
		super(
				name,
				new Random().nextInt(51) + 50, // hp: 50〜100 最小値を50に設定
				new Random().nextInt(11) + 10, // at: 10〜20
				new Random().nextInt(6) + 5 // sp: 5〜10
		);
	}
}