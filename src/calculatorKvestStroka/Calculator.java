package calculatorKvestStroka;
import java.util.Scanner;

public class Calculator {
    static Scanner in;

    public Calculator() {
    }

    public static int getInt() {
        System.out.println("Введите свое целое число: ");
        while(!in.hasNextInt()) {
            System.out.println("Вы ввели не число, повторите еще раз ввод:");
            in.next();
        }
        return in.nextInt();
    }
    public static char getOperation() {
        System.out.println("Выберите операцию:" +
                "*) умножение       " +
                "+) сумма       " +
                "-) разница     " +
                "/) деление      ");
        char oper = in.next().charAt(0);
        return oper;
    }

    public static int calculator(int num0, int num1, char znaki) {
        int res;
        switch(znaki) {
            case '*':
                res = num0 * num1;
                break;
            case '+':
                res = num0 + num1;
                break;
            case ',':
            case '.':
            default:
                System.out.println("Вы неверно ввели операцию, повторите ввод:");
                res = calculator(num0, num1, getOperation());
                break;
            case '-':
                res = num0 - num1;
                break;
            case '/':
                res = num0 / num1;
        }

        return res;
    }

    public static void main(String[] args) {
        int num0 = getInt();
        int num1 = getInt();
        char znaki = getOperation();
        int rezultat = calculator(num0, num1, znaki);
        System.out.println("Ваш результат равен=" + rezultat);
    }

    static {
        in = new Scanner(System.in);
    }
}

