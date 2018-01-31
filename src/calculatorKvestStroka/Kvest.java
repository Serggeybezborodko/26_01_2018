package calculatorKvestStroka;
import java.util.Scanner;

public class Kvest {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в игру!!!");
        System.out.println("Ты сидиш на электрическом стуле. Твоя задача отвечать на вопросы. За каждый неправильный ответ тебя будет бить током");
        Scanner in = new Scanner(System.in);
        int n = 0, num1=0, answer1=0, resultat=0;
        do {
            System.out.println("Начнем игру? Если да то нажми 1, а если нет то нажми любую кнопку");
            n = in.nextInt();
        } while (n != 1 );
        System.out.println("Выберите категории вопросов:" +
                "\n 1 ) Анатомия " +
                "\n 2 ) История" +
                "\n 3 ) Биология ");
        num1= in.nextInt();
        switch (num1){
            case 1 :
                System.out.println("Сколько всего кругов кровообращения в организме человека?\n" +
                        "1) Один\n" +
                        "2) Два \n" +
                        "3) Три ");
                answer1 = in.nextInt();
                if(answer1==2){
                    System.out.println("Правильно\n");
                    resultat++;
                }else{
                    System.out.println("Неправильно\n");
                }
                System.out.println(" У кого больше волос на голове?\n" +
                        "1) У блондинок\n" +
                        "2) У Рыжих \n" +
                        "3) У брюнеток");
                answer1 = in.nextInt();
                if(answer1==1){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println("На каком пальце ноготь растет быстрее остальных?\n" +
                        "1) На среднем\n" +
                        "2) На мизинце \n" +
                        "3) На указательном");
                answer1 = in.nextInt();
                if(answer1==1){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println("Что есть в черепе человека?\n" +
                        "1) Латинская дуга\n" +
                        "2) Греческий орнамент \n" +
                        "3) Турецкое седло ");
                answer1 = in.nextInt();
                if(answer1==3){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println("Чего нет в организме человека?\n" +
                        "1) Среднего уха\n" +
                        "2) Среднего желудка \n" +
                        "3) Среднего мозга");
                answer1 = in.nextInt();
                if(answer1==2){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println("Какая самая сильная мышца в человеческом организме? (по создаваемому усилию)\n" +
                        "1) Передняя зубчатая мышца\n" +
                        "2) Жевательная мышца \n" +
                        "2) Язык ");
                answer1 = in.nextInt();
                if(answer1==2){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                break;
            case 2:
                String str1="В каком году династия Рюриковичей, согласно летописям, начала своё правление в Древней Руси?\n" +
                        "1) 912 г.\n" +
                        "2) 750 г. \n" +
                        "3) 862 г. \n" +
                        "4) 800 г. ";
                String str2="Кто руководил войсками русских и татаро-монголов соответственно во время Куликовской битвы?\n" +
                        "1) Дмитрий Донской и темник Мамай\n" +
                        "2) Иван Калита и хан Тохтамыш \n" +
                        "3) Александр Невский и хан Батый \n" +
                        "4) Василий I и хан Узбек ";
                String str3="При каком российском правителе состоялся переход Суворова через Альпы?\n" +
                        "1) Александр I\n" +
                        "2) Николай I \n" +
                        "3) Екатерина II \n" +
                        "4) Павел I ";
                String str4="Чего не получили крестьяне после отмены крепостного права?\n" +
                        "1) Личная свобода\n" +
                        "2) Право на общее образование \n" +
                        "3) Право собственности на землю \n" +
                        "4) Право заниматься торговлей ";
                String str5="Дата начала Второй мировой войны?\n" +
                        "1) 30 сентября 1939 г.\n" +
                        "2) 22 июня 1941 г. \n" +
                        "3) 9 апреля 1940 г. \n" +
                        "4) 1 сентября 1939 г. ";
                String str6= "Чем характеризовалась Холодная война?\n" +
                        "1) Открытый военный конфликт с применением холодного оружия\n" +
                        "2) Гонка ядерных вооружений \n" +
                        "3) Военные конфликты сверхдержав в Антарктиде и Арктике \n" +
                        "4) Вооружённые конфликты проходили в самую холодную зиму за всю историю метеонаблюдений, в 1952-1953 гг.";
                System.out.println(str1);
                answer1 = in.nextInt();
                if(answer1==3){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println(str2);
                answer1 = in.nextInt();
                if(answer1==1){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println(str3);
                answer1 = in.nextInt();
                if(answer1==4){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println(str4);
                answer1 = in.nextInt();
                if(answer1==3){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println(str5);
                answer1 = in.nextInt();
                if(answer1==4){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                System.out.println(str6);
                answer1 = in.nextInt();
                if(answer1==2){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
                break;
            case 3:
                System.out.println("Живое отличается от неживого: \n" +
                        " 1) составом неорганических веществ \n" +
                        " 2) обменом веществ \n" +
                        " 3) наличием катализаторов \n" +
                        " 4) взаимодействием молекул друг с другом ");
                answer1 = in.nextInt();
                if(answer1==2){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }

                System.out.println("Основными веществами в живых организмах являются: \n" +
                        "1) Углеводы. \n" +
                        "2) Витамины. \n" +
                        "3) Жиры. \n" +
                        "4) Белки. ");
                answer1 = in.nextInt();
                if(answer1==3){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }

                System.out.println(" Биологической системой называют: \n" +
                        " 1) объединение однородных клеток \n" +
                        " 2) несколько рядом расположенных органов \n" +
                        " 3) органы живого организма \n" +
                        " 4) любые биологические объекты ");
                answer1 = in.nextInt();
                if(answer1==1){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }

                System.out.println("Межвидовые отношения начинают проявляться: \n" +
                        "1) На биогеоценотическом уровне. \n" +
                        "2) На популяционно-видовом уровне. \n" +
                        "3) На организменном уровне. \n" +
                        "4) На биосферном уровне. ");
                answer1 = in.nextInt();
                if(answer1==3){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }

                System.out.println("Предметом изучения биологии является: \n" +
                        "1) Строение и функции организма. \n" +
                        "2) Природные явления. \n" +
                        "3) Закономерности развития и функционирования живых систем. \n" +
                        "4) Строение и функции растений и животных. ");
                answer1 = in.nextInt();
                if(answer1==2){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }

                System.out.println(" В 1988 году вышел 4-томный труд А.А.Слудского и А.Бекенова: \n" +
                        "1) «Флора Казахстана». \n" +
                        "2) «Заповедники Казахстана». \n" +
                        "3) «Биологические открытия Казахстана». \n" +
                        "4) «Млекопитающие Казахстана» \n");
                answer1 = in.nextInt();
                if(answer1==4){
                    System.out.println("Правильно\n");
                    resultat++;
                }else {
                    System.out.println("Неправильно\n");
                }
        }
        if(resultat<5){
            System.out.println("Проиграл. Ты неуч и тебя надо проучить!!! Держись крепче ;) !!!\n");

        }else {
            System.out.println("Последний решающий вопрос. От которого зависит твоя дальнейшая судьба!!! Подумай хорошенько. )))");
            System.out.println("Клапан принёс детям конфеты. Алисе он дал половину всех конфет. Матвею – половину оставшихся. Юре досталась половина нового остатка. \n" +
                    "После этого у Клапана осталась всего 1 конфета.\n" +
                    "Сколько конфет принёс Клапан всем мальчикам?\n" +
                    "\n1) 24" +
                    "\n2) 15" +
                    "\n3) 8" +
                    "\n" +
                    "4) 4");
            answer1 = in.nextInt();
            if(answer1==3){
                System.out.println("Правильно. Ты выграл\n");
                System.out.println("Поздравляем ты прошел испытание. Ты свободен!!! ");
            }else {
                System.out.println("Проиграл. Ты неуч и тебя надо проучить!!! Держись крепче ;) !!!\n");
            }

        }
    }
}
