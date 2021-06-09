package exercitiu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GenericShopTest {
	GenericShop<Clothes> genericShop;

	@Test
	@DisplayName("WHEN an item is added THEN it is printed")
	void addItem() {
		genericShop = new GenericShop<Clothes>(List.of(
				new Clothes("T-shirt", 100, Category.NEW),
				new Clothes("pants", 50, Category.ON_SALE),
				new Clothes("socks", 50, Category.REFURBISHED)
		));

		Optional<Clothes> result = genericShop.addItem(new Clothes("underwear", 20, Category.REFURBISHED));

		assertThat(result.get().equals(new Clothes("underwear", 20, Category.REFURBISHED)));
	}

	@Test
	@DisplayName("WHEN a category is searched THEN it is printed")
	void findByCategory() {
		genericShop = new GenericShop<Clothes>(List.of(
				new Clothes("T-shirt", 100, Category.NEW),
				new Clothes("pants", 50, Category.ON_SALE),
				new Clothes("socks", 50, Category.REFURBISHED)
		));

		assertThat(genericShop.findByCategory(Category.NEW)).isEqualTo(List.of(new Clothes("T-shirt", 100, Category.NEW)));
	}

}