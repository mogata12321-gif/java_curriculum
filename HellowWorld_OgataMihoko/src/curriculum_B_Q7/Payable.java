package curriculum_B_Q7;

public interface Payable {// SOILDのOの部分、拡張を簡単にするためinterfaceで色々なところに適応できるように作成
	int calculatePay(int hoursWorked);// 労働分の引数設定calculatePayというメソッドに変換

	String getName();
	// インターフェイス分離の原則は必要な機能だけを含む“小さいインターフェース”を作るという意味なのでこの二つは適応
}