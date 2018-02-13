package HomeWork_13_02_2018.Figur;

public class Square extends Figyr {
    public Square(int sideA) {
        super(sideA);
    }


    @Override
    void draw() {
        System.out.println("Pисует четыре одинаковых стороны");


    }


    @Override
    void areaCalculation() {
        System.out.println("Если сторона а=" + super.getSideA() + ", площадь квадрата = " + Math.pow(super.getSideA(), 2));


    }

}
