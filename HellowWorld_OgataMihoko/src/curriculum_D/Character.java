package curriculum_D;

public class Character {
	protected String name;
	protected int hp;
	protected int at;
	protected int sp;

	public Character(String name, int hp, int at, int sp) {// 全てのキャラクターはname,hp,at,spを有するため
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	public boolean isDead() {
		return hp <= 0;// HPが0以下ならtrue(死んでいる)、それ以外はfalse(生きている)を返す
	}

	public void attack(Character target) {// attackというメソッドとtargetという変数作成
		target.hp = target.hp - this.at;
		if (target.hp < 0){// targetのHPが0より小さくなった場合0と表記する
			target.hp = 0;
		}
	}
}