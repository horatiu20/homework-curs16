package exercitiu;

public class Electronics implements ShopItem {
	private String name;
	private int price;
	private Category category;

	public Electronics(String name, int price, Category category) {
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
}
