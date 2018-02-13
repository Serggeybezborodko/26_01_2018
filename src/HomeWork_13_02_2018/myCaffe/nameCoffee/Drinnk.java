package HomeWork_13_02_2018.myCaffe.nameCoffee;

public abstract class Drinnk {
    private String name;

    public abstract String beverageCompositions();

    public abstract int calculationOfTheCostOfDrink();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
