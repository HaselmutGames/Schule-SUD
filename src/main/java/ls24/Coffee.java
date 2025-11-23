public class Coffee extends Beverage{

    @Override
    protected void brew(){
        System.out.println("coffee is being brewed");
    }

    @Override
    protected void addCondiments(){
        System.out.println("Sugar and Milk will be added");
    }
}
