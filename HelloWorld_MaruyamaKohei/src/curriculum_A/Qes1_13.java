package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		System.out.println("Q1 下記9個をローカル変数として宣言のみしてください");
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean bool;

		System.out.println("byte b;");
		System.out.println("short s;");
		System.out.println("int i;");
		System.out.println("long l;");
		System.out.println("float f;");
		System.out.println("double d;");
		System.out.println("char c;");
		System.out.println("String str;");
		System.out.println("boolean bool;");

		System.out.println("\n" + "Q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください");
		// 変数の初期化
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0;
		c = '\u0000';
		str = null;
		bool = false;

		System.out.println("b = 0;");
		System.out.println("s = 0;");
		System.out.println("i = 0;");
		System.out.println("l = 0L;");
		System.out.println("f = 0.0f;");
		System.out.println("d = 0.0;");
		System.out.println("c = '\\u0000';");
		System.out.println("str = null;");
		System.out.println("bool = false;");

		System.out.println("\n" + "Q3 初期化をしたそれぞれの変数に値を代入してください");
		b = 10;
		s = 100;
		i = 1000;
		l = 10000L;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "ハロー";
		bool = true;

		System.out.println("b = 10;");
		System.out.println("s = 100;");
		System.out.println("i = 1000;");
		System.out.println("l = 10000L;");
		System.out.println("f = 9.5f;");
		System.out.println("d = 10.5;");
		System.out.println("c = 'a';");
		System.out.println("str = \"ハロー\";");
		System.out.println("bool = true;");

		System.out.println("\n" + "Q4 下記の通りにコンソール出力されるようにしてください");
		// 「11110」と出力
		System.out.println(b + s + i + l);
		// 「20」と出力
		System.out.println(s / 5);
		// 「a ハロー true」と出力
		System.out.println(c + " " + str + " " + bool);
		// 「11130」と出力
		System.out.println((b * 3) + s + i + l);
		// 「10000000000」と出力
		System.out.println(b * s * i * l);
		// 「0.105」と出力
		System.out.println(d / s);
		// 「-90」と出力
		System.out.println(b - s);

		System.out.println("\n" + "Q5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。");
		System.out.println("「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。");

		int num = 20;
		int num1 = 23;
		// 「ハローJAVA43」と出力
		System.out.println("ハローJAVA" + (num + num1));

		System.out.println("\n" + "Q6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください");
		System.out.println("ローカル変数に代入する");
		System.out.println("『山田太郎 18歳 170.5cm 62.2kg 寿司』");
		// フォーマットに使用する変数を宣言し、値を代入する
		String name = "山田太郎";
		int age = 18;
		double height = 170.5f;
		double weight = 62.2f;
		String favoriteFood = "寿司";

		// 「初めまして山田太郎です」と出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は18歳です」と出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長は170.5cmです」と出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は62.2kgです」と出力
		System.out.println("体重は" + String.format("%.1f", weight) + "kgです");
		// 「好きな食べ物は寿司です」と出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		System.out.println("\n" + "Q7 Q6で作成した自己紹介に続いてBMIが出力されるようにしてください");
		System.out.println("ただし計算は数値を直書きせず、全て変数を使ってすること");
		// BMIを計算して出力
		double bmi = weight / ((height / 100) * (height / 100));
		// 「BMIは○○です」と出力
		System.out.println("BMIは " + String.format("%.1f", bmi) + "です");

		System.out.println("\n" + "Q8 Q6で宣言した変数に再代入しコンソールに出力してください");
		// フォーマットに使用する変数を宣言し、値を再代入する
		name = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		favoriteFood = "オムライス";

		// 「初めまして鈴木一郎です」と出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は24歳です」と出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長168.5cmです」と出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は64.2kgです」と出力
		System.out.println("体重は" + String.format("%.1f", weight) + "kgです");
		// 「好きな食べ物はオムライスです」と出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		// BMIを計算して出力
		bmi = weight / ((height / 100) * (height / 100));
		// 「BMIは22.6です」と出力
		System.out.println("BMIは " + String.format("%.1f", bmi) + "です");

		System.out.println("\n" + "Q9 Q8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください");

		// 変数の値を和算して自己代入する
		age += age;
		height += height;
		weight += weight;

		// フォーマットに従って出力
		// 「初めまして鈴木一郎です」と出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は48歳です」と出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長337.0cmです」と出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は128.4kgです」と出力
		System.out.println("体重は" + String.format("%.1f", weight) + "kgです");
		// 「好きな食べ物はオムライスです」と出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		// BMIを計算して出力
		bmi = weight / ((height / 100) * (height / 100));
		// 「BMIは11.31です」と出力
		System.out.println("BMIは " + String.format("%.2f", bmi) + "です");

		System.out.println("\n" + "Q10 Q8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません");
		age = 24;
		boolean isAbove25 = age >= 25 ? true : false;
		// 年齢が25歳以上かどうかを出力する
		System.out.println(isAbove25);

		System.out.println("\n" + "Q11 Q8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください");
		height = 168.5;
		weight = 64.2;

		String stringAge = String.valueOf(age);
		String stringHeight = String.valueOf(height);
		String result = stringAge + stringHeight + String.valueOf(weight);
		System.out.println(result);

		System.out.println("\n" + "Q12 Q11で変換した【年齢・身長】を整数型に変換して出力してください");
		// 年齢と身長の文字列を整数型として変換し、結果を出力する

		age = Integer.parseInt(stringAge);
		int heightInt = (int) Double.parseDouble(stringHeight);

		System.out.println("年齢: " + age);
		System.out.println("身長: " + heightInt);

		System.out.println("\n" + "Q13 Q12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください");
		System.out.println("ただしif文は使わないでください");
		// 初期化し、結果を出力する
		boolean isAgeOrHeightValid = age >= 25 || heightInt >= 160;
		System.out.println(isAgeOrHeightValid);
	}
}