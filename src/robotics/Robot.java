package robotics;

/**
 * Created by java on 26.01.2018.
 */
public class Robot {

    private String name;
    private int cpu;
    private int serialNumber;

    public void thunking() {
        if (checkOnSerialNumber() == true) {
            if (cpu > 2) {
                System.out.println("I am Thinking very good");
            } else {

                System.out.println("I am a stuoped robot");
            }
        }
        System.out.println("Robot must exist with serial number");
    }

    private boolean checkOnSerialNumber() {
        if (serialNumber != 0) {
            return true;
        }
        return false;
    }


    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getName() {
        System.out.println("it is Robot get name");
        return name;
    }

    public void setName(String name) {
        System.out.println("it is Robot set name");
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
