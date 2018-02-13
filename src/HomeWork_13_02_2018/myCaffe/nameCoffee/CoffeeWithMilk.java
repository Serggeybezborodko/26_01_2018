package HomeWork_13_02_2018.myCaffe.nameCoffee;

import HomeWork_13_02_2018.myCaffe.Ingredient.Coffee;
import HomeWork_13_02_2018.myCaffe.Ingredient.Milk;
import HomeWork_13_02_2018.myCaffe.Ingredient.Sugar;
import HomeWork_13_02_2018.myCaffe.Ingredient.Water;


public class CoffeeWithMilk extends Drinnk {

    private Coffee coffee;
    private Water water;
    private Sugar sugar;
    private Milk milk;

    public CoffeeWithMilk() {
    }

    public CoffeeWithMilk(Coffee coffee, Water water, Sugar sugar, Milk milk) {
        this.coffee = coffee;
        this.water = water;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Override
    public String beverageCompositions() {
        return "Состав кофе  " + coffee.getName() + water.getName() + sugar.getName() + milk.getName();
    }

    @Override
    public int calculationOfTheCostOfDrink() {
        return coffee.getSize() + water.getSizeWater() + sugar.getSizeS() + milk.getSizeM();
    }

    @Override
    public String getName() {
        return "Кофе с молоком";
    }


}
