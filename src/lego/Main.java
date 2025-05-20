package lego;

public class Main {

	public static void main(String[] args) {

		Legobrick redBrick = new Legobrick("red", 2, 0.50);
		Legobrick blueBrick = new Legobrick("blue", 4, 2.50);
		Legobrick greenBrick = new Legobrick("green", 1, 1.00);

		CompositeLego houseWall = new CompositeLego();
		houseWall.addComponent(blueBrick);
		houseWall.addComponent(greenBrick);

		CompositeLego house = new CompositeLego();
		house.addComponent(houseWall);
		house.addComponent(new Legobrick("red", 10, 10.00));

		System.out.println(house.calculatePrice());
	}

}
