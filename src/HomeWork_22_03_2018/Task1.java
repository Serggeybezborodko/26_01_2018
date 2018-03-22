package HomeWork_22_03_2018;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap <>();

                hashMap.put("Sim", 5);
                hashMap.put("Bim", 6);
                hashMap.put("Kos", 7);
                hashMap.put("Lot", 8);
                hashMap.put("Mot", 9);
                hashMap.put("Dot", 10);
                hashMap.put("Gro", 1);
                hashMap.put("Loo", 2);
                hashMap.put("Too", 3);
                hashMap.put("Goo", 4);

              for (HashMap.Entry<String, Object> s : hashMap.entrySet()) {
                       System.out.println(s.getKey() + " - " + s.getValue());
             }

    }
}
