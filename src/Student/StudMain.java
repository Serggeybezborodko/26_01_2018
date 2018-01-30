package Student;

/**
 * Created by java on 26.01.2018.
 */
public class StudMain {
    public static void main(String[] args) {

        Student st1= new Student();
        st1.setAge(2);
        st1.setName("all");
        Student st2= new Student();
        st2.setAge(2);
        st2.setName("all");

        System.out.println(st1.equals(st2));

    }
}
