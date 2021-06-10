package exercitiu;

import java.util.Objects;

public class Clothes implements ShopItem {
	private final String name;
	private final int price;
	private final Category category;

	public Clothes(String name, int price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public Category getCategory() {
		return this.category;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Clothes clothes = (Clothes) o;
		return price == clothes.price && Objects.equals(name, clothes.name) && category == clothes.category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, category);
	}

	@Override
	public String toString() {
		return "Clothes{" +
				"name='" + name + '\'' +
				", price=" + price +
				", category=" + category +
				'}';
	}
}
