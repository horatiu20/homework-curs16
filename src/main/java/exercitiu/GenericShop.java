package exercitiu;

import java.util.Objects;

public class GenericShop<T extends ShopItem> {
	private final T object;

	public GenericShop(T object) {
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GenericShop<?> that = (GenericShop<?>) o;
		return Objects.equals(object, that.object);
	}

	@Override
	public int hashCode() {
		return Objects.hash(object);
	}

	@Override
	public String toString() {
		return "GenericShop{" +
				"object=" + object +
				'}';
	}
}
