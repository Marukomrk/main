/*
名前を入力したら下記がコンソールに出力されるように作ってください
条件：数値は毎回変わるように作ってください
 	 サブクラスを使用してください
	 スーパークラスを使用してください
	 getterとsetterを使用してください
	 packageを2つ作ってメインと処理を分けてください
	 命名する場合は規則にのっとってください
	 コンストラクタを使用してください

こんにちは 「 名前 」 さん
ステータス
HP：849
MP：862
攻撃力：375
素早さ：937
防御力：24

さあ冒険に出かけよう！
*/

package lesson1_25;

public class Main {
	public static void main(String[] args) {
		// 名前を指定してプレイヤーオブジェクトを作成する
		Player player = new Player("「 名前 」");
		// ステータスをランダムに設定
		player.randomizeStats();
		// ステータスを出力
		player.outputDetails();
		// メッセージを出力する
		System.out.println("\n" + "さあ冒険に出かけよう！");
	}
}