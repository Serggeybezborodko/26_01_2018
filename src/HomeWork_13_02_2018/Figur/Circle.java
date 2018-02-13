package HomeWork_13_02_2018.Figur;

public class Circle extends Figyr {
    private int radius;


    public int getRadius() {
        return radius;
    }


        public void setRadius(int radius) {
        this.radius = radius;
    }

     public Circle(int radius) {
         this.radius=radius;
      }


     @Override
    void draw() {
       System.out.println("Рисует круг");


        }


         @Override
    void areaCalculation() {
             System.out.println("Если радиус = " + getRadius() + ", площадь круга = " + (3.14*Math.pow(getRadius(),2)));


          }

}
