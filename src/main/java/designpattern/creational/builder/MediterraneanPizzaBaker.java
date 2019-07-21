package designpattern.creational.builder;

public class MediterraneanPizzaBaker extends Baker {

    public void createCheese() {
        pizza.setCheese("Feta cheese");
    }

    public void createSauce() {
        pizza.setSauce("Marinara sauce");
    }

    public void createMeat() {
        pizza.setMeat("without meat");
    }

    public void createVegetables() {
        pizza.setVegetables("Caramelized onions, roasted red peppers, sliced black and green\n" +
                "olives, red pepper flakes, capers, fresh basil");
    }

    public void setPizzaName() {
        pizza.setName("Mediterranean Pizza");
    }
}
