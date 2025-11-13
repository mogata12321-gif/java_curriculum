package curriculum_B;

public abstract class EmployeeQ6 implements Billable {
	protected String id;
	protected String name;
	
	// EmployeeQ6を作るときにidとnameを受け取って自分自身のidとnameに設定する
	public EmployeeQ6(String id, String name) {
		this.id = id;
		this.name = name;
	}
    public String getName() {// Biollableでgetterを宣言したものをここでインスタンス化
        return name;
    }
	}
