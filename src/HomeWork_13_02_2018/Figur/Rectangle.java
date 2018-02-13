package HomeWork_13_02_2018.Figur;

public class Rectangle extends Figyr {
    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }


    @Override
    void draw() {
        System.out.println("Рисуем прямоугольник ");
    }


    @Override
    void areaCalculation() {
        System.out.println("Если сторона а=" + super.getSideA() + ", а сторона b=" + super.getSideB() +
                ", площадь прямоугольника = " + super.getSideA() * super.getSideB());


    }

}
