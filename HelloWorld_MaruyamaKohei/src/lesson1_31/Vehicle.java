package lesson1_31;

public class Vehicle {
	// オーナーの名前を保持するプライベート変数
	private String owner;

	// オーナーの名前を取得するメソッド
	public String getOwner() {
		return owner;
	}

	// オーナーの名前を設定するメソッド
	public void setOwner(String owner) {
		this.owner = owner;
	}
}