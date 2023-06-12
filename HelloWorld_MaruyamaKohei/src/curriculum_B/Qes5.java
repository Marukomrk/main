package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// iの値によって行の数字が変わる
		for (int i = 1; i <= 9; i++) {
			// jの値によって行の数字が変わる
			for (int j = 1; j <= 20; j++) {
				// iとjの乗算結果を計算
				int result = j * i;
				// 式を出力
				String formattedResult = String.format("%03d", result);
				System.out.printf("%03d ＊ %03d = %s", j, i, formattedResult);
				// 現在の列が最終列ではない場合、式と式の間にパイプ記号を出力
				if (j < 20) {
					System.out.print(" | | ");
				}
			}
			// 行の終わりに改行を出力
			System.out.println("\n");
		}
	}
}