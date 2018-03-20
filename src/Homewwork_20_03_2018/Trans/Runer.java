package Homewwork_20_03_2018.Trans;
import Homewwork_20_03_2018.Trans.Dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class Runer {

         public static ArrayList<Dictionary> dict = new ArrayList<>();


          public static void main(String[] args) {
                setDicty();
              listFor_12();
                   //  listFor_9();

              }


          public static void setDicty() {
                  dict.add(new Dictionary("one", "один", "[ван]"));
                  dict.add(new Dictionary("two", "два", "[ту]"));
              dict.add(new Dictionary("three", "три", "[сры]"));
               dict.add(new Dictionary("four", "четыре", "[фо]"));
                dict.add(new Dictionary("five", "пять", "[файв]"));
                    dict.add(new Dictionary("six", "шесть", "[сыкс]"));
                 dict.add(new Dictionary("seven", "семь", "[сэвэн]"));
                    dict.add(new Dictionary("eight", "восемь", "[ейт]"));
                dict.add(new Dictionary("nine", "девять", "[найн]"));
           dict.add(new Dictionary("ten", "десять", "[тэн]"));
                   dict.add(new Dictionary("eleven", "одинадцать", "[илевен]"));
                 dict.add(new Dictionary("twelve", "двенадцать", "[твелв]"));
               dict.add(new Dictionary("thirteen", "тринадцать", "[сортин]"));
                   dict.add(new Dictionary("fourteen", "четырнадцать", "[фортин]"));
                  dict.add(new Dictionary("fifteen", "пятнадцать", "[фифтин]"));
                   dict.add(new Dictionary("sixteen", "шестнадцать", "[сикстин]"));
                dict.add(new Dictionary("seventeen", "семнадцать", "[сэвэнтин]"));
                dict.add(new Dictionary("eighteen", "восемнадцать", "[эйтин]"));
               dict.add(new Dictionary("nineteen", "девятнадцать", "[найнтин]"));
                    dict.add(new Dictionary("twenty", "двадцать", "[твенти]"));
              dict.add(new Dictionary("actor","актер","[ектер]"));
              dict.add(new Dictionary("actress","актриса","[етрис]"));
              dict.add(new Dictionary("baker","пекарь","[бєйкер]"));
              dict.add(new Dictionary("doctor","доктор","[доктє]"));
              dict.add(new Dictionary("cat","кот","[кэт]"));
              dict.add(new Dictionary("dog","собака","[дог]"));
              dict.add(new Dictionary("rat","крыса","[рэт]"));
              dict.add(new Dictionary("cow","корова","[кау]"));
              dict.add(new Dictionary("duck","утка","[дак]"));
              dict.add(new Dictionary("donkey","осел","[донки]"));
              dict.add(new Dictionary("goat","коза","[гоут]"));
              dict.add(new Dictionary("goose","гусь","[гус]"));
              dict.add(new Dictionary("hamster","хомяк","[хэмстэ]"));
              dict.add(new Dictionary("hen","курица","[хен]"));
              dict.add(new Dictionary("horse","лошадь","[хос]"));
              dict.add(new Dictionary("mouse","мышь","[маус]"));
              dict.add(new Dictionary("pig","свинья","[пиг]"));
              dict.add(new Dictionary("rabbit","кролик","[рэбит]"));
              dict.add(new Dictionary("sheep","овца","[шип]"));
              dict.add(new Dictionary("fox","лиса","[фокс]"));
              dict.add(new Dictionary("bear","медведь","[бэр]"));



                }




          public static void listFor_9() {


                Scanner in = new Scanner(System.in);


         System.out.println("В каком виде вывести:\n" +
                                 "1. Слово + транскрипция + перевод\n" +
                                "2. Слово + перевод");
                    int n = in.nextInt();
                 switch (n) {
                          case 1:
                               for (int i = 0; i < 3; i++) {
                                          int st1 = (int) (Math.random() * dict.size());
                                       int st2 = (int) (Math.random() * dict.size());
                                             int st3 = (int) (Math.random() * dict.size());
                                             System.out.println(dict.get(st1).getWord() + "\t"  + dict.get(st2).getWord() + "\t" + dict.get(st3).getWord());
                                        System.out.println(dict.get(st1).getTranscription() + "\t" + dict.get(st2).getTranscription() + "\t" + dict.get(st3).getTranscription());
                                            System.out.println(dict.get(st1).getTranslation() + "\t"  + dict.get(st2).getTranslation() + "\t" + dict.get(st3).getTranslation());
                                           System.out.println();
                                        }
                                  break;
                            case 2:
                              for (int i = 0; i < 3; i++) {
                                            int st1 = (int) (Math.random() * dict.size());
                                            int st2 = (int) (Math.random() * dict.size());
                                          int st3 = (int) (Math.random() * dict.size());
                                            System.out.println(dict.get(st1).getWord() + "\t"  + dict.get(st2).getWord() + "\t" + dict.get(st3).getWord());
                                            System.out.println(dict.get(st1).getTranslation() + "\t"  + dict.get(st2).getTranslation() + "\t" + dict.get(st3).getTranslation());
                                         System.out.println();
                                }
                               break;


                     }
              }
    public static void listFor_12() {


                Scanner in = new Scanner(System.in);


                System.out.println("Вид вывода:\n" +
                                    "1. Word + Transcription + Translation\n" +
                                  "2. Word + Translation");
                   int n = in.nextInt();
                   switch (n) {
                           case 1:
                                for (int i = 0; i < 3; i++) {
                                         int st2 = (int) (Math.random() * dict.size());
                                         int st3 = (int) (Math.random() * dict.size());
                                        int st4 = (int) (Math.random() * dict.size());
                                     int st5 = (int) (Math.random() * dict.size());
                                       System.out.println(dict.get(st2).getWord()  + "\t" + dict.get(st3).getWord() + "\t" + dict.get(st4).getWord()+"\t"+dict.get(st5).getWord());
                                        System.out.println(dict.get(st2).getTranscription()  + "\t" + dict.get(st3).getTranscription()  + "\t" + dict.get(st4).getTranscription()+"\t"+dict.get(st5).getTranscription());
                                        System.out.println(dict.get(st2).getTranslation()  + "\t" + dict.get(st3).getTranslation() + "\t" + dict.get(st4).getTranslation()+"\t"+dict.get(st5).getTranslation());
                                       System.out.println();
                                        }
                               break;
                            case 2:
                                  for (int i = 0; i < 3; i++) {
                                       int st2 = (int) (Math.random() * dict.size());
                                          int st3 = (int) (Math.random() * dict.size());
                                        int st4 = (int) (Math.random() * dict.size());
                                         int st5 = (int) (Math.random() * dict.size());

                                          System.out.println(dict.get(st2).getWord()  + "\t" + dict.get(st3).getWord()  + "\t" + dict.get(st4).getWord()+"\t"+dict.get(st5).getWord());
                                       System.out.println(dict.get(st2).getTranslation() + "\t" + dict.get(st3).getTranslation() + "\t" + dict.get(st4).getTranslation()+"\t"+dict.get(st5).getTranslation());
                                        System.out.println();
                                    }
                                   break;
                     }
             }
 }


