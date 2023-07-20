
package com.digit.Project.ecommerce;

import java.util.*;

public class SportsCategory {
	static String Football[][] = { { "Cleats  ", "Wipers  ", "Girdles  ", "Thigh Pads", "Knee Pads" },
			{ "$20", "$17", "$18", "$10", "$30" } };
	static String Sportswears[][] = { { "Tshirt   ", "Shoe    ", "Tracks  ", "HeadBand", "Glove   " },
			{ "$50", "$20", "$30", "$20", "$10" } };
	static String Cricket[][] = { { "Bat    ", "Ball   ", "Gloves", "KneePad", "Helmet" },
			{ "$50", "$30", "$70", "$20", "$10" } };
	static String Bicycles[][] = { { "Giant", "Trek", "GT", "Montra", "Btwin" },
			{ "$50", "$20", "$70", "$20", "$10" } };
	static String Rackets[][] = { { "Yonex", "Victor", "Ashaway", "Wilson", "FZForza" },
			{ "$3", "$3", "$7", "$8", "$6" } };
	public void Football() {
		
		System.out.println("==============================");
		System.out.println("Football\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Football[0][j] + "\t\t" + Football[1][j]);
		}
		System.out.println("==============================");

	}
	public void Sportswears() {
		
		System.out.println("==============================");
		System.out.println("Sportswears\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Sportswears[0][j] + "\t\t" + Sportswears[1][j]);
		}
		System.out.println("==============================");

	}
	public void Cricket() {
		
		System.out.println("==============================");
		System.out.println("Cricket\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Cricket[0][j] + "\t\t" + Cricket[1][j]);
		}
		System.out.println("==============================");

	}
	public void Bicycles() {
		
		System.out.println("==============================");
		System.out.println("Bicycles\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Bicycles[0][j] + "\t\t" + Bicycles[1][j]);
		}
		System.out.println("==============================");

	}
	public void Rackets() {
		
		System.out.println("==============================");
		System.out.println("Rackets\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Rackets[0][j] + "\t\t" + Rackets[1][j]);
		}
		System.out.println("==============================");

	}
}
