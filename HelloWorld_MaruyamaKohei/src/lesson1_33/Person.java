package lesson1_33;

public class Person {
	public static int count = 0;
	public String firstName;
	// 追加するフィールド
	public String lastName;
	public int age;
	public double height, weight;

	// 引数にlastNameを含まないコンストラクタ
	Person(String firstName, int age, double height, double weight) {
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	// 引数にlastNameを含むコンストラクタ
	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	public String fullName() {
		// fullNameメソッドでフルネームを連結する
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}