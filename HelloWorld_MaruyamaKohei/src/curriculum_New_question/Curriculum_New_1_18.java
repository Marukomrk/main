package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	public static void main(String[] args) {

		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		printMessage("Hello JavaSE 11", 5);

		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		multiplyNumbers(3, 4);

		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		int[] array = { 1, 2, 3, 4, 5 };
		printArrayElements(array);

		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		addNumbers(2.5, 3.7);

		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		int[] randomArray = generateRandomNumbers(5);
		printArrayElements(randomArray);
		System.out.print("\n");

		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		double average = calculateAverage(randomArray);
		System.out.println("Average: " + average);
		System.out.print("\n");

		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		boolean isAbove50 = isGreaterThan50(average);
		System.out.println(isAbove50);
	}

	//Q1 引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
	public static void printMessage(String message, int number) {
		// コンソールにメッセージを出力
		System.out.println(message + "\n");
	}

	// Q2 引数同士を乗算しコンソールに出力するメソッド
	public static void multiplyNumbers(int num1, int num2) {
		// 乗算結果を計算
		int result = num1 * num2;
		// コンソールに結果を出力
		System.out.println(result + "\n");
	}

	// Q3 引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
	public static void printArrayElements(int[] array) {
		// 配列の各要素を順番に取り出す
		for (int element : array) {
			// コンソールに出力
			System.out.println(element);
		}
	}

	// Q4 引数同士を和算しコンソールに出力するメソッド
	public static void addNumbers(double num1, double num2) {
		// 和算結果を計算
		double result = num1 + num2;
		// コンソールに結果を出力
		System.out.println("\n" + result + "\n");
	}

	/* Q5 引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して、
	格納した値を順番にコンソールで出力後、格納した値を返すメソッド */
	public static int[] generateRandomNumbers(int count) {
		// ランダムな数字を生成するためのRandomオブジェクトを作成
		Random random = new Random();
		// 指定された要素数の配列を作成
		int[] randomArray = new int[count];
		// 指定された回数分、ランダムな数字を生成して配列に格納し、コンソールに出力
		for (int i = 0; i < count; i++) {
			randomArray[i] = random.nextInt(100) + 1;
		}
		// 生成したランダムな数字が格納された配列を返す
		return randomArray;
	}

	// Q6 引数として渡された整数の配列の平均値を計算するメソッド
	public static double calculateAverage(int[] array) {
		// 合計値を初期化する変数
		int sum = 0;
		// 配列の各要素を順番に取り出すループ
		for (int element : array) {
			// 合計値に各要素を加算する
			sum += element;
		}
		// 要素の合計値を配列の長さで割って平均値を計算
		double average = (double) sum / array.length;
		// 計算した平均値を返す
		return average;
	}

	// Q7 数値が50より大きいかどうかを判定するメソッド
	public static boolean isGreaterThan50(double number) {
		// 数値が50以上かどうかを判定する
		return number >= 50;
	}
}