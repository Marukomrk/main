package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 20; j++) {
                int result = j * i;
                // 式を出力
                String formattedResult = String.format("%03d", result);
                System.out.printf("%03d ＊ %03d = %s", j, i, formattedResult);
                if (j < 20) {
                    // 式と式の間にパイプ記号を出力
                    System.out.print(" | | ");
                }
            }
            // 行の終わりに改行を出力
            System.out.println("\n");
        }
    }
}