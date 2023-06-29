package lesson1_32;

public class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	// クラスフィールド count の定義
	private static int count = 0;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// countに1を足す
		count++;
	}

	public double bmi() {
		// BMIを計算する
		return this.weight / this.height / this.height;
	}

	public void print() {
		// 名前を表示する
		System.out.println("名前は" + this.name() + "です");
		// 年齢を表示する
		System.out.println("年は" + this.age() + "です");
	}

	public int age() {
		// 年齢を返す
		return age;
	}

	public String name() {
		// 名前を返す
		return name;
	}

	public static int getCount() {
		// クラスフィールド count の値を返す
		return count;
	}

	public static void printCount() {
		// 合計人数を表示する
		System.out.println("合計" + count + "人です");
	}
}