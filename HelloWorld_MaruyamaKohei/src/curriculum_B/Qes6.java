package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		// 商品リスト
		String[] products = { "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ" };
		// ランダムな数値を生成するためのRandomオブジェクト
		Random random = new Random();
		// 最大台数
		int maxCount = 11;

		// 入力処理
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputArr = input.split("、");

		// 商品ごとの処理
		for (String item : inputArr) {
			boolean isOtherProduct = true;
			for (String product : products) {
				if (item.equals(product)) {
					// 残り台数の計算
					int remainingCount = item.equals("テレビ") || item.equals("ディスプレイ")
							? maxCount - random.nextInt(maxCount + 1)
							: random.nextInt(maxCount + 1);

					// 出力メッセージの作成
					String message = item + "の残り台数は" + remainingCount + "台です"+"\n";
					System.out.println(message);

					isOtherProduct = false;
					break;
				}
			}

			if (isOtherProduct) {
				System.out.println("『 " + item + " 』は指定の商品ではありません");
			}
		}
	}
}