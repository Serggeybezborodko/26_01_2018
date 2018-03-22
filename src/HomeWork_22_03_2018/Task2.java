package HomeWork_22_03_2018;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner inSc = new Scanner(System.in);
        System.out.println("Введите числа:");
        for (int i = 0; i < 5; i++) {
            int l = inSc.nextInt();
            hashSet.add(l);
            arrayList.add(l);
        }
        System.out.println("Числа которые ввели: " + arrayList);
        System.out.println("Числа без повторений: " + hashSet);

    }
}
