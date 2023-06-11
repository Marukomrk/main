package lesson1_25;

public class Player extends Character {
	private String name; // 名前

	public Player(String name) {
		super(849, 862, 375, 937, 24);
		this.name = name;
	}

	public void outputDetails() {
		System.out.println("こんにちは " + this.getName() + " さん");
		System.out.println("ステータス");
		System.out.println("HP：" + this.getHp());
		System.out.println("MP：" + this.getMp());
		System.out.println("攻撃力：" + this.getAttack());
		System.out.println("素早さ：" + this.getAgility());
		System.out.println("防御力：" + this.getDefense());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}