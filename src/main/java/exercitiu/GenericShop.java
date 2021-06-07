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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class GenericShop<T extends ShopItem> {
	private final List<T> items = new ArrayList<>();

	public GenericShop(Collection<T> item) {
		if (item != null) {
			this.items.addAll(item);
		}
	}

	public Optional<T> addItem(T item) {
		for (T all : items) {
			items.add(all);
			return Optional.of(all);
		}
		return Optional.empty();
	}

	public List<T> findByCategory(Category cat) {
		List<T> result = new ArrayList<>();
		for (T all : items) {
			if (all.getCategory() == cat) {
				result.add(all);
			}
		}
		return result;
	}

	public List<T> findWithLowerPrice(int maxPrice) {
		List<T> result = new ArrayList<>();
		for (T all : items) {
			if (all.getPrice() < maxPrice) {
				maxPrice = all.getPrice();
				result.add(all);
			}
		}
		return result;
	}

	public Optional<T> findByName(String name) {
		for (T all : items) {
			if (all.getName().equals(name)) {
				items.add(all);
				return Optional.of(all);
			}
		}
		return Optional.empty();
	}

	public Optional<T> removeItem(String name) {
		for (T all : items) {
			if (all.getName().equals(name)) {
				items.remove(all);
				return Optional.of(all);
			}
		}
		return Optional.empty();
	}
}
