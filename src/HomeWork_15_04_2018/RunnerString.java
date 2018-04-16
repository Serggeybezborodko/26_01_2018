package HomeWork_15_04_2018;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class RunnerString {public static Class clss = Word.class;


             public static void main(String[] args) throws IllegalAccessException {


                 Word word = new Word();
                 printFields(word);
                 System.out.println();
                 toLowerCase(word);
                 System.out.println();
                 toUpperCase(word);
             }


             public static void printFields(Word word) throws IllegalAccessException {


                 System.out.println("Вывод всех полей класса Person:");
                 Field[] fields = clss.getDeclaredFields();
                 for (Field field : fields) {
                         field.setAccessible(true);
                         System.out.println(Modifier.toString(field.getModifiers()) + "-"
                                         + field.getType().getName() + "-" + field.getName() + "=" + field.get(word));
                     }
             }


            public static void toLowerCase(Word word) throws IllegalAccessException {
               System.out.println("Bсе большие буквы на маленькие:");
            Field[] fields = clss.getDeclaredFields();
              for (Field field : fields) {
                      if (field.getType().getName() == "java.lang.String") {
                             field.setAccessible(true);
                               field.set(word, (String) field.get(word).toString().toLowerCase());
                             System.out.println(field.getName() + "=" + field.get(word));
                          }
                }
          }


       public static void toUpperCase(Word person) throws IllegalAccessException {
               System.out.println("Bсе маленькие буквы на большие:");
             Field[] fields = clss.getDeclaredFields();
           for (Field field : fields) {
                         if (field.getType().getName() == "java.lang.String") {
                            field.setAccessible(true);
                               field.set(word, (String) field.get(word).toString().toUpperCase());
                                 System.out.println(field.getName() + "=" + field.get(word));
                        }
                 }
            }
 }

