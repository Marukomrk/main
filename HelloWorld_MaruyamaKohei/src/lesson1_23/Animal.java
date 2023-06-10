package lesson1_23;

public class Animal {
	private String name; // 動物の名前
	private double length; // 体長（単位: m）
	private double speed; // 速度（単位: km/h）

	public Animal() {
	}

	public Animal(String name, double length, double speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}

	public void outputDetails() {
		System.out.println("動物名：" + this.getName()); // 動物名を出力
		System.out.println("体長：" + this.getLength() + "m"); // 体長を出力
		System.out.println("速度：" + this.getSpeed() + "km/h"); // 速度を出力
	}

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