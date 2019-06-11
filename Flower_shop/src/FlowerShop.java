import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import Delivery.Delivery;
import Enums.EColor;
import Enums.ESizePlant;
import Plants.Cactus;
import Plants.Flower;
import Plants.FlowerBouequet;
import Plants.Flowerpot;
import Plants.Plant;
import Plants.Product;
import Plants.Tree;
import Plants.Decorator.Kibbon;
import Plants.Decorator.Paper;
import Property.PropertyBush;
import Property.PropertyChamomile;
import Property.PropertySpinyFlower;

public class FlowerShop {
	
	private FlowerBouequet flowerBouequet = new FlowerBouequet("Boueqet" , 234);
	private Random rand = new Random();
	private Delivery delivery;
	private List<Product> products = new LinkedList<>();
	private List<Flower> flowers = new LinkedList<>();
	private List<Product> basket = new LinkedList();//////////////////		<------ew
	private ESizePlant sizePlant;
	private EColor color ;

	public FlowerShop() {
		availableProducts();
	}
	
	public List<Product> availableProducts() {
		
		products.add(new Flower("Rose", new PropertySpinyFlower(7, 15,sizePlant.MIDDLE, color.RED),35.5));
		products.add(new Flower("Rose", new PropertySpinyFlower(3, 24,sizePlant.SMALL, color.PINK),50.75));
		products.add(new Flower("Rose", new PropertySpinyFlower(9, 25,sizePlant.SMALL, color.RED),21.35));
		products.add(new Flower("Rose", new PropertySpinyFlower(1, 45,sizePlant.BIG, color.WHITE),60.25));
		products.add(new Flower("Rose", new PropertySpinyFlower(4, 11,sizePlant.MIDDLE, color.WHITE),45.5));
		products.add(new Flower("Rose", new PropertySpinyFlower(10, 22,sizePlant.BIG, color.PINK),20.2));
		products.add(new Flower("CHAMOMILE", new PropertyChamomile(3, 7,sizePlant.MIDDLE),40));
		products.add(new Flower("CHAMOMILE", new PropertyChamomile(6, 5,sizePlant.SMALL),35.4));
		products.add(new Flower("CHAMOMILE", new PropertyChamomile(7, 8,sizePlant.MIDDLE),55));
		products.add(new Flower("CHAMOMILE", new PropertyChamomile(1, 12,sizePlant.BIG),76));
		products.add(new Flower("CHAMOMILE", new PropertyChamomile(2, 8,sizePlant.BIG),72));
		
		products.add(new Tree("Willow", new PropertyBush(4 , sizePlant.BIG),320));
		products.add(new Tree("Oak", new PropertyBush(3 , sizePlant.BIG),570));
		products.add(new Tree("Birch", new PropertyBush(5 , sizePlant.SMALL),120));
		products.add(new Tree("Apple", new PropertyBush(2 , sizePlant.SMALL),90));
		products.add(new Tree("Cherry", new PropertyBush(3 , sizePlant.MIDDLE),404));
		products.add(new Tree("Paer", new PropertyBush(1 , sizePlant.MIDDLE),333));
		
		products.add(new Cactus("Aloe", new PropertySpinyFlower(4 , 222 , sizePlant.SMALL, color.GREEN),240.2));
		products.add(new Cactus("Astrophytum", new PropertySpinyFlower(3 , 720 , sizePlant.MIDDLE, color.GREEN),150));
		products.add(new Cactus("Ehinopsis", new PropertySpinyFlower(7 , 555 , sizePlant.BIG, color.GREEN),550));
		
		products.add(new Flowerpot("Orchidea", new PropertyBush(2 , sizePlant.MIDDLE ),132.35));
		products.add(new Flowerpot("Ficus", new PropertyBush(1 , sizePlant.SMALL) , 111.25 ));
		products.add(new Flowerpot("Peperomia", new PropertyBush(1 , sizePlant.BIG) , 523.50 ));
		products.add(new Flowerpot("Youka", new PropertyBush(1 , sizePlant.MIDDLE) , 290.75 ));
		
		products.add(new Paper("Paper" , new Flower("CHAMOMILE", new PropertyChamomile(2, 8,sizePlant.BIG),72),7));
		products.add(new Paper("Kibbon" , new Flower("Rose", new PropertyChamomile(2, 23,sizePlant.MIDDLE),120),14));
		
		// Flower with kibbon and paper wrapper
		products.add(new Kibbon("Kibbon" , new Paper("Paper", new Flower("Chamomile" ,new PropertyChamomile(2, 23,sizePlant.MIDDLE),45.5),7),4));
		
		// Bouquet in paper wrapper
		products.add(new Paper("Paper" , getBouquetFlower(),7));
		products.add(new Paper("Paper" , getBouquetFlower(),7));
		
		products.add(new Paper("Paper" , new Flower("Rose" , new PropertySpinyFlower(2, 44 , ESizePlant.BIG , EColor.PINK),30),6.4));
		
		products.add(new Kibbon("Kibbon" , new Flower("Chamomile" ,new PropertyChamomile(2, 23,sizePlant.MIDDLE),45.5),7));
		
		products.add(new Flowerpot("Youka", new PropertyBush(1 , sizePlant.MIDDLE) , 290.75 ));
		
		products.add(new Cactus("Ehinopsis", new PropertySpinyFlower(7 , 555 , sizePlant.BIG, color.GREEN),550));
		
		products.add(new Tree("Apple", new PropertyBush(2 , sizePlant.SMALL),90));
		
		products.add(new Paper("Paper" , new Kibbon("Kibbon" , getBouquetFlower() , 5),7));
		
		return products;
	}
	
	
	public void showAllProducts() {
		products.stream().forEach(x->System.out.println(x.getDescription()));
	}
	
	
	private FlowerBouequet getBouquetFlower() {
		FlowerBouequet flowers = new FlowerBouequet("Bouquet" , 131.6);
		int howManyFlowers = rand.nextInt(14)+1;
		int howManyProperty = rand.nextInt(14)+1;
		int whichFlower=rand.nextInt(3)+1;
		int choisePropertyColor , choisePropertySize;
		double bouquetPrice ;
		for(int i=0 ;i<howManyFlowers;i++) {
			howManyProperty = rand.nextInt(3)+1;
			whichFlower=rand.nextInt(3)+0;
			bouquetPrice=Math.random()*(40-80)+80;
			choisePropertyColor=rand.nextInt(EColor.values().length);choisePropertySize = rand.nextInt(2)+0;
			switch(whichFlower) {
				case 1:
					flowers.addFlower(new Flower("Chamomile", new PropertyChamomile(2, howManyProperty,sizePlant.values()[choisePropertySize]),bouquetPrice));break;
				case 2:
					flowers.addFlower(new Flower("Rose", new PropertySpinyFlower(2, howManyProperty ,sizePlant.values()[choisePropertySize], color.values()[choisePropertyColor]),bouquetPrice));break;
				case 3:
					flowers.addFlower(new Flower("Daisy", new PropertyChamomile(2, howManyProperty,sizePlant.values()[choisePropertySize]),bouquetPrice));break;
			}
		}
		return flowers;
	}
	
	public void addProductToBasket(Product product) {
		basket.add(product);
	}
	
	public List getProductsFromBasket() {
		return basket;
	}
	
	private Double bouquetSum() {
		return flowerBouequet.getBouequet().stream()
		.map(Flower::getPrice)
		.mapToDouble(Double::doubleValue)
		.sum();
	}
	
	public void showProductsOnBasket() {
		basket.stream().forEach(x->System.out.println(x));
	}
	
	public void printBouquet() {
		flowers.stream().forEach(x->System.out.println(x));
	}
	
	public double printBouquetSum() {
		return basket.stream()
				.map(Product::getPrice)
				.mapToDouble(Double::doubleValue)
				.sum();
	}
	
}
