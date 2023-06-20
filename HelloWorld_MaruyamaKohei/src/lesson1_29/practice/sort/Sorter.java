package lesson1_29.practice.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Sorter {
	// 都道府県の情報を配列で保持
	private static final String[] prefectures = {
			"北海道:札幌市:83424",
			"青森県:青森市:9646",
			"岩手県:盛岡市:15275",
			"宮城県:仙台市:7282",
			"秋田県:秋田市:11638",
			"山形県:山形市:9323",
			"福島県:福島市:13784",
			"茨城県:水戸市:6097",
			"栃木県:宇都宮市:6408",
			"群馬県:前橋市:6362",
			"埼玉県:さいたま市:3798"
	};

	// 都道府県をソートするメソッド
	private int[] indices;

	public Sorter(String inputIndices) {
		// 入力されたインデックスをカンマで分割して配列に格納
		String[] indicesString = inputIndices.split(",");
		indices = new int[indicesString.length];

		// 文字列を整数に変換してインデックス配列に格納
		for (int i = 0; i < indicesString.length; i++) {
			indices[i] = Integer.parseInt(indicesString[i].trim());
		}
	}

	public String[] sortPrefectures(boolean ascending) {
		// ソートされた都道府県の情報を格納するための配列を作成
		String[] sortedPrefectures = new String[indices.length];

		// 指定されたインデックスに対応する都道府県情報をソート配列にコピー
		for (int i = 0; i < indices.length; i++) {
			sortedPrefectures[i] = prefectures[indices[i]];
		}

		// 都道府県名を基準に昇順でソート
		Arrays.sort(sortedPrefectures, Comparator.comparing(p -> p.split(":")[0]));

		// 降順を指定された場合は配列を逆順にソート
		if (!ascending) {
			Arrays.sort(sortedPrefectures, Comparator.reverseOrder());
		}

		// ソートされた都道府県の情報を返す
		return sortedPrefectures;
	}

	public void printPrefectures(String[] prefectures) {

		for (String prefecture : prefectures) {
			// 都道府県情報を分割
			String[] parts = prefecture.split(":");
			String prefectureName = parts[0];
			String city = parts[1];
			double area = Double.parseDouble(parts[2]) / 1;

			// 都道府県名を表示
			System.out.println("都道府県名：" + prefectureName);
			// 県庁所在地を表示
			System.out.println("県庁所在地：" + city);
			// 面積を表示（小数点以下1桁の形式で表示）
			System.out.println("面積：" + area + "km2\n");
		}
	}
}