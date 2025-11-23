public class ColdBrew extends Beverage{
    @Override
    protected void boilWater(){
        System.out.println("Cold brew! Don't boil water")
    }

    @Override
    protected void brew(){
        System.out.println("Cold is being brewed");
    }

    @Override
    protected void addCondiments(){
        System.out.println("Something will be added");
    }
}
