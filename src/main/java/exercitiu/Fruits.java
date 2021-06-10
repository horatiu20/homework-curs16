package exercitiu;

import java.util.Objects;

public class Fruits implements ShopItem {
	private final String name;
	private final int price;
	private final Category category;

	public Fruits(String name, int price, Category category) {
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
		Fruits fruits = (Fruits) o;
		return price == fruits.price && Objects.equals(name, fruits.name) && category == fruits.category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, category);
	}

	@Override
	public String toString() {
		return "Fruits{" +
				"name='" + name + '\'' +
				", price=" + price +
				", category=" + category +
				'}';
	}
}
