package HomeWork_13_02_2018.Figur;

public class Triangle extends Figyr {
    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    void draw() {
        System.out.println("Pисует три стороны");
    }

    @Override
    void areaCalculation() {
        int p = (super.getSideA() + super.getSideB() + super.getSideC()) / 2;
        double areaTriangle = Math.sqrt(p * ((p - super.getSideA()) * (p - super.getSideB()) * (p - super.getSideC())));
        System.out.println("Если сторона а = " + super.getSideA() + ", b = " + super.getSideB() + ", c = " + super.getSideC() +
                ", площадь треугольника = " + areaTriangle);


    }

}
