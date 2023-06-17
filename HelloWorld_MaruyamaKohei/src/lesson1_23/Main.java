package lesson1_23;
/*
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
*/

public class Main {
	public static void outputDetails(Animal animal) {
		// 動物名を出力
		System.out.println("動物名：" + animal.getName());
		// 体長を出力
		System.out.println("体長：" + animal.getLength() + "m");
		// 速度を出力
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		// 動物の名前を設定
		animal.setName("ライオン");
		// 体長を設定
		animal.setLength(2.1);
		// 速度を設定
		animal.setSpeed(80.0);
		// 動物の詳細を出力
		outputDetails(animal);
	}
}