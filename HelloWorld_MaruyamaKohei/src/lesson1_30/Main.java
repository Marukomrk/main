package lesson1_30;

public class Main {
	public static void main(String[] args) {
		// 各インスタンスフィールドに値をセット
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		person1.print();
		Person.printTotalCount();
	}
}