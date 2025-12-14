public class Chocolate extends IngredientDecorator{

    public Chocolate(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getName(){
        return beverage.getName() + ", Chocolate";
    }

    @Override
    public double calculatePrice(){
        return beverage.calculatePrice() + 0.50;
    }
}
