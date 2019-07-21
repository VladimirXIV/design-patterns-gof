package designpattern.creational.builder;

public class PolloPolcariPizzaBaker extends Baker {

    public void createCheese() {
        pizza.setCheese("Ricotta, Parmesan, Romano, Mozzarella cheese");
    }

    public void createSauce() {
        pizza.setSauce("Tomato sauce");
    }

    public void createMeat() {
        pizza.setMeat("Grilled chicken breast");
    }

    public void createVegetables() {
        pizza.setVegetables("Roasted red peppers");
    }

    public void setPizzaName() {
        pizza.setName("Pollo Polcari Pizza");
    }
}
