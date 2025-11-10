package curriculum_B;

public class Main {

	public static void main(String[] args) {
	// Q4：呼び出し
		Greeting.sayHello();
		
	// Q5：呼び出し
		// Animal のインスタンス（実体）を作成
        Animal lion = new Animal();//lionと言う変数を設定、new Animalと言うオブジェクトを作ると宣言

        // setter で値を入れる
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // getter で値を取得して表示
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}
