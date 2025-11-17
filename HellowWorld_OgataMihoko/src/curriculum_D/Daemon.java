package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;

public class Daemon extends Character {

	public Daemon(String filename) {
		super("", 0, 0, 0);// 一旦(name,hp,at,sp)の初期値を代入
		loadDaemon(filename);// 下記中身作成
	}

	public void loadDaemon(String filename) {
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			this.name = br.readLine();
			this.hp = Integer.parseInt(br.readLine());// Stinrg型をint型に変換
			this.at = Integer.parseInt(br.readLine());
			this.sp = Integer.parseInt(br.readLine());
		} catch (Exception e) {// 数字以外の文字が入った場合エラーなのでExceptionを使用
			System.out.println("デーモンデータの読み込みに失敗しました");
			this.name = "デーモン";// デフォルト値設定
            this.hp = 100;
            this.at = 10;
            this.sp = 5;
		}
	}
}