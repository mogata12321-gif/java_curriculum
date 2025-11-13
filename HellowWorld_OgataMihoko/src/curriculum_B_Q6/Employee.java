package curriculum_B_Q6;

public abstract class Employee implements Billable {
	protected String id;
	protected String name;

	// EmployeeQ6を作るときにidとnameを受け取って自分自身のidとnameに設定する
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String getName() {// Biollableでgetterを宣言したものをここでインスタンス化
		return name;
	}

	@Override
	public String getId() { // BillableのgetIdを実装
		return id;
	}
}
