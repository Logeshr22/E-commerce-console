package tempProject;

import java.util.*;

public class ElectronicsCategory {
	static String Laptops[][] = { { "Apple", "Asus", "MSI", "Dell", "Razer" },
			{ "$2000", "$1700", "$1800", "$1500", "$3000" } };
	static String Mobiles[][] = { { "iPhone  ", "Samsung  ", "Sony       ", "Asus      ", "Motorola" },
			{ "$1500", "$1300", "$1700", "$1200", "$1000" } };
	static String Tablets[][] = { { "Lenovo  ", "Samsung  ", "Microsoft", "iPad    ", "Acer    " },
			{ "$1500", "$1300", "$1700", "$1200", "$1000" } };
	static String TV[][] = { { "Bravia", "Samsung", "OnePlus", "LG", "Xiaomi" },
			{ "$1500", "$1300", "$1700", "$1200", "$1000" } };
	static String Speakers[][] = { { "Sony    ", "Boat    ", "SkullCandy", "BOSE    ", "Marshall" },
			{ "$500", "$300", "$700", "$200", "$1000" } };
	
	public void Laptops() {
		System.out.println("==============================");
		System.out.println("Laptops\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Laptops[0][j] + "\t\t" + Laptops[1][j]);
		}
		System.out.println("==============================");

	}
	public void Mobiles() {
		System.out.println("==============================");
		System.out.println("Mobiles\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Mobiles[0][j] + "\t\t" + Mobiles[1][j]);
		}
		System.out.println("==============================");

	}
	public void Tablets() {
		System.out.println("==============================");
		System.out.println("Tablets\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Tablets[0][j] + "\t\t" + Tablets[1][j]);
		}
		System.out.println("==============================");

	}
	public void TV() {
		System.out.println("==============================");
		System.out.println("TV\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(TV[0][j] + "\t\t" + TV[1][j]);
		}
		System.out.println("==============================");

	}
	public void Speakers() {
		System.out.println("==============================");
		System.out.println("Speakers\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Speakers[0][j] + "\t\t" + Speakers[1][j]);
		}
		System.out.println("==============================");

	}
}
class LaptopSpecs{
	public void apple() {
		String Brand = "Apple";
		String Processor = "M2 Pro";
		String RAM = "16 GB";
		String Storage = "2TB";
	}
}
