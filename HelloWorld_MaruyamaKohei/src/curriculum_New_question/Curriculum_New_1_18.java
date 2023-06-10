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

	//Q1
	public static void printMessage(String message, int number) {
		System.out.println(message + "\n");
	}

	// Q2
	public static void multiplyNumbers(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result + "\n");
	}

	// Q3
	public static void printArrayElements(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	// Q4
	public static void addNumbers(double num1, double num2) {
		double result = num1 + num2;

		System.out.println("\n" + result + "\n");
	}

	// Q5
	public static int[] generateRandomNumbers(int count) {
		Random random = new Random();
		int[] randomArray = new int[count];
		for (int i = 0; i < count; i++) {
			randomArray[i] = random.nextInt(100) + 1;
		}
		return randomArray;
	}

	// Q6
	public static double calculateAverage(int[] array) {
		int sum = 0;
		for (int element : array) {
			sum += element;
		}
		double average = (double) sum / array.length;
		return average;
	}

	// Q7
	public static boolean isGreaterThan50(double number) {
		return number >= 50;
	}
}