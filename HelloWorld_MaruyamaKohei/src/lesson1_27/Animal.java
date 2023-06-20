package lesson1_27;

import java.util.Scanner;

public class Animal {

	private static String consoleInput;

	public static void main(String[] args) {
		// 入力データ
		String input = "ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50";
		// メッセージを表示して入力待ち
		System.out.println("コンソールに文字を入力してください");
		Scanner scanner = new Scanner(System.in);
		// 入力を取得してセット
		setConsoleInput(scanner.nextLine());

		// 動物ごとにデータを分割
		String[] animals = input.split(",");
		for (String animal : animals) {
			// データをさらに分割
			String[] info = animal.split(":");
			// 動物名
			String name = info[0];
			// 体長
			double length = Double.parseDouble(info[1]);
			// 速度
			int speed = Integer.parseInt(info[2]);

			String scientificName;
			switch (name) {
			case "ライオン":
				// 動物名が「ライオン」の場合、学名を設定
				scientificName = "パンテラ レオ";
				break;
			case "ゾウ":
				// 動物名が「ゾウ」の場合、学名を設定
				scientificName = "ロキソドンタ・サイクロティス";
				break;
			case "パンダ":
				// 動物名が「パンダ」の場合、学名を設定
				scientificName = "アイルロポダ・メラノレウカ";
				break;
			case "チンパンジー":
				// 動物名が「チンパンジー」の場合、学名を設定
				scientificName = "パン・トゥログロディテス";
				break;
			case "シマウマ":
				// 動物名が「シマウマ」の場合、学名を設定
				scientificName = "チャップマンシマウマ";
				break;
			case "インコ":
				// 動物名が「インコ」の場合、学名を設定
				scientificName = "不明";
				break;
			default:
				// 上記のいずれの条件にも当てはまらない場合、学名を空に設定
				scientificName = "";
			}

			// 動物の情報を出力
			System.out.println("動物名：" + name);
			System.out.println("体長：" + length + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + scientificName);
			System.out.println();
		}
		// スキャナーをクローズ
		scanner.close();
	}

	public static String getConsoleInput() {
		// コンソール入力の値を返す
		return consoleInput;
	}

	// コンソール入力を処理するメソッド
	public static void setConsoleInput(String consoleInput) {
		Animal.consoleInput = consoleInput;
	}
}