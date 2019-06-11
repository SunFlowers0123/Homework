import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Delivery.Delivery;
import Delivery.NewPost;
import Delivery.Post;
import Enums.EColor;
import Enums.ESizePlant;
import Payment.Cash;
import Payment.CreditCard;
import Payment.Payment;
import Payment.Paypal;
import Plants.Product;
import Plants.Tree;
import Plants.Cactus;
import Plants.Flower;
import Plants.FlowerBouequet;
import Plants.Flowerpot;
import Property.PropertyBush;
import Property.PropertyChamomile;
import Property.PropertySpinyFlower;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Product productBouquet;
		Payment payment ;
		Delivery delivery;
		FlowerBouequet flowerBouquet = new FlowerBouequet("Bouquet", 123);
		FlowerShop flowerShop = new FlowerShop();
			
		int choisePlant;
		int choiseFlower;
		int enough;
		
		System.out.println("List of products :");
		flowerShop.showAllProducts();
		
		System.out.println("\t\t\t Flower shop");
		System.out.println("Our catalog of plants : ");
		Random rand = new Random();
		while(true) {
			System.out.println("1 - Flowers\n"
					 + "2 - Flowerpots\n"
					 + "3 - Trees\n"
					 + "4 - Cactus");
			
			choisePlant = scan.nextInt();//try catch
			switch(choisePlant) {
				case 1 :
					System.out.println("\n You can create bouquet for yourself : \n");
					while(true) {
						System.out.println(
								  "1 - Rose\n"
								+ "2 - Chamomile\n"
								+ "3 - Daisy\n");
						choiseFlower = scan.nextInt();
						
						switch (choiseFlower) {
							case 1: flowerShop.addProductToBasket((new Flower("Rose", new PropertySpinyFlower(3, 24,ESizePlant.SMALL, EColor.PINK),50.75)));break;
							case 2: flowerShop.addProductToBasket((new Flower("Chamomile", new PropertyChamomile(3, 7,ESizePlant.MIDDLE),40)));break;
							case 3: flowerShop.addProductToBasket((new Flower("Daisy", new PropertyChamomile(2, 8,ESizePlant.BIG),72)));break;
							default : System.out.println("We don`t have this flower");
						}
						System.out.println("added");
						System.out.print("If you think that enough than press 1  or press 0 to continue ");enough=scan.nextInt();
						if(enough==1)break;
					}break;
					
				case 2 :
					System.out.println("We have a flowerpots :  ");

					while(true) {
						System.out.println(
								   "1 - Aloe\n"
								 + "2 - Ficus\n"
								 + "3 - Lemon\n");
						choiseFlower = scan.nextInt();//try catch
						switch(choiseFlower) {
						case 1 :
							flowerShop.addProductToBasket(new Flowerpot("Youka", new PropertyBush(1 , ESizePlant.MIDDLE) , 290.75 ));break;
						case 2 : 
							flowerShop.addProductToBasket(new Flowerpot("Orchidea", new PropertyBush(2 , ESizePlant.SMALL),132.35));break;
						case 3 : 
							flowerShop.addProductToBasket(new Flowerpot("Peperomia", new PropertyBush(1 , ESizePlant.BIG) , 523.50 ));break;
						default : System.out.println("We don`t have this flowerpot");
						}
						System.out.println("added");
						System.out.print("If you think that enough than press 1  or press 0 to continue ");enough=scan.nextInt();
						if(enough==1) break; 
						}break;
				
				case 3 :
					System.out.println("We have a tree`s");
					
					while(true) {
					
						System.out.println(""
							+ "1 - Oak\n"
							+ "2 - Birch\n"
							+ "3 - Willow");
					
					choisePlant = scan.nextInt();
					
					switch(choisePlant) {
						case 1 :
							flowerShop.addProductToBasket(new Tree("Willow", new PropertyBush(4 , ESizePlant.BIG),320));break;
						case 2 : 
							flowerShop.addProductToBasket(new Tree("Oak", new PropertyBush(3 , ESizePlant.MIDDLE),404));break;
						case 3 : 
							flowerShop.addProductToBasket(new Tree("Apple", new PropertyBush(2 , ESizePlant.SMALL),90));break;
						default : System.out.println("We don`t have this Tree");
					}
					System.out.println("added");
					System.out.print("If you think that enough than press 1  or press 0 to continue ");enough=scan.nextInt();
					if(enough==1) break;
					}break;

				case 4 :
				System.out.println("We have a cactus : ");
				while(true) {
					System.out.println(""
							+ "1 - Aloe\n"
							+ "2 - Astrophytum\n"
							+ "3 - Ehinopsis");
					switch(choisePlant) {
					case 1 :
						flowerShop.addProductToBasket(new Cactus("Aloe", new PropertySpinyFlower(4 , 222 , ESizePlant.SMALL, EColor.GREEN),240.2)); break;
					case 2 :
						flowerShop.addProductToBasket((new Cactus("Astrophytum", new PropertySpinyFlower(3 , 720 , ESizePlant.MIDDLE, EColor.GREEN),150))); break;
					case 3 : 
						flowerShop.addProductToBasket((new Cactus("Ehinopsis", new PropertySpinyFlower(7 , 555 , ESizePlant.BIG, EColor.GREEN),550))); break;
					default : System.out.println("we don`t have this cactus");
				}
				System.out.println("added");
				System.out.print("If you think that enough than press 1  or press 0 to continue ");enough=scan.nextInt();
				if(enough==1) { System.out.print("Price : ");flowerBouquet.bouquetSum(); break;}
				}
		}
			System.out.println("If you wan`t to buy press 1 or 0 to continue...");
			enough=scan.nextInt();
			if(enough==1)break;
		}
	
		System.out.println("List of products : ");
		flowerShop.showProductsOnBasket();
		System.out.println("choise payment : ");
		System.out.println("Press type of payment");
		System.out.println("1 - cash");
		System.out.println("2 - credit card");
		System.out.println("3 - paypal");
		int choisePayment = scan.nextInt();
		switch(choisePayment){
		 case 1 :
			System.out.println(new Payment(new Cash()).pay());break;
		 case 2 : 
			System.out.println(new Payment(new CreditCard()).pay());break;
	   	 case 3 : 
			System.out.println(new Payment(new Paypal()).pay());break;
		default : System.out.println("un paying");
	}
		
		System.out.println("Delivery ?");
		System.out.println("If you want delivery product press 1 or 0 ");
		int deliveryProducts = scan.nextInt();
		int choiseDelivery;
		if ( deliveryProducts == 1 ) {
			System.out.println("1 - Delivery New post");
			System.out.println("2 - Delivery Simple post");
			choiseDelivery = scan.nextInt();
			switch(choiseDelivery) {
			case 1 : delivery = new Delivery(new NewPost());
					delivery.delivery(flowerShop.getProductsFromBasket()); break;
			case 2 : delivery = new Delivery(new Post());
					delivery.delivery(flowerShop.getProductsFromBasket());break;
			default : System.out.println("We dont have this delivery place !!!");
			break;}
			
			
		}
		
			
		}
	
	
}
