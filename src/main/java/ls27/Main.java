import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Beverage> myCoffees = new ArrayList<>();

        myCoffees.add(new Coffee("Espresso", 1.99));
        myCoffees.add(new Coffee("Americano", 2.29));

        myCoffees.add(new Chocolate(new Milk(new Coffee("Dark Roast", 1.79))));
        myCoffees.add(new Milk(new Milk(new Sugar(new Coffee("Espresso", 1.99)))));
        myCoffees.add(new Milk(new Chocolate(new Coffee("Latte Macchiato", 2.49))));

        for (Beverage b : myCoffees){
            System.out.printf("%s : %.2f €%n", b.getName(), b.calculatePrice());
        }
    }
}
