package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// 行を反復処理する
		for (int i = 1; i <= 9; i++) {
			// 列を反復処理する
			for (int j = 1; j <= 20; j++) {
				// 乗算の結果を計算する
				int result = j * i;

				// 式を出力
				System.out.printf("%03d × %03d = %03d" + (j == 20 ? "\n" : " | | "), j, i, result);

			}
		}
	}
}