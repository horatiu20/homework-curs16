package exercitiu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GenericShopTest {
	GenericShop<Clothes> genericShop;

	@Test
	@DisplayName("WHEN an object is added THEN it is printed")
	void addItem() {
		genericShop = new GenericShop<Clothes>(List.of(
				new Clothes("T-shirt", 100, Category.NEW),
				new Clothes("pants", 50, Category.ON_SALE),
				new Clothes("socks", 10, Category.REFURBISHED)
		));

		Optional<Clothes> result = genericShop.addItem(new Clothes("underwear", 20, Category.REFURBISHED));

		assertThat(result.get().equals(new Clothes("underwear", 20, Category.REFURBISHED)));
	}

	@Test
	@DisplayName("WHEN a category is searched THEN the object is printed")
	void findByCategory() {
		genericShop = new GenericShop<Clothes>(List.of(
				new Clothes("T-shirt", 100, Category.NEW),
				new Clothes("pants", 50, Category.ON_SALE),
				new Clothes("socks", 10, Category.REFURBISHED)
		));
		assertThat(genericShop.findByCategory(Category.NEW)).isEqualTo(List.of(new Clothes("T-shirt", 100, Category.NEW)));
	}

	@Test
	@DisplayName("WHEN a max price is added THEN the object with minimum price is printed")
	void findWithLowerPrice() {
		genericShop = new GenericShop<Clothes>(List.of(
				new Clothes("T-shirt", 100, Category.NEW),
				new Clothes("pants", 50, Category.ON_SALE),
				new Clothes("socks", 10, Category.REFURBISHED)
		));

		assertThat(genericShop.findWithLowerPrice(80)).isEqualTo(List.of(
				new Clothes("pants", 50, Category.ON_SALE),
				new Clothes("socks", 10, Category.REFURBISHED)));
	}

	@Test
	@DisplayName("WHEN a name is searched THEN the object is printed")
	void findByName() {
		genericShop = new GenericShop<Clothes>(List.of(
				new Clothes("T-shirt", 100, Category.NEW),
				new Clothes("pants", 50, Category.ON_SALE),
				new Clothes("socks", 10, Category.REFURBISHED)
		));

		Optional<Clothes> result = genericShop.findByName("pants");

		assertThat(result.get().equals(new Clothes("pants", 50, Category.ON_SALE)));
	}

	@Test
	@DisplayName("WHEN an item is removed THEN the remaining objects are printed")
	void removeItem() {
		genericShop = new GenericShop<Clothes>(List.of(
				new Clothes("T-shirt", 100, Category.NEW),
				new Clothes("pants", 50, Category.ON_SALE),
				new Clothes("socks", 10, Category.REFURBISHED)
		));

		Optional<Clothes> result = genericShop.removeItem("socks");

		assertThat(result.get().equals(List.of(
				new Clothes("T-shirt", 100, Category.NEW),
				new Clothes("pants", 50, Category.ON_SALE))));
	}
}