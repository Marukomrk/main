package lesson1_23;

public class Animal {
	// 動物の名前
	private String name;
	// 体長（単位: m）
	private double length;
	// 速度（単位: km/h）
	private double speed;

	// 名前を取得するメソッド
	public String getName() {
		return name;
	}

	// 名前を設定するメソッド
	public void setName(String name) {
		this.name = name;
	}

	// 長さを取得するメソッド
	public double getLength() {
		return length;
	}

	// 長さを設定するメソッド
	public void setLength(double length) {
		this.length = length;
	}

	// 速度を取得するメソッド
	public double getSpeed() {
		return speed;
	}

	// 速度を設定するメソッド
	public void setSpeed(double speed) {
		this.speed = speed;
	}
}