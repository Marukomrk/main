package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Dogクラスをインスタンス化し、dog1変数に代入
		Dog dog1 = new Dog();
		// dog1の名前を出力
		System.out.println("動物の名前: " + dog1.getName());

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// 引数を指定してDogクラスをインスタンス化し、dog2変数に代入
		Dog dog2 = new Dog(5);
		// dog2の数を出力
		System.out.println("動物の数: " + dog2.getCount());

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在の日時を取得
		LocalDateTime now = LocalDateTime.now();
		// 日時の表示形式を指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// 日時を指定した形式でフォーマット
		String formattedDateTime = now.format(formatter);
		// フォーマットされた日時を出力
		System.out.println("現在の日時: " + formattedDateTime);
	}
}