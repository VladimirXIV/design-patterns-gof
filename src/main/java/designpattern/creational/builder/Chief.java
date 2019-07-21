package designpattern.creational.builder;

public class Chief {

    private Baker baker;

    public void setBaker(Baker baker) {
        this.baker = baker;
    }

    public Pizza getPizza() {
        return baker.getPizza();
    }

    public void bakePizza() {
        baker.createNewPizza();
        baker.createCheese();
        baker.createMeat();
        baker.createSauce();
        baker.createVegetables();
        baker.setPizzaName();
    }
}
