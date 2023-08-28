public class Horses extends BaseAnimal{
    public Horses(int id) {
        super(id);
    }
    private int age;
    private int height;
    private String breed;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void isForSport(){
        String a = getBreed();
        String yesLine = "The horse may be used for sport";
        String noLine = "The horse may not be used for sport";
        if(a=="Quarter Horse"){
            System.out.println(yesLine);
        }
        else if(a=="Thoroughbred"){
            System.out.println(yesLine);
        }
        else if(a=="Anglo-Arabian"){
            System.out.println(yesLine);
        }
        else if(a=="Irish Sport Horse"){
            System.out.println(yesLine);
        }
        else if(a=="Dutch Warmblood"){
            System.out.println(yesLine);
        }
        else if(a=="Hanoverian"){
            System.out.println(yesLine);
        }
        else if(a=="Selle Francais"){
            System.out.println(yesLine);
        }
        else if(a=="Holsteiner"){
            System.out.println(yesLine);
        }
        else if(a=="Oldenburg"){
            System.out.println(yesLine);
        }
        else{
            System.out.println(noLine);
        }

    }

    public void isForFarming(){
        String a = getBreed();
        String yesLine = "The horse may be used for farming";
        String noLine = "The horse may not be used for farming";
        if(a=="American Cream"){
            System.out.println(yesLine);
        }
        else if(a=="Belgian"){
            System.out.println(yesLine);
        }
        else if(a=="Clydesdale"){
            System.out.println(yesLine);
        }
        else if(a=="Percheron"){
            System.out.println(yesLine);
        }
        else if(a=="Irish Draught"){
            System.out.println(yesLine);
        }
        else if(a=="Shire"){
            System.out.println(yesLine);
        }
        else if(a=="Suffolk Punch"){
            System.out.println(yesLine);
        }
        else if(a=="Brabants"){
            System.out.println(yesLine);
        }
        else if(a=="Friesians"){
            System.out.println(yesLine);
        }
        else if(a=="Haflingers"){
            System.out.println(yesLine);
        }
        else {
            System.out.println(noLine);
        }
    }

}
