package lesson1_23;

public class Animal {
	private String name; // 動物の名前
	private double length; // 体長（単位: m）
	private double speed; // 速度（単位: km/h）

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}