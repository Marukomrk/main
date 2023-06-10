package curriculum_B;

import java.util.Objects;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		login();
	}

	public static void login() {
		// コンソールにユーザー名を入力できるようにする
		Scanner scanner = new Scanner(System.in);
		// ユーザー名の入力
		System.out.print("ユーザー名を入力してください: ");
		String username = scanner.nextLine();
		// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
		if (Objects.isNull(username) || username.length() <= 0) {
			System.out.println("名前を入力してください");
			// ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
		} else if (username.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
			// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		} else if (!username.matches("[a-zA-Z0-9]+")) {
			System.out.println("半角英数字のみで名前を入力してください");
			// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
		} else {
			System.out.println("ユーザー名「" + username + "」を登録しました");
		}

		int winCount = 0;
		int totalGames = 0;

		while (winCount == 0) {
			totalGames++;
			// ユーザーの手の入力
			System.out.println(username + "の手は？ (0: グー, 1: チョキ, 2: パー)");
			int userHand = scanner.nextInt();

			// 相手の手をランダムに生成
			int computerHand = (int) (Math.random() * 3);

			// ユーザーと相手の手を表示
			System.out.println(username + "の手は「" + handToString(userHand) + "」");
			System.out.println("相手の手は「" + handToString(computerHand) + "」");

			// じゃんけんの結果を判定
			int result = (userHand - computerHand + 3) % 3;

			if (result == 1) {
				// 勝った場合
				winCount++;
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");

			} else if (result == 2) {
				// 負けた場合
				System.out.println("俺の勝ち！");

				if (computerHand == 0) {
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");

				} else if (computerHand == 1) {
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");

				} else if (computerHand == 2) {
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}

			} else {
				// あいこの場合
				System.out.println("DRAW あいこ もう一回しましょう！");
			}
		}
		// 勝つまでにかかった合計回数の表示
		System.out.println("勝つまでにかかった合計回数は" + totalGames + "回です");

		scanner.close();
	}

	// 数値を手の文字列に変換するメソッド
	private static String handToString(int hand) {
		if (hand == 0) {
			return "グー";
		} else if (hand == 1) {
			return "チョキ";
		} else if (hand == 2) {
			return "パー";
		} else {
			return "不明";
		}
	}
}