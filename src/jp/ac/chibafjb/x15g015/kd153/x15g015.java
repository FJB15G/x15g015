package jp.ac.chibafjb.x15g015.kd153;

import java.util.Scanner;

public class x15g015 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		float a = sin.nextFloat();
		System.out.println("円周 = "+Math.round((2*3.14*a)*100)/100.0f);
		System.out.println("面積 = "+Math.round((3.14*a*a)*100)/100.0f);
	}

}


