package designpattern.creational.builder;

/* product */
public class Pizza {

    private String name;

    private String cheese;
    private String sauce;
    private String meat;
    private String vegetables;


    public Pizza() {

    }

    public Pizza (String name, String cheese, String sauce, String meat, String vegetables) {
        this.name = name;
        this.cheese = cheese;
        this.sauce = sauce;
        this.meat = meat;
        this.vegetables = vegetables;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String pasta) {
        this.meat = pasta;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                ", meat='" + meat + '\'' +
                ", vegetables='" + vegetables + '\'' +
                '}';
    }
}
