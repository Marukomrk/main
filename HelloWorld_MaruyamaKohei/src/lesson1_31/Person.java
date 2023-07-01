package lesson1_31;

public class Person {
	// インスタンスフィールドを定義
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;

	// コンストラクタを定義
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
	}

	// フルネームを返すメソッド
	public String fullName() {
		return firstName + "" + lastName;
	}

	// Carオブジェクトを購入するメソッド
	public void buy(Car car) {
		car.setOwner(this.fullName());
	}

	// Bicycleオブジェクトを購入するメソッド
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
	}

	// 年齢を取得するメソッド
	public int getAge() {
		return age;
	}

	// 年齢を設定するメソッド
	public void setAge(int age) {
		this.age = age;
	}

	// 身長を取得するメソッド
	public double getHeight() {
		return height;
	}

	// 身長を設定するメソッド
	public void setHeight(double height) {
		this.height = height;
	}

	// 体重を取得するメソッド
	public double getWeight() {
		return weight;
	}

	// 体重を設定するメソッド
	public void setWeight(double weight) {
		this.weight = weight;
	}
}