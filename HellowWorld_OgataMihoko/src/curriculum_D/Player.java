package curriculum_D;

import java.util.Random;

public class Player extends Character {

	private static final Random rand = new Random();

	public Player(String name) {
		super(
				name,
				rand.nextInt(51) + 50, // hp 50〜100
				rand.nextInt(11) + 10, // at 10〜20
				rand.nextInt(6) + 5 // sp 5〜10
		);
	}
}