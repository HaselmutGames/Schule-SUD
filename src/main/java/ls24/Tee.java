public class Tee extends Beverage{

    @Override
    protected void brew(){
        System.out.println("Tee is being brewed");
    }

    @Override
    protected void addCondiments(){
        System.out.println("Lemon will be added");
    }
}
