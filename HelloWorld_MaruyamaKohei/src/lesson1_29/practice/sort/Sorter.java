package lesson1_29.practice.sort;

public class Sorter {
	// 都道府県名を表す変数
	private String name;
	// 県庁所在地を表す変数
	private String capital;
	// 面積を表す変数
	private double area;

	// コンストラクタの引数を使って、インスタンスの各変数を初期化する
	public Sorter(String name, String capital, double area) {
		// 都道府県名を設定
		this.name = name;
		// 県庁所在地を設定
		this.capital = capital;
		// 面積を設定
		this.area = area;
	}

	public String getName() {
		// 都道府県名を取得して返す
		return name;
	}

	public String getCapital() {
		// 県庁所在地を取得して返す
		return capital;
	}

	public double getArea() {
		// 面積を取得して返す
		return area;
	}
}