public class Cocoa extends Beverage{

    @Override
    protected void brew(){
        System.out.println("Cocoa is being brewed");
    }

    @Override
    protected void addCondiments(){
        System.out.println("Whipped cream will be added");
    }
}
