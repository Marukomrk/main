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

	// 各フィールドのgetterとsetter

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}