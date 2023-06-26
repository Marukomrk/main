/*
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
 */

package lesson1_29.practice.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import lesson1_29.practice.sort.Sorter;

public class Main {
	public static void main(String[] args) {
		// 都道府県情報のリストを作成
		List<Sorter> prefectures = new ArrayList<>();
		// 都道府県情報をリストに追加
		prefectures.add(new Sorter("北海道", "札幌市", 83424));
		prefectures.add(new Sorter("青森県", "青森市", 9646));
		prefectures.add(new Sorter("岩手県", "盛岡市", 15275));
		prefectures.add(new Sorter("宮城県", "仙台市", 7282));
		prefectures.add(new Sorter("秋田県", "秋田市", 11638));
		prefectures.add(new Sorter("山形県", "山形市", 9323));
		prefectures.add(new Sorter("福島県", "福島市", 13784));
		prefectures.add(new Sorter("茨城県", "水戸市", 6097));
		prefectures.add(new Sorter("栃木県", "宇都宮市", 6408));
		prefectures.add(new Sorter("群馬県", "前橋市", 6362));
		prefectures.add(new Sorter("埼玉県", "さいたま市", 3798));

		// ユーザーからの入力を受け取るためのScannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);
		System.out.print("都道府県の配列インデックスを入力してください（カンマ区切り）: ");
		// ユーザーからの入力を文字列として受け取る
		String indexInput = scanner.nextLine();
		System.out.print("並び替え方を選択してください（1: 昇順、2: 降順）: ");
		// ユーザーからの入力を文字列として受け取る
		String orderInput = scanner.nextLine();

		if (!indexInput.isEmpty() && !orderInput.isEmpty()) {
			// インデックスの入力値をカンマで分割し、配列として格納
			String[] indices = indexInput.split(",");
			// 選択されたインデックスのリストを作成
			List<Integer> selectedIndices = new ArrayList<>();

			for (String index : indices) {
				try {
					// 文字列を整数に変換
					int num = Integer.parseInt(index);
					if (num >= 0 && num < prefectures.size()) {
						// 入力された有効なインデックスを選択リストに追加
						selectedIndices.add(num);
					}
					// インデックスが数値ではない場合は無視
				} catch (NumberFormatException e) {
				}
			}

			if (orderInput.equals("1")) {
				// 昇順で選択リストをソート
				Collections.sort(selectedIndices);
			} else if (orderInput.equals("2")) {
				// 降順で選択リストをソート
				Collections.sort(selectedIndices, Collections.reverseOrder());
			}

			// 選択されたインデックスに対応する都道府県情報を出力
			for (int selectedIndex : selectedIndices) {
				Sorter prefecture = prefectures.get(selectedIndex);
				System.out.println("都道府県名：" + prefecture.getName());
				System.out.println("県庁所在地：" + prefecture.getCapital());
				System.out.println("面積：" + prefecture.getArea() + "km2");
				System.out.println();
			}
		} else {
			System.out.println("入力が無効です。");
		}
		
		// Scannerをクローズ
		scanner.close();
	}
}