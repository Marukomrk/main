package lesson1_23;
/*
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
*/

public class Main {
	public static void main(String[] args) {
		Animal lion = new Animal();
		lion.setName("ライオン"); // 動物の名前を設定
		lion.setLength(2.1); // 体長を設定
		lion.setSpeed(80.0); // 速度を設定
		lion.outputDetails(); // 動物の詳細を出力
	}
}
