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

		// person1がcarを購入する
		person1.buy(car);
		// person2がbicycleを購入する
		person2.buy(bicycle);
	}
}