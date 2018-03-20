package Homewwork_20_03_2018;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainNumb_4 {

         public static void main(String[] args) {

                  List<Integer> mass = new LinkedList<>();
       for (int i = 0; i < 50; i++) {
                       mass.add(ThreadLocalRandom.current().nextInt(25, 99 + 1));

                         }
                  System.out.println("Вывод коллекции:\n"+mass);
                  mass.subList(15,43).clear();
                 System.out.println("Вывод коллекции после удаления:\n"+mass);

           }
 }


