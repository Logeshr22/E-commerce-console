package tempProject;

import java.util.*;

public class FurnitureCategory {
	static String Tables[][] = { { "Bluewood", "Nilkamal", "Hometown", "SpaceWood", "Godrej  " },
			{ "$200", "$170", "$180", "$150", "$300" } };
	static String Chairs[][] = { { "Adiko  ", "Amardeep", "De Bono", "Durian", "Element  " },
			{ "$500", "$130", "$100", "$120", "$100" } };
	static String beds[][] = { { "DuroFlex", "LivPure ", "Kurl-On ", "Sleepwell", "WakeFit " },
			{ "$500", "$300", "$700", "$200", "$100" } };
	static String desks[][] = { { "TOPSKY  ", "Coavas  ", "IKEA    ", "FlexiSpot", "Red-Barrel" },
			{ "$500", "$100", "$700", "$200", "$100" } };
	static String cupBoards[][] = { {  "TOPSKY  ", "Coavas  ", "IKEA    ", "FlexiSpot", "Red-Barrel"},
			{ "$500", "$30", "$70", "$20", "$10" } };
	
	public void Tables() {
		
		System.out.println("==============================");
		System.out.println("Tables\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Tables[0][j] + "\t\t" + Tables[1][j]);
		}
		System.out.println("==============================");

	}
	public void Chairs() {

		System.out.println("==============================");
		System.out.println("Chairs\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Chairs[0][j] + "\t\t" + Chairs[1][j]);
		}
		System.out.println("==============================");

	}
	public void beds() {
		
		System.out.println("==============================");
		System.out.println("Beds\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(beds[0][j] + "\t\t" + beds[1][j]);
		}
		System.out.println("==============================");

	}
	public void desks() {
		
		System.out.println("==============================");
		System.out.println("Desks\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(desks[0][j] + "\t\t" + desks[1][j]);
		}
		System.out.println("==============================");

	}
	public void cupBoards() {
		
		System.out.println("==============================");
		System.out.println("Cup-Boards\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(cupBoards[0][j] + "\t\t" + cupBoards[1][j]);
		}
		System.out.println("==============================");

	}
}
