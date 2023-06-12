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
		Scanner scanner = new Scanner(System.in); // キーボード入力からのデータを読み取る
		String input = scanner.nextLine(); // ユーザーからの入力を取得
		String[] inputArr = input.split("、"); // ユーザーが入力した商品名を個別の要素として取得

		// 商品ごとの処理
		for (String item : inputArr) { // ユーザーの入力が商品名ごとに分割されて格納
			boolean isOtherProduct = true;
			// 商品リストの各要素を順番に取り出す
			for (String product : products) {
				// 一致するかどうかを確認
				if (item.equals(product)) {
					// 残り台数の計算
					int remainingCount = item.equals("テレビ") || item.equals("ディスプレイ")
							? maxCount - random.nextInt(maxCount + 1)
							: random.nextInt(maxCount + 1);

					// 出力メッセージの作成
					String message = item + "の残り台数は" + remainingCount + "台です" + "\n";
					System.out.println(message);

					// 商品の一致が見つかった場合に、ループを終了するための処理
					isOtherProduct = false;
					break;
				}
			}
			// 商品リストに含まれていない商品名が入力された場合に、商品名を出力する 
			if (isOtherProduct) {
				System.out.println("『 " + item + " 』は指定の商品ではありません");
			}
		}
	}
}