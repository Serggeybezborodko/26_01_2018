package HomeWork_13_02_2018.myCaffe;

import HomeWork_13_02_2018.myCaffe.Ingredient.Coffee;
import HomeWork_13_02_2018.myCaffe.Ingredient.Milk;
import HomeWork_13_02_2018.myCaffe.Ingredient.Sugar;
import HomeWork_13_02_2018.myCaffe.Ingredient.Water;
import HomeWork_13_02_2018.myCaffe.nameCoffee.CoffeeWithMilk;
import HomeWork_13_02_2018.myCaffe.nameCoffee.Drinnk;
import HomeWork_13_02_2018.myCaffe.nameCoffee.Exspresso;

public class CoffeeRunner {
    public static void main(String[] args) {

        Drinnk coffeeWithMilk = new CoffeeWithMilk(new Coffee(), new Water(), new Sugar(), new Milk());
        Drinnk exspresso = new Exspresso(new Coffee(), new Water(), new Sugar());

        Drinnk[] mass = new Drinnk[3];
        mass[0] = exspresso;
        mass[1] = coffeeWithMilk;

        for (Drinnk dr : mass) {
            System.out.println("Напиток: " + dr.getName() + " Состав: " + dr.beverageCompositions() + "Цена: " + dr.calculationOfTheCostOfDrink() + " грн");
        }
    }

}
