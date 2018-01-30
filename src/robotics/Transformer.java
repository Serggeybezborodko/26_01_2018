package robotics;


public class Transformer extends Robot {
    private boolean sword;
    private String name;

    protected String tranformerField;

    public void fight(){
    if(sword==true){
        System.out.println(getName()+"Ican fight, my serial number is "+getSerialNumber());
    }
    }

    public boolean isSword() {
        return sword;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
    }


    public String getName() {
        System.out.println("It is transformer get name");
        super.getName();
        return null;
    }


    public void setName(String name) {
        System.out.println("It is transformer set name");
        super.setName(name);
    }

    @Override
    public void thunking() {

        System.out.println("But i am transfomer am very smart");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transformer)) return false;

        Transformer that = (Transformer) o;

        if (isSword() != that.isSword()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return !(tranformerField != null ? !tranformerField.equals(that.tranformerField) : that.tranformerField != null);

    }

    @Override
    public int hashCode() {
        int result = (isSword() ? 1 : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (tranformerField != null ? tranformerField.hashCode() : 0);
        return result;
    }
}
