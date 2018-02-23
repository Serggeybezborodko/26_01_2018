package ClassWork.CW_23_01_2018;


public class CW_23_02_2018_V2 {
//    public static void main(String[] args) {
//
//        int result = 0;
//
//        try{
//            System.out.println("i am try");
//            result = getAreaValue(-1, 100);
//
//        }catch(IllegalArgumentException e){
//           // Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING, "В метод вычисления площади был передан аргумент с негативным значением!"));
//            System.out.println("i am in catch");
//            throw e;
//        }
//        System.out.println("Result is : "+result);
//    }
//
//    public static int getAreaValue(int x, int y){
//        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
//        return x*y;
//    }


    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }
    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }
    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
        }
        procB();
    }


}
