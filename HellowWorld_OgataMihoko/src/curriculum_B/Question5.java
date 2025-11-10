package curriculum_B;

public class Question5 {

	// Q1：メソッド作成
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	// Q2：メソッド作成
	public static int doubleValue(int num) {
		return num * 2;
	}

	// Q3：メソッド作成
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	// Q4：メソッド作成→Greetingクラスに作成

	public static void main(String[] args) {

		// Q1：呼び出し
		helloWorld();

		// Q2：呼び出し
		int value = 10;
		int result = doubleValue(value);
		System.out.println(value + " を 2 倍すると " + result + " です");

		// Q3：呼び出し
		int num1 = 7;
		int num2 = 10;

		if (isEven(num1)) {
			System.out.println(num1 + " は偶数です。");
		} else {
			System.out.println(num1 + " は奇数です。");
		}

		if (isEven(num2)) {
			System.out.println(num2 + " は偶数です。");
		} else {
			System.out.println(num2 + " は奇数です。");
		}

		// Q4：呼び出し→Mainクラスに作成
		// Q5：呼び出し→Mainクラスに作成

	}
}