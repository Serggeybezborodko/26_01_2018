package HomeWork_13_02_2018.myCaffe.nameCoffee;

import HomeWork_13_02_2018.myCaffe.Ingredient.Coffee;
import HomeWork_13_02_2018.myCaffe.Ingredient.Sugar;
import HomeWork_13_02_2018.myCaffe.Ingredient.Water;
import com.sun.deploy.util.Waiter;

public class Exspresso extends Drinnk {
    private Coffee coffee;
    private Water water;
     private Sugar sugar;


            public Exspresso() {
           }


            public Exspresso(Coffee coffee, Water water, Sugar sugar) {
         this.coffee = coffee;
       this.water = water;
    }




          @Override
     public String beverageCompositions() {
              return "Состав кофе  "+coffee.getName()+ water.getName()+sugar.getName();
        }


            @Override
            public int calculationOfTheCostOfDrink() {
              return coffee.getSize()+water.getSizeWater()+sugar.getSizeS();
           }


           @Override
    public String getName() {
            return "Exspresso";
        }


}
