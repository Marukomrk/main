package lesson1_25;

import java.util.Random;

public class Player extends Character {
	private String name; // 名前

	public Player(String name) {
		super(0, 0, 0, 0, 0); // スーパークラスのコンストラクタを呼び出す
		this.name = name; // 名前を設定する
	}

	public void randomizeStats() {
		Random random = new Random();
		setHp(random.nextInt(1000) + 1); // HPをランダムに設定
		setMp(random.nextInt(1000) + 1); // MPをランダムに設定
		setAttack(random.nextInt(500) + 1); // 攻撃力をランダムに設定
		setAgility(random.nextInt(1000) + 1); // 素早さをランダムに設定
		setDefense(random.nextInt(50) + 1); // 防御力をランダムに設定
	}

	public void outputDetails() {
		System.out.println("こんにちは " + this.getName() + " さん"); // メッセージを出力
		System.out.println("ステータス"); // メッセージを出力
		System.out.println("HP：" + this.getHp()); // HPを出力
		System.out.println("MP：" + this.getMp()); // MPを出力
		System.out.println("攻撃力：" + this.getAttack()); // 攻撃力を出力
		System.out.println("素早さ：" + this.getAgility()); // 素早さを出力
		System.out.println("防御力：" + this.getDefense()); // 防御力を出力
	}

	// 名前を取得
	public String getName() {
		return name;
	}

	// 名前を設定
	public void setName(String name) {
		this.name = name;
	}
}