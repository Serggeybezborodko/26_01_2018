package Homewwork_20_03_2018;

    import java.util.*;


    public class Runner {

       public static void main(String[] args) {


               List<Person>persons=new ArrayList<>();
                  persons.add(new Person("Kolya",35));
                persons.add(new Person("Wima",29));
               persons.add(new Person("Vova",97));
               persons.add(new Person("Anton",75));



              Collections.sort(persons,new AgeComparator());
        System.out.println("ArrayList:\n"+"Возраст-->"+persons);



                 Collections.sort(persons,new NameComparator());
                System.out.println("Имена-->"+persons);

                System.out.println("-------------------");


                   List<Person>persons1=new LinkedList<>();
                   persons1.add(new Person("Kolya",25));
           persons1.add(new Person("Wima",36));
           persons1.add(new Person("Vova",75));
           persons1.add(new Person("Anton",45));



                  Collections.sort(persons1,new AgeComparator());
                System.out.println("LinkedList:\n"+" Возраст-->"+persons1);



                   Collections.sort(persons1,new NameComparator());
                  System.out.println("Имена-->"+persons1);


              System.out.println("-------------------------------------");



               Set<Person> persons2=new TreeSet<>(new NameComparator());
           persons2.add(new Person("Kolya",35));
           persons2.add(new Person("Wima",29));
           persons2.add(new Person("Vova",97));
           persons2.add(new Person("Anton",75));
                System.out.println(" TreeSet:\n"+" Имена-->"+persons2);



            Set<Person> persons3=new TreeSet<>(new AgeComparator());
           persons3.add(new Person("Kolya",35));
           persons3.add(new Person("Wima",29));
           persons3.add(new Person("Vova",97));
           persons3.add(new Person("Anton",75));
                   System.out.println(" Возраст->"+persons3);


                 System.out.println("-------------------------------------");


               //Сортировка по имени HashSet


              Set<Person> persons4=new HashSet<>();
           persons4.add(new Person("Kolya",35));
           persons4.add(new Person("Wima",29));
           persons4.add(new Person("Vova",97));
           persons4.add(new Person("Anton",75));
                List<Person>persons5=new ArrayList<>(persons4);
          Collections.sort(persons5,new NameComparator());
                    System.out.println(" HashSet:\n"+" иМЕНА-->"+persons5);





                 Set<Person> persons6=new HashSet<>();
           persons6.add(new Person("Kolya",35));
           persons6.add(new Person("Wima",29));
           persons6.add(new Person("Vova",97));
           persons6.add(new Person("Anton",75));
              List<Person>persons7=new ArrayList<>(persons6);
                 Collections.sort(persons7,new AgeComparator());
                  System.out.println("Bозраст-->"+persons7);


              System.out.println("-------------------------------------");
                 }
}


