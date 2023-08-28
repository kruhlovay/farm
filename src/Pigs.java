import java.util.ArrayList;
import java.util.Scanner;

public class Pigs extends BaseAnimal{

    public Pigs(int id) {
        super(id);
    }
    ArrayList<String> typeOfPig = new ArrayList<String>();
    void addTypeOfPig(){
        typeOfPig.add("Boar");
        typeOfPig.add("Sow");
        typeOfPig.add("Piglet");
        typeOfPig.add("Hog");
        typeOfPig.add("Stag");
    }

    ArrayList<String> groupsOfPigs = new ArrayList<String>();
    void addGroupOfPig(){
        groupsOfPigs.add("Herd");
        groupsOfPigs.add("Sounder");
    }
    ArrayList<String> typesOfHousing = new ArrayList<String>();
    void addTypeOfHousing(){
        typesOfHousing.add("Sty");
        typesOfHousing.add("Pig-shed");
        typesOfHousing.add("Ark");
        typesOfHousing.add("Curtain-barn");
    }

    private int age;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
private boolean sterilizationNeeded;

    public boolean isSterilizationNeeded() {
        return sterilizationNeeded;
    }

    public void setSterilizationNeeded(boolean sterilizationNeeded) {
        this.sterilizationNeeded = sterilizationNeeded;
    }

    public void showTheChosenHousing(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose the type of housing: 1 for "+ typesOfHousing.get(0)+", 2 for "+typesOfHousing.get(1)+", 3 for "+typesOfHousing.get(2)+", 4 for "+typesOfHousing.get(3)+".");
        int x = s.nextInt();
        switch(x){
            case 1:
                System.out.println("Housing is "+typesOfHousing.get(0) +".");
            case 2:
                System.out.println("Housing is "+typesOfHousing.get(1) +".");
            case 3:
                System.out.println("Housing is "+typesOfHousing.get(2) +".");
            case 4:
                System.out.println("Housing is "+typesOfHousing.get(3) +".");
        }
    }

    public String chooseTypeOfPig(){
        String pigType = "Not Defined";
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose the type of pig: 1 for "+ typeOfPig.get(0)+", 2 for "+typeOfPig.get(1)+", 3 for "+typeOfPig.get(2)+", 4 for "+typeOfPig.get(3)+", 5 for "+typeOfPig.get(4)+".");
        int x = s.nextInt();
        switch(x){
            case 1:
                System.out.println("Type of pig is "+typeOfPig.get(0) +".");
                pigType = typeOfPig.get(0); 
            case 2:
                System.out.println("Type of pig is "+typeOfPig.get(1) +".");
                pigType = typeOfPig.get(1);
            case 3:
                System.out.println("Type of pig is "+typeOfPig.get(2) +".");
                pigType = typeOfPig.get(2);
            case 4:
                System.out.println("Type of pig is "+typeOfPig.get(3) +".");
                pigType = typeOfPig.get(3);
            case 5:
                System.out.println("Type of pig is "+typeOfPig.get(4) +".");
                pigType = typeOfPig.get(4);
        }
        return pigType;

    }

    public boolean isVetRequired(){
        boolean bookTheVet;
        if(age >10){
            bookTheVet=true;
        }
        else if(age <10){
            bookTheVet = true;
        }
        else{
            Scanner s = new Scanner(System.in);
            System.out.println("Does the animal sick? Enter Yes or No");
            String x = s.next();
            if(x=="Yes"){
                bookTheVet = true;
            }
            else{
                bookTheVet=false;
                }
        }
        System.out.println("Is booking the vet required? "+bookTheVet+".");
        return bookTheVet;
    }
    
    public void toMeat(){
        boolean isToMeat;
        switch (chooseTypeOfPig()){
            case "Boar":
                isToMeat=true;
                System.out.println("Is the animal ready for production shipping? "+isToMeat+".");
            case "Sow":
                isToMeat=false;
                System.out.println("Is the animal ready for production shipping? "+isToMeat+".");
            case "Piglet":
                isToMeat = false;
                System.out.println("Is the animal ready for production shipping? "+isToMeat+".");
            case "Hog":
                isToMeat = false;
                System.out.println("Is the animal ready for production shipping? "+isToMeat+".");
            case "Stag":
                isToMeat = true;
                System.out.println("Is the animal ready for production shipping? "+isToMeat+".");
        }

    }
}
