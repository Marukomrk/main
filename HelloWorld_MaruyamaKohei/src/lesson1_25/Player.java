package lesson1_25;

import java.util.Random;

public class Player extends Character {

    public Player(String name) {
        // スーパークラスのコンストラクタを呼び出す
        super(name,0,0,0,0,0);
    }

    public void randomizeStats() {
        Random random = new Random();
        // HPをランダムに設定
        setHp(random.nextInt(1000) + 1);
        // MPをランダムに設定
        setMp(random.nextInt(1000) + 1);
        // 攻撃力をランダムに設定
        setAttack(random.nextInt(500) + 1);
        // 素早さをランダムに設定
        setAgility(random.nextInt(1000) + 1);
        // 防御力をランダムに設定
        setDefense(random.nextInt(50) + 1);
    }

    public void outputDetails() {
        // メッセージを出力
        System.out.println("こんにちは " + getName() + " さん");
        // メッセージを出力
        System.out.println("ステータス");
        // HPを出力
        System.out.println("HP：" + getHp());
        // MPを出力
        System.out.println("MP：" + getMp());
        // 攻撃力を出力
        System.out.println("攻撃力：" + getAttack());
        // 素早さを出力
        System.out.println("素早さ：" + getAgility());
        // 防御力を出力
        System.out.println("防御力：" + getDefense());
    }
}