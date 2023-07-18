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
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.laptops[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+ElectronicsCategory.Laptops[1][chooseProduct-1]+"\n\nThanks for buying "+ElectronicsCategory.Laptops[0][chooseProduct-1]);
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
			if(chooseSub==2)
			{
				el.Mobiles();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ElectronicsCategory.Mobiles[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.mobiles[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+ElectronicsCategory.Mobiles[1][chooseProduct-1]+"\n\nThanks for buying "+ElectronicsCategory.Mobiles[0][chooseProduct-1]);
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
			if(chooseSub==3)
			{
				el.Tablets();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ElectronicsCategory.Tablets[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.tablets[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+ElectronicsCategory.Tablets[1][chooseProduct-1]+"\n\nThanks for buying "+ElectronicsCategory.Tablets[0][chooseProduct-1]);
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
			if(chooseSub==4)
			{
				el.TV();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ElectronicsCategory.TV[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.tv[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+ElectronicsCategory.TV[1][chooseProduct-1]+"\n\nThanks for buying "+ElectronicsCategory.TV[0][chooseProduct-1]);
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
			if(chooseSub==5)
			{
				el.Speakers();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ElectronicsCategory.Speakers[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.speakers[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+ElectronicsCategory.Speakers[1][chooseProduct-1]+"\n\nThanks for buying "+ElectronicsCategory.Speakers[0][chooseProduct-1]);
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
			else
				System.out.println("Invalid Input");
			sc.close();
			}
		}
	}
	static void Furnitures() {
		Scanner sc = new Scanner(System.in);
		FurnitureCategory fn = new FurnitureCategory();
		display ds = new display();
		if(display.Category==2) {
			System.out.println("Select the Sub-Category :\n\n 1.Tables \n 2.Chairs \n 3.Beds \n 4.Desks \n 5.CupBoards \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				fn.Tables();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+FurnitureCategory.Tables[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.tables[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+FurnitureCategory.Tables[1][chooseProduct-1]+"\n\nThanks for buying "+FurnitureCategory.Tables[0][chooseProduct-1]);
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
			if(chooseSub==2)
			{
				fn.Chairs();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+FurnitureCategory.Chairs[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.chairs[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+FurnitureCategory.Chairs[1][chooseProduct-1]+"\n\nThanks for buying "+FurnitureCategory.Chairs[0][chooseProduct-1]);
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
			if(chooseSub==3)
			{
				fn.beds();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+FurnitureCategory.beds[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.beds[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+FurnitureCategory.beds[1][chooseProduct-1]+"\n\nThanks for buying "+FurnitureCategory.beds[0][chooseProduct-1]);
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
			if(chooseSub==4)
			{
				fn.desks();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+FurnitureCategory.desks[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.desks[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+FurnitureCategory.desks[1][chooseProduct-1]+"\n\nThanks for buying "+FurnitureCategory.desks[0][chooseProduct-1]);
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
			if(chooseSub==5)
			{
				fn.cupBoards();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+FurnitureCategory.cupBoards[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("============================");
						System.out.println("DESCRIPTION");
						System.out.println("============================");
						System.out.println(Specifications.cupBoards[1][chooseProduct-1]);
						System.out.println("============================");
						System.out.println();
						System.out.println("Price : "+FurnitureCategory.cupBoards[1][chooseProduct-1]+"\n\nThanks for buying "+FurnitureCategory.cupBoards[0][chooseProduct-1]);
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
			else
				System.out.println("Invalid Input");
			sc.close();
			}
			
		}
	}

	static void Clothing() {
		Scanner sc = new Scanner(System.in);
		ClothingCategory cl = new ClothingCategory();
		display ds = new display();
		if(display.Category==3) {
			System.out.println("Select the Sub-Category :\n\n 1.Shirts \n 2.Trousers \n 3.Tshirts \n 4.Shoes \n 5.Innerwears \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				cl.Shirts();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ClothingCategory.Shirts[chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("================================================");
						System.out.println("DESCRIPTION");
						System.out.println("================================================");
						System.out.println(Specifications.shirts[1][chooseProduct-1]);
						System.out.println("================================================");
						System.out.println();
						System.out.println("Price : "+ClothingCategory.Shirts[1][chooseProduct-1]+"\n\nThanks for buying "+ClothingCategory.Shirts[0][chooseProduct-1]);
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
			if(chooseSub==2)
			{
				cl.Trousers();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ClothingCategory.Trousers[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("================================================");
						System.out.println("DESCRIPTION");
						System.out.println("================================================");
						System.out.println(Specifications.trousers[1][chooseProduct-1]);
						System.out.println("================================================");
						System.out.println();
						System.out.println("Price : "+ClothingCategory.Trousers[1][chooseProduct-1]+"\n\nThanks for buying "+ClothingCategory.Trousers[0][chooseProduct-1]);
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
			if(chooseSub==3)
			{
				cl.Tshirts();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ClothingCategory.Tshirts[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("================================================");
						System.out.println("DESCRIPTION");
						System.out.println("================================================");
						System.out.println(Specifications.tshirts[1][chooseProduct-1]);
						System.out.println("================================================");
						System.out.println();
						System.out.println("Price : "+ClothingCategory.Tshirts[1][chooseProduct-1]+"\n\nThanks for buying "+ClothingCategory.Tshirts[0][chooseProduct-1]);
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
			if(chooseSub==4)
			{
				cl.Shoes();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ClothingCategory.Shoes[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("================================================");
						System.out.println("DESCRIPTION");
						System.out.println("================================================");
						System.out.println(Specifications.shoes[1][chooseProduct-1]);
						System.out.println("================================================");
						System.out.println();
						System.out.println("Price : "+ClothingCategory.Shoes[1][chooseProduct-1]+"\n\nThanks for buying "+ClothingCategory.Shoes[0][chooseProduct-1]);
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
			if(chooseSub==5)
			{
				cl.InnerWears();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+ClothingCategory.InnerWears[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("================================================");
						System.out.println("DESCRIPTION");
						System.out.println("================================================");
						System.out.println(Specifications.innerwears[1][chooseProduct-1]);
						System.out.println("================================================");
						System.out.println();
						System.out.println("Price : "+ClothingCategory.InnerWears[1][chooseProduct-1]+"\n\nThanks for buying "+ClothingCategory.InnerWears[0][chooseProduct-1]);
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
			else
				System.out.println("Invalid Input");
			sc.close();
			}
		}
	}

	static void Sports() {
		Scanner sc = new Scanner(System.in);
		SportsCategory sp = new SportsCategory();
		display ds = new display();
		if(display.Category==4) {
			System.out.println("Select the Sub-Category :\n\n 1.Football \n 2.Sportswears \n 3.Cricket \n 4.Bicycles \n 5.Rackets \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				sp.Football();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+SportsCategory.Football[chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("================================================");
						System.out.println("DESCRIPTION");
						System.out.println("================================================");
						System.out.println(Specifications.football[1][chooseProduct-1]);
						System.out.println("================================================");
						System.out.println();
						System.out.println("Price : "+SportsCategory.Football[1][chooseProduct-1]+"\n\nThanks for buying "+SportsCategory.Football[0][chooseProduct-1]);
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
			if(chooseSub==2)
			{
				sp.Sportswears();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+SportsCategory.Sportswears[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("================================================");
						System.out.println("DESCRIPTION");
						System.out.println("================================================");
						System.out.println(Specifications.sportswear[1][chooseProduct-1]);
						System.out.println("================================================");
						System.out.println();
						System.out.println("Price : "+SportsCategory.Sportswears[1][chooseProduct-1]+"\n\nThanks for buying "+SportsCategory.Sportswears[0][chooseProduct-1]);
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
			if(chooseSub==3)
			{
				sp.Cricket();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+SportsCategory.Cricket[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("================================================");
						System.out.println("DESCRIPTION");
						System.out.println("================================================");
						System.out.println(Specifications.cricket[1][chooseProduct-1]);
						System.out.println("================================================");
						System.out.println();
						System.out.println("Price : "+SportsCategory.Cricket[1][chooseProduct-1]+"\n\nThanks for buying "+SportsCategory.Cricket[0][chooseProduct-1]);
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
			if(chooseSub==4)
			{
				sp.Bicycles();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+SportsCategory.Bicycles[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("=====================================================");
						System.out.println("DESCRIPTION");
						System.out.println("=====================================================");
						System.out.println(Specifications.bicycles[1][chooseProduct-1]);
						System.out.println("=====================================================");
						System.out.println();
						System.out.println("Price : "+SportsCategory.Bicycles[1][chooseProduct-1]+"\n\nThanks for buying "+SportsCategory.Bicycles[0][chooseProduct-1]);
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
			if(chooseSub==5)
			{
				sp.Rackets();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+SportsCategory.Rackets[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("=====================================================");
						System.out.println("DESCRIPTION");
						System.out.println("=====================================================");
						System.out.println(Specifications.rackets[1][chooseProduct-1]);
						System.out.println("=====================================================");
						System.out.println();
						System.out.println("Price : "+SportsCategory.Rackets[1][chooseProduct-1]+"\n\nThanks for buying "+SportsCategory.Rackets[0][chooseProduct-1]);
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
			else
				System.out.println("Invalid Input");
			sc.close();
			}
		}
	}

	static void Home() {
		Scanner sc = new Scanner(System.in);
		HomeCategory home = new HomeCategory();
		display ds = new display();
		if(display.Category==5) {
			System.out.println("Select the Sub-Category :\n\n 1.Appliances \n 2.Cooking \n 3.Cleaning \n 4.Gadgets \n 5.Security \n");
			System.out.println();
			int chooseSub = sc.nextInt();
			if(chooseSub==1)
			{
				home.Appliances();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+HomeCategory.Appliances[chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("=====================================================");
						System.out.println("DESCRIPTION");
						System.out.println("=====================================================");
						System.out.println(Specifications.appliances[1][chooseProduct-1]);
						System.out.println("=====================================================");
						System.out.println();
						System.out.println("Price : "+HomeCategory.Appliances[1][chooseProduct-1]+"\n\nThanks for buying "+HomeCategory.Appliances[0][chooseProduct-1]);
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
			if(chooseSub==2)
			{
				home.Cooking();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+HomeCategory.Cooking[chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("=====================================================");
						System.out.println("DESCRIPTION");
						System.out.println("=====================================================");
						System.out.println(Specifications.cooking[1][chooseProduct-1]);
						System.out.println("=====================================================");
						System.out.println();
						System.out.println("Price : "+HomeCategory.Cooking[1][chooseProduct-1]+"\n\nThanks for buying "+HomeCategory.Cooking[0][chooseProduct-1]);
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
			if(chooseSub==3)
			{
				home.Cooking();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+HomeCategory.Cleaning[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("=====================================================");
						System.out.println("DESCRIPTION");
						System.out.println("=====================================================");
						System.out.println(Specifications.cleaning[1][chooseProduct-1]);
						System.out.println("=====================================================");
						System.out.println();
						System.out.println("Price : "+HomeCategory.Cleaning[1][chooseProduct-1]+"\n\nThanks for buying "+HomeCategory.Cleaning[0][chooseProduct-1]);
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
			if(chooseSub==4)
			{
				home.Gadgets();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+HomeCategory.Gadgets[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("=====================================================");
						System.out.println("DESCRIPTION");
						System.out.println("=====================================================");
						System.out.println(Specifications.Gadgets[1][chooseProduct-1]);
						System.out.println("=====================================================");
						System.out.println();
						System.out.println("Price : "+HomeCategory.Gadgets[1][chooseProduct-1]+"\n\nThanks for buying "+HomeCategory.Gadgets[0][chooseProduct-1]);
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
			if(chooseSub==5)
			{
				home.Security();
				System.out.println();
				System.out.println("Choose the product to buy (1-5):");
				int chooseProduct = sc.nextInt();
				System.out.println("Are you sure want to buy "+HomeCategory.Security[0][chooseProduct-1]+"? yes or no ?");
				String confirm = sc.next();
				if(confirm.equals("y") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("YES")){
					if(chooseProduct!=0 && (chooseProduct==1 || chooseProduct==2 || chooseProduct==3 || chooseProduct==4 || chooseProduct==5)) {
						System.out.println("=====================================================");
						System.out.println("DESCRIPTION");
						System.out.println("=====================================================");
						System.out.println(Specifications.Security[1][chooseProduct-1]);
						System.out.println("=====================================================");
						System.out.println();
						System.out.println("Price : "+HomeCategory.Security[1][chooseProduct-1]+"\n\nThanks for buying "+HomeCategory.Security[0][chooseProduct-1]);
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
			else
				System.out.println("Invalid Input");
			sc.close();
			}
		}
		
	}
}


