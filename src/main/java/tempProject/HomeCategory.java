
package tempProject;

import java.util.*;

public class HomeCategory {
	static String Appliances[][] = { { "Washing Machine", "Refrigerator", "Cloth Dryer", "Freezer   ", "AC        " },
			{ "$500", "$600", "$400", "$300", "$450" } };
	static String Cooking[][] = { { "Stove     ", "Oven     ", "Grinder    ", "FruitMixer", "Plate     " },
			{ "$100", "$200", "$250", "$200", "$10" } };
	static String Cleaning[][] = { { "VaccumCleaner", "DishWasher", "Detergent", "Squeegee", "Mop     " },
			{ "$50", "$30", "$70", "$20", "$10" } };
	static String Gadgets[][] = { { "Google Nest", "Amazon Echo", "Doorbell", "Television", "Computer" },
			{ "$500", "$400", "$700", "$20", "$1000" } };
	static String Security[][] = { { "CCTV        ", "Alaram    ", "Doorbell", "Door-Lock", "Warning Sticker" },
			{ "$100", "$30", "$70", "$8", "$6" } };
	
	public void Appliances() {
		
		System.out.println("=====================================");
		System.out.println("Appliances\t\tPrice");
		System.out.println("=====================================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Appliances[0][j] + "\t\t" + Appliances[1][j]);
		}
		System.out.println("=====================================");

	}
	public void Cooking() {
		
		System.out.println("==============================");
		System.out.println("Cooking\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Cooking[0][j] + "\t\t" + Cooking[1][j]);
		}
		System.out.println("==============================");

	}
	public void Cleaning() {
		
		System.out.println("==============================");
		System.out.println("Cleaning\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Cleaning[0][j] + "\t\t" + Cleaning[1][j]);
		}
		System.out.println("==============================");

	}
	public void Gadgets() {
		
		System.out.println("==============================");
		System.out.println("Gadgets\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Gadgets[0][j] + "\t\t" + Gadgets[1][j]);
		}
		System.out.println("==============================");

	}
	public void Security() {
		
		System.out.println("==============================");
		System.out.println("Security\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Security[0][j] + "\t\t" + Security[1][j]);
		}
		System.out.println("==============================");

	}
}
