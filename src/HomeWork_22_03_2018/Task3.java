package HomeWork_22_03_2018;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

                map.put("C", "c");

                 if (map.containsKey("E")) { System.out.println("Такой ключ существует");
                   } else { System.out.println("Нет такого");
                 }
    }
}
