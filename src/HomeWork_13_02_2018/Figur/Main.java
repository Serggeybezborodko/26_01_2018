package HomeWork_13_02_2018.Figur;

public class Main {
    public static void main(String[] args) {
        Figyr rectangle = new Rectangle(10, 5);
        rectangle.areaCalculation();
        rectangle.draw();


        System.out.println("-----------------");


        Figyr square = new Square(12);
        square.areaCalculation();
        square.draw();


        System.out.println("------------------");


        Figyr triangle = new Triangle(3, 4, 5);
        triangle.areaCalculation();
        triangle.draw();


        System.out.println("-------------------");


        Figyr circle = new Circle(8);
        circle.areaCalculation();
        circle.draw();
    }

}
