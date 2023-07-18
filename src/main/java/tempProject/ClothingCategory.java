
import java.util.*;

public class ClothingCategory {
	static String Shirts[][] = { { "Allen Solly", "Levis   ", "Arrow   ", "Wrangler", "Jack&Jones" },
			{ "$20", "$17", "$18", "$10", "$30" } };
	static String Trousers[][] = { { "Park Avenue", "Pepe Jeans", "Arrow   ", "Louis Phillipe", "Levis   " },
			{ "$50", "$20", "$30", "$20", "$10" } };
	static String Tshirts[][] = { { "Levis    ", "Lee     ", "Crocodile", "UCB      ", "Van Heusen" },
			{ "$50", "$30", "$70", "$20", "$10" } };
	static String Shoes[][] = { { "Nike    ", "Adidas     ", "Puma    ", "Asics    ", "Skechers" },
			{ "$50", "$20", "$70", "$20", "$10" } };
	static String InnerWears[][] = { { "Jockey", "Clovia", "Amante", "Levis", "Hanes" },
			{ "$3", "$3", "$7", "$8", "$6" } };
	public void Shirts() {

		System.out.println("==============================");
		System.out.println("Shirts\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Shirts[0][j] + "\t\t" + Shirts[1][j]);
		}
		System.out.println("==============================");

	}
	public void Trousers() {
		
		System.out.println("==============================");
		System.out.println("Trousers\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Trousers[0][j] + "\t\t" + Trousers[1][j]);
		}
		System.out.println("==============================");

	}
	public void Tshirts() {
		
		System.out.println("==============================");
		System.out.println("Tshirts\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Tshirts[0][j] + "\t\t" + Tshirts[1][j]);
		}
		System.out.println("==============================");

	}
	public void Shoes() {
		
		System.out.println("==============================");
		System.out.println("Shoes\t\t\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(Shoes[0][j] + "\t\t" + Shoes[1][j]);
		}
		System.out.println("==============================");

	}
	public void InnerWears() {
		
		System.out.println("==============================");
		System.out.println("InnerWear\tPrice");
		System.out.println("==============================");
		for (int j = 0; j < 5; j++) {
			System.out.println(InnerWears[0][j] + "\t\t" + InnerWears[1][j]);
		}
		System.out.println("==============================");

	}
}
