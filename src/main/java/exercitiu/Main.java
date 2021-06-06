package exercitiu;
/*Creați o interfață ShopItem:
	ShopItem
        String name()
        int price()
        Category category().
Category este un enum: ON_SALE, NEW, REFURBISHED.
Creați implementările:
	Clothes
	Electronics
	Fruits.
Creați un Shop GENERIC care are o lista de obiecte care implementează ShopItem
definiția clasei Shop care lucrează doar cu ShopItem este:
	public class Shop<T extends ShopItem>
astfel obiectele din T vor putea accesa metodele din ShopItem. (de exemplu getCategory pt findByCategory).
Odata creat Shop-ul, va primi doar elemente de acel tip.
	Shop<Clothes> va avea doar haine.

Shop are următoarele metode:
	addItem(T item)
	findByCategory(Category cat): List<T>
	findWithLowerPrice(int maxPrice): List<T>
	findByName(String name): Optional<T>
	removeItem(String name): Optional<T> */

public class Main {
	public static void main(String[] args) {
//		addItem(T item);
//		findByCategory(Category cat);
//		findWithLowerPrice( int maxPrice);
//		findByName(String name);
//		removeItem(String name);
	}

}
