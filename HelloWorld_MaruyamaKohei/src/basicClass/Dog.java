package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	// 動物の名前を表す変数
	private String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	// 動物の数を表す変数
	private int count;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// コンストラクタで変数に"犬"を代入
	public Dog() {
		name = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	// 引数を受け取って変数に代入
	public Dog(int count) {
		this.count = count;
	}

	// 変数の値を返す
	public String getName() {
		return name;
	}

	// 変数の値を返す
	public int getCount() {
		return count;
	}
}