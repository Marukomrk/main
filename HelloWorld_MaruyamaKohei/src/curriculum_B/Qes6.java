package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		// ランダムな数値を生成するためのRandomオブジェクト
		Random random = new Random();
		// キーボード入力からのデータを読み取る
		Scanner scanner = new Scanner(System.in);

		// 最大台数
		int maxCount = 11;

		// 入力処理
		// ユーザーからの入力を取得
		String[] inputArr = scanner.nextLine().split("、");

		// 商品ごとの処理
		String message = "";
		int remainingCount = random.nextInt(maxCount + 1);

		// 商品の数だけ繰り返し
		for (String item : inputArr) {

			// 商品リストの各要素を順番に取り出す
			// 一致するかどうかを確認
			switch (item) {
			case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器":
				message = item + "の残り台数は" + remainingCount + "台です" + "\n";
				break;

			case "テレビ", "ディスプレイ":
				remainingCount = item.equals("ディスプレイ")
						? maxCount - remainingCount
						: remainingCount;
				message = item + "の残り台数は" + remainingCount + "台です" + "\n";
				break;

			default:
				message = "『 " + item + " 』は指定の商品ではありません";
			}
			System.out.println(message);
		}
		scanner.close();
	}
}