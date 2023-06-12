package lesson1_25;

public class Character {
	private int hp; // HP
	private int mp; // MP
	private int attack; // 攻撃力
	private int agility; // 素早さ
	private int defense; // 防御力

	public Character(int hp, int mp, int attack, int agility, int defense) {
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.agility = agility;
		this.defense = defense;
	}

	// HPの取得
	public int getHp() {
		return hp;
	}

	// HPの設定
	public void setHp(int hp) {
		this.hp = hp;
	}

	// MPの取得
	public int getMp() {
		return mp;
	}

	// MPの設定
	public void setMp(int mp) {
		this.mp = mp;
	}

	// 攻撃力の取得
	public int getAttack() {
		return attack;
	}

	// 攻撃力の設定
	public void setAttack(int attack) {
		this.attack = attack;
	}

	// 素早さの取得
	public int getAgility() {
		return agility;
	}

	// 素早さの設定
	public void setAgility(int agility) {
		this.agility = agility;
	}

	// 防御力の取得
	public int getDefense() {
		return defense;
	}

	// 防御力の設定
	public void setDefense(int defense) {
		this.defense = defense;
	}
}