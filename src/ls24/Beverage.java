public abstract class Beverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }

    protected void boilWater(){
        System.out.println("Water is boiling ...");
    }

    protected void pourInCup(){
        System.out.println("Pour Beverage");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    protected boolean wantsCondiments() {
        return true;
    }
}
