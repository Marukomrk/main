package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("ユーザー名を入力してください: ");
		String name = scanner.nextLine();
		System.out.println("ユーザー名「" + name + "」を登録しました");

		while (true) {
			System.out.print("自分の手を入力してください（0: グー, 1: チョキ, 2: パー）: ");
			int userHand = scanner.nextInt();
			if (userHand < 0 || userHand > 2) {
				System.out.println("不正な手です。もう一度入力してください。");
				continue;
			}

			int opponentHand = random.nextInt(3);

			System.out.println(name + "の手は「" + getHandName(userHand) + "」");
			System.out.println("相手の手は「" + getHandName(opponentHand) + "」");

			if (userHand == opponentHand) {
				System.out.println("引き分けです。もう一度じゃんけんしてください。");
			} else if ((userHand == 0 && opponentHand == 1) || (userHand == 1 && opponentHand == 2)
					|| (userHand == 2 && opponentHand == 0)) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				break;
			} else {
				System.out.println("相手の勝ちです。もう一度じゃんけんしてください。");
			}
		}
	}

	public static String getHandName(int hand) {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "不正な手";
		}
	}
}