package com.gmail.klewzow;

public class Main {

	public static void main(String[] args) {

		FactorialThread[] trArr = new FactorialThread[100];
		for (int i = 0; i < trArr.length; i++) {
			trArr[i] = new FactorialThread();
			Thread tr = new Thread(trArr[i], Integer.toString((i + 1)*10 ));
			tr.start();
			try {
				tr.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (FactorialThread ft : trArr) {
			System.out.println(ft.toString());
		}
	}
}
