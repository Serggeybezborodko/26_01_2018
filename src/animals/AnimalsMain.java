package animals;


public class AnimalsMain {
    public static void main(String[] args) {

        Dog [] dogMas = new Dog[3];
        dogMas[0]=;

        



        Cat cat  =new Cat("Oval","Vaska");
        Cat cat2  =new Cat("Oval","Vaska");
        Dog dog = new Dog("oval","Vaska");

        Cat cat3=cat;

        Cat cat1 = new Cat("triangle","Irisca");

//        System.out.println(cat==cat1);
//        System.out.println(cat.equals(cat1));
//
//        System.out.println("-------------------");

        System.out.println(cat==cat2);
        System.out.println(cat.equals(cat2));

        System.out.println("---------------------");
        System.out.println(cat.equals(dog));


    }

}
