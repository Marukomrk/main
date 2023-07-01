package lesson1_31;

public class Main {
	public static void main(String[] args) {
		// Personクラスのインスタンスを生成し、person1という変数に代入
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// Personクラスのインスタンスを生成し、person2という変数に代入
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// Carクラスのインスタンスを生成し、carという変数に代入
		Car car = new Car();
		// Bicycleクラスのインスタンスを生成し、bicycleという変数に代入
		Bicycle bicycle = new Bicycle();

		// Carの所有者を設定
		car.setOwner(person1.fullName());
		// Bicycleの所有者を設定
		bicycle.setOwner(person2.fullName());

		// それぞれ出力
		System.out.println(car.getOwner() + "が購入しました");
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}