package curriculum_B;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		// 商品と初期の残り台数を設定
		Map<String, Integer> inventory = new HashMap<>();
		inventory.put("パソコン", 11);
		inventory.put("冷蔵庫", 11);
		inventory.put("扇風機", 11);
		inventory.put("洗濯機", 11);
		inventory.put("加湿器", 11);
		inventory.put("テレビ", 11);
		inventory.put("ディスプレイ", 11);

		Scanner scanner = new Scanner(System.in);
		System.out.println("商品を入力してください（複数の商品を「、」で区切って指定）:");
		String input = scanner.nextLine();

		String[] products = input.split("、");
		for (String product : products) {
			int remainingQuantity = 0;

			// 拡張for文とSwitch文を使用して商品ごとの処理を行う
			switch (product) {
			case "テレビ":
			case "ディスプレイ":
				// ランダムな値を引いて残り台数を計算
				remainingQuantity = 11 - new Random().nextInt(12);
				break;
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				remainingQuantity = inventory.getOrDefault(product, 0);
				// 改行
				System.out.println(" ");
				
				break;
				
			default:
				
				System.out.println("『 " + product + " 』は指定の商品ではありません");
			}

			// 条件演算子を使用して出力するメッセージを決定
			String message = (remainingQuantity > 0)
					? product + "の残り台数は" + remainingQuantity + "台です"
					: "残り台数は0台です";
			// 改行
			System.out.println(" ");
			System.out.println(message);
		}
	}
}