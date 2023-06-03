package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		/* 1. 下記9個をローカル変数として宣言のみしてください */
		// バイト型
		byte b;
		// 短整数型
		short s;
		// 整数型
		int i;
		// 長整数型
		long l;
		// 単精度浮動小数点数型
		float f;
		// 倍精度浮動小数点数型
		double d;
		// 文字型
		char c;
		// 文字列型
		String str;
		// ブーリアン型
		boolean bool;

		/* 2. それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください */
		b = 10;
		s = 100;
		i = 1000;
		l = 10000L;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "Hello";
		bool = true;

		/* 3. 初期化をしたそれぞれの変数に下記の値を代入してください 
		 	・バイト型		10
			・短整数型		100
			・整数型		1000
			・長整数型		10000
			・単精度浮動小数点数型		9.5
			・倍精度浮動小数点数型		10.5
			・文字型		a
			・文字列型		ハロー
			・ブーリアン型		true */
		b = 10;
		s = 100;
		i = 1000;
		l = 10000L;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		str = "ハロー";
		bool = true;

		// 4. 下記の通りにコンソール出力されるようにしてください
		// 「11110」と出力
		System.out.println(b + s + i + l);
		// 「20」と出力
		System.out.println(s / 5);
		// 「a ハロー true」と出力
		System.out.println(c + " " + str + " " + bool);
		// 「11130」と出力
		System.out.println((long) b + s + i + l + (int) Math.ceil(f) + (int) d);
		// 「10000000000」と出力
		System.out.println(b * s * i * l);
		// 「0.105」と出力
		System.out.println(d / s);
		// 「-90」と出力
		System.out.println(b - s);

		/* 5. 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
			「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。 */
		int num = 20;
		int num1 = 23;
		// 「ハローJAVA43」と出力
		System.out.println("ハローJAVA" + (num + num1));

		/* 6. 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
			ローカル変数に代入し○○に入れてください
			『山田太郎 18歳 170.5cm 62.2kg 寿司』 */

		// フォーマットに使用する変数を宣言し、値を代入する
		String name = "山田太郎";
		int age = 18;
		float height = 170.5f;
		float weight = 62.2f;
		String favoriteFood = "寿司";

		// フォーマットに従って出力
		// 「初めまして○○です」と出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は○○歳です」と出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長は○○cmです」と出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は○○kgです」と出力
		System.out.println("体重は" + weight + "kgです");
		// 「好きな食べ物は○○です」と出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		/* 7. 6で作成した自己紹介に続いてBMIが出力されるようにしてください
			「BMIは○○です」
			ただし計算は数値を直書きせず、全て変数を使ってすること */

		// BMIを計算して出力
		double bmi = weight / ((height / 100) * (height / 100));
		// 「BMIは○○です」と出力
		System.out.println("BMIは" + bmi + "です");

		/* 8. 6で宣言した変数に再代入し下記の通りコンソールに出力してください
			初めまして鈴木一郎です
			年齢は24歳です
			身長168.5cmです
			体重は64.2kgです
			好きな食べ物はオムライスです
			BMIは22.6です */

		// フォーマットに使用する変数を宣言し、値を再代入する
		name = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		favoriteFood = "オムライス";

		// フォーマットに従って出力
		// 「初めまして鈴木一郎です」と出力
		System.out.println("初めまして" + name + "です");
		// 「年齢は24歳です」と出力
		System.out.println("年齢は" + age + "歳です");
		// 「身長168.5cmです」と出力
		System.out.println("身長は" + height + "cmです");
		// 「体重は64.2kgです」と出力
		System.out.println("体重は" + weight + "kgです");
		// 「好きな食べ物はオムライスです」と出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		// BMIを計算して出力
		bmi = weight / ((height / 100) * (height / 100));
		// 「BMIは22.6です」と出力
		System.out.println("BMIは" + bmi + "です");

		/* 9. 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
			初めまして鈴木一郎です
			年齢は48歳です
			身長337.0cmです
			体重は128.4kgです
			好きな食べ物はオムライスです
			BMIは11.31です */

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
		System.out.println("体重は" + weight + "kgです");
		// 「好きな食べ物はオムライスです」と出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		// BMIを計算して出力
		bmi = weight / ((height / 100) * (height / 100));
		// 「BMIは11.31です」と出力
		System.out.println("BMIは" + bmi + "です");

		/* 10. 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません */
		boolean isAbove25 = age >= 25;
		String result = isAbove25 ? "true" : "false";
		// 年齢が25歳以上かどうかを出力する
		System.out.println(result);

		/* 11. 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください */
		// 年齢、身長、体重を文字列に変換して結合し、結果を出力する
		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf(height);
		String weightStr = String.valueOf(weight);

		result = ageStr + heightStr + weightStr;
		System.out.println(result);

		/* 12. 11で変換した【年齢・身長】を整数型に変換して出力してください */
		// 年齢と身長の文字列を整数型として変換し、結果を出力する
		age = Integer.parseInt(ageStr);
		height = (int) Double.parseDouble(heightStr);

		System.out.println("年齢: " + age);
		System.out.println("身長: " + height);

		/* 13. 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください 
			ただしif文は使わないでください */
		// 初期化し、結果を出力する
		boolean isAgeOrHeightValid = age >= 25 || height >= 160;

		System.out.println(isAgeOrHeightValid);
	}
}