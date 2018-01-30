package animals;


import static java.lang.System.*;

public class Animals {

    private String headForm;

    private String breath(){
        return "i am breath";
    }

    protected void sayMyNameAndWhatICan(){
        System.out.print("My head form is "+ this.headForm+" , "+breath());
    }


    public Animals() {

    }

    public String getHeadForm() {
        return headForm;
    }

    public void setHeadForm(String headForm) {
        this.headForm = headForm;
    }
}
