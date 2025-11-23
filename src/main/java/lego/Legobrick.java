package lego;

public class Legobrick implements ILegoComponent {
	private String color;
	private int size;
	private double price;

	public Legobrick(String color, int size, double price) {
		setColor(color);
		setSize(size);
		setPrice(price);
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	protected void setColor(String color) {
		if (!color.isEmpty() && color != null && !color.isBlank()) {
			this.color = color;
		} else {
			throw new IllegalArgumentException("Color is not valid");
		}
	}

	protected void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			throw new IllegalArgumentException("Price cannot be negative");
		}
	}

	protected void setSize(int size) {
		if (size > 0) {
			this.size = size;
		} else {
			throw new IllegalArgumentException("Size cannot be negative");
		}
	}

	@Override
	public double calculatePrice() {
		return getPrice();
	}
}
