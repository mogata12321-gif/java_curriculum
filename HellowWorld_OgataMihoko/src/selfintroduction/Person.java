package selfintroduction;

class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	// Q4
	double weight;
	static int count = 0; // 人数カウント用

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; // オブジェクトが作られるたびに人数を増やす
	}
	
	// Q6追加
	public double bmi() {
		return this.weight / (this.height * this.height);
	}
	
	public void print() {
		System.out.println("名前は " + this.name + " です。");
		System.out.println("年は " + this.age + " 歳です。");
		System.out.println("BMIは " + this.bmi() + " です。");
	}
	public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}