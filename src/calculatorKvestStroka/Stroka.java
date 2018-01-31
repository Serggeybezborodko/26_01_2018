package calculatorKvestStroka;

public class Stroka {
    public static void main(String[] args) {
        String str = "Был и я среди донцов..." +
                "\nБыла пора: наш праздник молодой..." +
                "\n альбом (Гонимый рока самовластьем...)" +
                "\nВ альбом (Долго сих листов заветных...)" +
                "\nВ альбом А. О. Смирновой\nВ альбом княжны А. Д. Абамалек" +
                "\nВ альбом Павлу Вяземскому\nВ еврейской хижине лампада..." +
                "\nВ крови горит огонь желанья...\nВ мои осенние досуги..." +
                "\nВ начале жизни школу помню я..." +
                "\nВ поле чистом серебрится Снег...\n\n";
        System.out.print(str);
        String[] mass = new String[str.length()];

        for (int i = 0; i < str.length(); ++i) {
            mass[i] = str.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(mass[i]);
            }
        }
        System.out.println();
        String[] word = str.split("альбом");
        System.out.print("Количество слов \"альбом\" в строке = ");
        System.out.print(word.length - 1);
        System.out.println();
        System.out.println();
        System.out.println(str.replace("В", ";)"));
    }
}
