import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;

// How to learn lambda expressions? Familiarize yourself with the syntax, based on as many examples as possible
public class LambdaExpressions {


	public static void main(String[] args) {

		Set<String> superCycleSet = new TreeSet<>();
		List<String> myStoreList = new ArrayList<>();
		myStoreList.add("Bicycle");
		myStoreList.add("Tricycle");
		myStoreList.add("Scooter");

		// 1.1. The simplest application of lambda. Print out all the elements of the list
		myStoreList.forEach(i -> System.out.println("My Store item: " + i));

		//Multiline lambda
		myStoreList.forEach(i -> {
				if(i.contains("cycle")){
						superCycleSet.add(i);
				}
		});

		// 1.2. Lambda and map
		Map<String, Integer> prices = new TreeMap<>();
		prices.put("Apple", 1);
		prices.put("Avocado", 2);
		prices.put("Banana", 1);
		prices.put("Mango", 2);
		prices.put("Starfruit", 4);

		prices.forEach((fruit, price) -> System.out.println("Fruit: " + fruit + ", $" + price));
		

	}
}
