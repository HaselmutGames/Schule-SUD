public class Coffee extends Beverage{

    private String name;
    private double price;

    public Coffee(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double calculatePrice(){
        return price;
    }
}
