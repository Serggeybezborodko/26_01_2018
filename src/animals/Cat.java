package animals;


public class Cat extends Animals {
    private String name;
    private String age;
    private String cost;



    public Cat(String headForm,String name) {
        this.name=name;
        super.setHeadForm(headForm);
    }


    @Override
    protected void sayMyNameAndWhatICan() {
        super.sayMyNameAndWhatICan();
        System.out.println(murluk()+" So I cat and My name "+ getName());
    }

    private String murluk(){
        return ", mur";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return !(name != null ? !name.equals(cat.name) : cat.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
