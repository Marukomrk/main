package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				// 式を出力
				System.out.printf("%03d ＊ %03d = %03d", i, j, result);
				if (j < 9) {
					// 式と式の間にパイプ記号を出力
					System.out.print(" | | ");
				}
			}
			// 行の終わりに改行を出力
			System.out.println("\n");
		}
	}
}