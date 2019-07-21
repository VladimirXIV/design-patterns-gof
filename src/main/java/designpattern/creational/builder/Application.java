package designpattern.creational.builder;

public class Application {

    public static void main(String[] args) {

        Chief chief = new Chief();

        Baker mediterraneanPizzaBaker = new MediterraneanPizzaBaker();
        Baker polloPolcariPizzaBaker = new PolloPolcariPizzaBaker();

        Pizza pizza;

        chief.setBaker(mediterraneanPizzaBaker);
        chief.bakePizza();
        pizza = chief.getPizza();
        System.out.println(pizza);

        chief.setBaker(polloPolcariPizzaBaker);
        chief.bakePizza();
        pizza = chief.getPizza();
        System.out.println(pizza);
    }

}
