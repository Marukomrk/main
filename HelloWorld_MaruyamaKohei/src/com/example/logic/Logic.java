package com.example.logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logic {
	private LocalDateTime currentDateTime;

	public Logic() {
		this.currentDateTime = LocalDateTime.now();
	}

	public void outputMessages() {
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
		System.out.println("今の現在日時は" + formatDateTime(currentDateTime) + "です");
	}

	private String formatDateTime(LocalDateTime dateTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return dateTime.format(formatter);
	}
}