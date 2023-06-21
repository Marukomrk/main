package lesson1_30;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;

	// 人数の合計を管理するクラス変数
	static int totalCount = 0;

	// コンストラクタを定義
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// インスタンスが作成されるたびに人数を加算する
		totalCount++;
	}

	// インスタンスメソッド「bmi」を定義
	double bmi() {
		// cmをmに変換
		double heightInMeter = height / 100;
		// BMIを計算し値を返す
		return weight / (heightInMeter * heightInMeter);
	}

	// インスタンスメソッド「print」を定義
	void print() {
		// 「名前は〇〇です」と出力
		System.out.println("名前は" + this.name + "です");
		// 「年は〇〇です」と出力
		System.out.println("年齢は" + this.age + "です");
		// 「BMIは○○です」と出力
		System.out.println("BMIは" + this.bmi() + "です");
	}

	// 人数の合計を「合計○人です」と出力
	static void printTotalCount() {
		System.out.println("合計" + totalCount + "人です");
	}
}