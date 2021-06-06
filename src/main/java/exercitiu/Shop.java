package exercitiu;

import java.util.Objects;

public abstract class Shop implements ShopItem {
	private String clothes;
	private String electronics;
	private String fruits;

	public Shop(String clothes, String electronics, String fruits) {
		this.clothes = clothes;
		this.electronics = electronics;
		this.fruits = fruits;
	}

	public String getClothes() {
		return clothes;
	}

	public String getElectronics() {
		return electronics;
	}

	public String getFruits() {
		return fruits;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Shop shop = (Shop) o;
		return Objects.equals(clothes, shop.clothes) && Objects.equals(electronics, shop.electronics) && Objects.equals(fruits, shop.fruits);
	}

	@Override
	public int hashCode() {
		return Objects.hash(clothes, electronics, fruits);
	}

	@Override
	public String toString() {
		return "Shop{" +
				"clothes='" + clothes + '\'' +
				", electronics='" + electronics + '\'' +
				", fruits='" + fruits + '\'' +
				'}';
	}
}
