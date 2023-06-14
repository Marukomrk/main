package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		// 行を反復処理する
		for (int row = 1; row <= 9; row++) {
			// 列を反復処理する
			for (int col = 1; col <= 9; col++) {

				// 乗算の結果を計算する
				int result = row * col;

				// 式を出力
				System.out.printf("%02d × %02d = %02d" + (col == 9 ? "\n" : " | | "), row, col, result);
			}
		}
	}
}