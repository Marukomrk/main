package lesson1_32;

public class Main {
	public static void main(String[] argos) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		// 合計人数を表示する
		System.out.println("合計" + Person.getCount() + "人です");
	}
}