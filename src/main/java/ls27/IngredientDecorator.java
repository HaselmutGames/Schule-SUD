public abstract class IngredientDecorator extends Beverage{
    protected Beverage beverage;
    
    public IngredientDecorator(Beverage beverage){
        this.beverage = beverage;
    }
}

