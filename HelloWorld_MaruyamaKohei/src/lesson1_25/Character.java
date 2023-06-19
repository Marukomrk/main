package lesson1_25;

public class Character {
	// 名前
	private String name;
	// HP
	private int hp;
	// MP
	private int mp;
	// 攻撃力
	private int attack;
	// 素早さ
	private int agility;
	// 防御力
	private int defense;

	// それぞれを初期化
	public Character(String name, int hp, int mp, int attack, int agility, int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.agility = agility;
		this.defense = defense;
	}

	// 名前の取得
	public String getName() {
		return name;
	}

	// 名前の設定
	public void setName(String name) {
		this.name = name;
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