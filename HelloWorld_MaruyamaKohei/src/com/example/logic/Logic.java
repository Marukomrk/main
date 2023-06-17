package com.example.logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logic {
	private LocalDateTime currentDateTime;

	public Logic() {
		// 現在の日時を取得してフィールドに格納
		this.currentDateTime = LocalDateTime.now();
	}

	public void outputMessages() {
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
		// 現在の日時を取得してメッセージを出力
		// nullチェック
		if (currentDateTime != null) {
			// フォーマットしてメッセージを出力
			System.out.println("今の現在日時は" + formatDateTime(currentDateTime) + "です");
		} else {
			// nullの場合、取得できなかった旨のメッセージを出力
			System.out.println("現在の日時を取得できませんでした");
		}
	}

	private String formatDateTime(LocalDateTime dateTime) {
		// 日時のフォーマットパターンを指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		// フォーマットした日時を返す
		return dateTime.format(formatter);
	}
}