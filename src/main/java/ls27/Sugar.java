public class Sugar extends IngredientDecorator{

    public Sugar(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getName(){
        return beverage.getName() + ", Sugar";
    }

    @Override
    public double calculatePrice(){
        return beverage.calculatePrice() + 0.10;
    }
}
