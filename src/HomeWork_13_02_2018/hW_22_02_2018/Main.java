package HomeWork_13_02_2018.hW_22_02_2018;

public class    Main {

    // метод Фибоначи
    static int fibonachi(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonachi(n - 1) + fibonachi(n - 2);
    }
//==========================================================

    // Рекурсия
    static void countDownRec(int numRec) {
        if (numRec < 0) return;
        System.out.print(numRec-- + "       ");
        countDownRec(numRec);
    }
//==========================================================

    public static void main(String[] args) {
        for (int i = 1; i < 25; i++) {
            System.out.print(fibonachi(i) + " ");
            }
        System.out.println();
            countDownRec(25);

    }


}
