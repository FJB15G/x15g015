package jp.ac.chibafjb.x15g015.kd144;

import java.util.Scanner;

public class x15g015 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner (System.in);
		
		System.out.print("住所の入力 -->");
		String a = sin.next();
		System.out.print("氏名の入力 -->");
		String b = sin.next();
		System.out.print("電話番号の入力 -->");
		String c = sin.next();
		System.out.println();
		System.out.println("<確認>住　　所:"+a);
		System.out.println("　　　氏　　名:"+b);
		System.out.println("　　　電話番号:"+c);
	}

}
