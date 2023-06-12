package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// 入力を受け取るためのScannerオブジェクトを作成する
		Scanner input = new Scanner(System.in);

		System.out.print("生徒の人数を入力してください（2以上）: ");
		// 生徒の人数を入力する
		int numStudents = input.nextInt();
		// 各生徒の4科目の点数を格納する2次元配列
		int[][] grades = new int[numStudents][4];

		// 生徒の成績を入力する
		for (int i = 0; i < numStudents; i++) {
			// 1行目の場合は改行を挿入しない、2行目以降は改行を挿入する
			System.out.print((i == 0 ? "" : "\n") + (i + 1) + "人目の『英語』の点数を入力してください:");
			// 『英語』の点数を入力してもらう
			grades[i][0] = input.nextInt();
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください:");
			// 『数学』の点数を入力してもらう
			grades[i][1] = input.nextInt();
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください:");
			// 『理科』の点数を入力してもらう
			grades[i][2] = input.nextInt();
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください:");
			// 『社会』の点数を入力してもらう
			grades[i][3] = input.nextInt();
		}

		System.out.println();

		// 各生徒の平均点を計算して表示する
		for (int i = 0; i < numStudents; i++) {
			// 平均点を計算する
			double average = calculateAverage(grades[i]);
			// 出力
			System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), average);
		}

		System.out.println();

		// 各教科の平均点を計算して表示する
		String[] subjects = { "英語", "数学", "理科", "社会" };
		for (int i = 0; i < 4; i++) {
			double subjectAverage = calculateSubjectAverage(grades, i);
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[i], subjectAverage);
		}

		double overallAverage = calculateOverallAverage(grades);
		System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
	}

	// 配列の平均値を計算するメソッド
	public static double calculateAverage(int[] array) {
		int sum = 0; // 合計値を初期化する
		for (int value : array) { // 配列の要素を1つずつ取り出して合計値に加える
			sum += value; // 合計値に要素の値を加える
		}
		return (double) sum / array.length; // 平均値を計算して返す
	}

	// 各教科の平均点を計算するメソッド
	public static double calculateSubjectAverage(int[][] array, int subjectIndex) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i][subjectIndex];
		}
		return (double) sum / array.length;
	}

	// 全体の平均点を計算するメソッド
	public static double calculateOverallAverage(int[][] array) {
		int sum = 0;
		int totalNumGrades = array.length * array[0].length;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sum += array[i][j];
			}
		}
		return (double) sum / totalNumGrades;
	}
}