package jp.ac.chibafjb.x15g015.kd152;

import java.util.Scanner;

public class x15g015 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		float a = sin.nextFloat();
		System.out.println("円周 = "+2*3.14*a);
		System.out.println("面積 = "+3.14*a*a);
	}

}
