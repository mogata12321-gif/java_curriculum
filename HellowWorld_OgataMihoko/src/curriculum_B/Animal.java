package curriculum_B;

public class Animal {

	// Q5：メソッド作成
	// フィールド（変数）
	private String name; // フィールド(nameと言う変数)を宣言文字のためString「動物名」
	private double length; // 上記同様「体長（m）」
	private int speed; // 上記同様「速度（km/h）」

	// setter（値をセットするメソッド）
	public void setName(String name) {// 他クラスでも使用できるようにパブリックにする
		this.name = name;//問題文にthis使用とあるため使用する
	}
	// 他クラスで名前を入力してもらうため(流動的に別クラスで入力できるように)

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// getter（値を取り出すメソッド）
	public String getName() {// 自由に名前を設定可能なように
		return this.name;
	}

	public double getLength() {
		return this.length;
	}

	public int getSpeed() {
		return this.speed;
	}

	public static void main(String[] args) {

	}

}
