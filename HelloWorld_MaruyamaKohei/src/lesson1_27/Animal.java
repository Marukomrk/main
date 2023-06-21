/*
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明
*/

package lesson1_27;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// メッセージを表示して入力待ち
		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();
		// 入力を取得してセット	
		setConsoleInput(input);

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
			// 学名を取得
			String scientificName = getScientificName(name);

			// 渡された値の箇所だけを出力
			System.out.println("動物名：" + name);
			System.out.println("体長：" + length + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + scientificName + "\n");
		}

		scanner.close();
	}

	private static String getScientificName(String name) {
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
			scientificName = "不明";
		}
		return scientificName;
	}

	// コンソール入力を処理するメソッド
	public static void setConsoleInput(String consoleInput) {
	}
}