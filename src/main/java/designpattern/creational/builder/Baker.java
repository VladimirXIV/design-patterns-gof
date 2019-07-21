package designpattern.creational.builder;

/* abstract builder */
public abstract class Baker {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    public abstract void createCheese();
    public abstract void createSauce();
    public abstract void createMeat();
    public abstract void createVegetables();
    public abstract void setPizzaName();
}
