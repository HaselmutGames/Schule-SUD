public class Milk extends IngredientDecorator{

    public Milk(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getName(){
        return beverage.getName() + ", Milk";
    }

    @Override
    public double calculatePrice(){
        return beverage.calculatePrice() + 0.30;
    }
}
