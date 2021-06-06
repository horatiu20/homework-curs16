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
	public void getName(String name) {
		System.out.println(name);
	}

	@Override
	public void getPrice(int price) {
		System.out.println(price);
	}

	@Override
	public void getCategory(Category category) {
		System.out.println(category);
	}
}
