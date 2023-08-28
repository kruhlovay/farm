public class Sheep extends BaseAnimal{
    public Sheep(int id) {
        super(id);
    }

    private int age;
    private String sex;
    private int weight;
    private boolean isForWool;
    private boolean isForBreeding;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isForWool() {
        return isForWool;
    }

    public void setForWool(boolean forWool) {
        isForWool = forWool;
    }

    public boolean isForBreeding() {
        return isForBreeding;
    }

    public void setForBreeding(boolean forBreeding) {
        isForBreeding = forBreeding;
    }

    public void describeSheep(){
        System.out.println("The sheep has sex: "+ getSex()+", weights "+ getWeight() + "kg., has age: "+ getAge()+", is used for wool: "+isForWool()+", is for breeding: "+isForBreeding()+".");
    }
}
