package tempProject;
import java.util.*;
public class EcommerceApplication{
	public static void main(String[] args){
		display ds = new display();
		ds.Display();
	}
}
class display extends Products{
	static int Category;
	void Display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to E-commerce Shopping !");
		System.out.println();
		System.out.println("Select the Category :\n\n 1.Electronics \n 2.Furnitures \n 3.Clothing \n 4.Sports & Outdoors \n 5.Home \n");
		System.out.println();
		Category = sc.nextInt();
		switch(Category) {
		case 1:
			Electronics();
			break;
		case 2:
			Furnitures();
			break;
		case 3:
			Clothing();
			break;
		case 4:
			Sports();
			break;
		case 5:
			Home();
			break;
		default:
			System.out.println("Invalid Input");
		}	
		sc.close();
	}
}
class Products{
	
	static void Electronics() {
		Scanner sc = new Scanner(System.in);
		ElectronicsCategory el = new ElectronicsCategory();
		display ds = new display();
		if(display.Category==1) {
			System.out.println("Select the Sub-Category :\n\n 1.Laptops \n 2.Mobiles \n 3.Tablets \n 4.TV \n 5.Speakers \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				el.Laptops();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ElectronicsCategory.Laptops[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.laptops[1][0]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Thanks for buying "+ElectronicsCategory.Laptops[0][chooseProduct-1]+" Laptop which costs "+ElectronicsCategory.Laptops[1][chooseProduct-1]);
						System.out.println();
						System.out.println("Return to Main Menu ? Yes or No");
						String toMainMenu = sc.next();
						if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
							ds.Display();
						}
						else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
							System.out.println("Thanks for Shopping with us!");
						}
					}
					if(chooseProduct!=0 && (chooseProduct==2)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.laptops[1][1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Thanks for buying "+ElectronicsCategory.Laptops[0][chooseProduct-1]+" Laptop which costs "+ElectronicsCategory.Laptops[1][chooseProduct-1]);
						System.out.println();
						System.out.println("Return to Main Menu ? Yes or No");
						String toMainMenu = sc.next();
						if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
							ds.Display();
						}
						else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
							System.out.println("Thanks for Shopping with us!");
						}
					}
					if(chooseProduct!=0 && (chooseProduct==3)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.laptops[1][2]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Thanks for buying "+ElectronicsCategory.Laptops[0][chooseProduct-1]+" Laptop which costs "+ElectronicsCategory.Laptops[1][chooseProduct-1]);
						System.out.println();
						System.out.println("Return to Main Menu ? Yes or No");
						String toMainMenu = sc.next();
						if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
							ds.Display();
						}
						else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
							System.out.println("Thanks for Shopping with us!");
						}
					}
					if(chooseProduct!=0 && (chooseProduct==4)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.laptops[1][3]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Thanks for buying "+ElectronicsCategory.Laptops[0][chooseProduct-1]+" Laptop which costs "+ElectronicsCategory.Laptops[1][chooseProduct-1]);
						System.out.println();
						System.out.println("Return to Main Menu ? Yes or No");
						String toMainMenu = sc.next();
						if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
							ds.Display();
						}
						else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
							System.out.println("Thanks for Shopping with us!");
						}
					}
					if(chooseProduct!=0 && (chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.laptops[1][4]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Thanks for buying "+ElectronicsCategory.Laptops[0][chooseProduct-1]+" Laptop which costs "+ElectronicsCategory.Laptops[1][chooseProduct-1]);
						System.out.println();
						System.out.println("Return to Main Menu ? Yes or No");
						String toMainMenu = sc.next();
						if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
							ds.Display();
						}
						else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
							System.out.println("Thanks for Shopping with us!");
						}
					}
				
				}
				else if(confirm.equals("n") || confirm.equals("no") || confirm.equals("N") || confirm.equals("NO")){
						System.out.println("No problem. Thank you !");
				}	
			}
			else if(chooseSub==2) {
				el.Mobiles();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ElectronicsCategory.Mobiles[0][chooseProduct-1]+" Mobile which costs "+ElectronicsCategory.Mobiles[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==3){
				el.Tablets();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ElectronicsCategory.Tablets[0][chooseProduct-1]+" Tablet which costs "+ElectronicsCategory.Tablets[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==4) {
				el.TV();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ElectronicsCategory.TV[0][chooseProduct-1]+" TV which costs "+ElectronicsCategory.TV[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==5) {
				el.Speakers();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ElectronicsCategory.Speakers[0][chooseProduct-1]+" Speaker which costs "+ElectronicsCategory.Speakers[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else
				System.out.println("Invalid Input");
			sc.close();
		}
		
	}
	static void Furnitures() {
		Scanner sc = new Scanner(System.in);
		FurnitureCategory fn = new FurnitureCategory();
		display ds = new display();
		if(display.Category==2) {
			System.out.println("Select the Sub-Category :\n\n 1.Tables \n 2.Chairs \n 3.Beds \n 4.Desks \n 5.Cupboards \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				fn.Tables();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+FurnitureCategory.Chairs[0][chooseProduct-1]+" Table which costs "+FurnitureCategory.Chairs[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==2) {
				fn.Chairs();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+FurnitureCategory.Chairs[0][chooseProduct-1]+" Chair which costs "+FurnitureCategory.Chairs[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==3){
				fn.beds();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+FurnitureCategory.beds[0][chooseProduct-1]+" Bed which costs "+FurnitureCategory.beds[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==4) {
				fn.desks();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0) {
					System.out.println("Thanks for buying "+FurnitureCategory.desks[0][chooseProduct-1]+" Desk which costs "+FurnitureCategory.desks[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==5) {
				fn.cupBoards();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0) {
					System.out.println("Thanks for buying "+FurnitureCategory.cupBoards[0][chooseProduct-1]+" CupBoard which costs "+FurnitureCategory.cupBoards[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else
				System.out.println("Invalid Input");
			sc.close();
		}
	}

	static void Clothing() {
		Scanner sc = new Scanner(System.in);
		ClothingCategory cl = new ClothingCategory();
		display ds = new display();
		if(display.Category==3) {
			System.out.println("Select the Sub-Category :\n\n 1.Shirts \n 2.Trousers \n 3.Tshirts \n 4.Shoes \n 5.InnerWears \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				cl.Shirts();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ClothingCategory.Trousers[0][chooseProduct-1]+" Shirt which costs "+ClothingCategory.Trousers[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==2) {
				cl.Trousers();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ClothingCategory.Trousers[0][chooseProduct-1]+" Trouser which costs "+ClothingCategory.Trousers[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==3){
				cl.Tshirts();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ClothingCategory.Tshirts[0][chooseProduct-1]+" Tshirt which costs "+ClothingCategory.Tshirts[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==4) {
				cl.Shoes();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ClothingCategory.Shoes[0][chooseProduct-1]+" Shoe which costs "+ClothingCategory.Shoes[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==5) {
				cl.InnerWears();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+ClothingCategory.InnerWears[0][chooseProduct-1]+" Innerwear which costs "+ClothingCategory.InnerWears[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else
				System.out.println("Invalid Input");
			sc.close();
		}
	}

	static void Sports() {
		Scanner sc = new Scanner(System.in);
		SportsCategory sp = new SportsCategory();
		display ds = new display();
		if(display.Category==4) {
			System.out.println("Select the Sub-Category :\n\n 1.Football \n 2.Sportswear \n 3.Cricket \n 4.Bicycles \n 5.Rackets \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				sp.Football();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+SportsCategory.Football[0][chooseProduct-1]+" Football which costs "+SportsCategory.Football[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==2) {
				sp.Sportswears();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+SportsCategory.Sportswears[0][chooseProduct-1]+" SportsWear which costs "+SportsCategory.Sportswears[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==3){
				sp.Cricket();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+SportsCategory.Cricket[0][chooseProduct-1]+" Cricket Product which costs "+SportsCategory.Cricket[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==4) {
				sp.Bicycles();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+SportsCategory.Bicycles[0][chooseProduct-1]+" Bicycle which costs "+SportsCategory.Bicycles[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==5) {
				sp.Rackets();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+SportsCategory.Rackets[0][chooseProduct-1]+" Racket which costs "+SportsCategory.Rackets[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else
				System.out.println("Invalid Input");
			sc.close();
		}
	}

	static void Home() {
		Scanner sc = new Scanner(System.in);
		HomeCategory home = new HomeCategory();
		display ds = new display();
		if(display.Category==5) {
			System.out.println("Select the Sub-Category :\n\n 1.Appliances \n 2.Cleaning \n 3.Cooking \n 4.Gadgets \n 5.Security \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				home.Appliances();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+HomeCategory.Appliances[0][chooseProduct-1]+" Racket which costs "+HomeCategory.Appliances[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==2) {
				home.Cleaning();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+HomeCategory.Cleaning[0][chooseProduct-1]+" Racket which costs "+HomeCategory.Cleaning[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==3){
				home.Cooking();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+HomeCategory.Cooking[0][chooseProduct-1]+" Racket which costs "+HomeCategory.Cooking[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==4) {
				home.Gadgets();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+HomeCategory.Gadgets[0][chooseProduct-1]+" Racket which costs "+HomeCategory.Gadgets[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")) {
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else if(chooseSub==5) {
				home.Security();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				if(chooseProduct!=0 && (chooseProduct==1||chooseProduct==2||chooseProduct==3||chooseProduct==4||chooseProduct==5)) {
					System.out.println("Thanks for buying "+HomeCategory.Security[0][chooseProduct-1]+" Racket which costs "+HomeCategory.Security[1][chooseProduct-1]);
					System.out.println("Return to Main Menu ? Yes or No");
					String toMainMenu = sc.next();
					if(toMainMenu.equals("y") || toMainMenu.equals("yes") || toMainMenu.equals("Y") || toMainMenu.equals("YES")) {
						ds.Display();
					}
					else if(toMainMenu.equals("n") || toMainMenu.equals("no") || toMainMenu.equals("N") || toMainMenu.equals("NO")){
						System.out.println("Thanks for Shopping with us!");
					}
				}
			}
			else
				System.out.println("Invalid Input");
			sc.close();
		}
		
	}
}


