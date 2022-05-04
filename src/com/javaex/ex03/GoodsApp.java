package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Goods> gList = new ArrayList<Goods>();

		System.out.println("상품을 입력해주세요. (종료 q)");

		while (true) {
			String input = sc.next();
			if (input.equals("q")) {
				break;
			} else {
				String[] array = input.split(",");
				String name = array[0];
				int price = Integer.parseInt(array[1]);
				int count = Integer.parseInt(array[2]);

				Goods g = new Goods(name, price, count);
				gList.add(g);
			}
		}
		for (int i = 0; i < gList.size(); i++) {
			gList.get(i).show();
		}
	}

}
