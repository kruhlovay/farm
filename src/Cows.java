import java.util.ArrayList;
import java.util.Scanner;

public class Cows extends BaseAnimal {

    public Cows(int id) {
        super(id);
    }

    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    ArrayList<String> typeOfCow = new ArrayList<String>();

    void addTypeOfCow() {
        typeOfCow.add("Cow");
        typeOfCow.add("Bull");
        typeOfCow.add("Calf");
    }
public String cowType;
    public String choseTypeOfAnimal(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose the type of cow: 1 for "+ typeOfCow.get(0)+", 2 for "+typeOfCow.get(1)+", 3 for "+typeOfCow.get(2)+".");
        int x = s.nextInt();
        if(x==1){
            System.out.println("Your animal is a cow");
            cowType = typeOfCow.get(0);

        }
        else if(x==2){
            System.out.println("Your animal is a bull");
            cowType = typeOfCow.get(1);

        }
        else if(x==3){
            System.out.println("Your animal is a calf");
            cowType = typeOfCow.get(2);

        }
        else{
            System.out.println("Animal is not defined");
            cowType = "Not Defined";

        }
        return cowType;
    }

    public int calculateMilkyCows(){
        int counter =0;
        if(cowType=="Cow"){
            Scanner s = new Scanner(System.in);
            System.out.println("Please define whether the cow is lactating (1 for true, 0 for false)");
            int x = s.nextInt();
            if(x==1){
                System.out.println("Cow is not milky");
            }
            else if(x==0){
                System.out.println("Cow is milky");
                counter++;
            }
        }
        else if(cowType=="Bull"){
            System.out.println("The animal is not milky");
        }
        else if(cowType=="Calf"){
            System.out.println("The animal is not milky");
        }
        System.out.println("Number of milky cows is "+counter);
        return counter;
    }

public int calculateNumberOfReproductiveCows(){
        int counter =0;
        if(cowType=="Cow"){
            Scanner s = new Scanner(System.in);
            System.out.println("Please insert the age of a cow");
            int x = s.nextInt();
            if(x<=15 && x>=1){
                counter++;
            }
            }
        else {
            System.out.println("The animal is not reproductive");
        }
    System.out.println("Number of reproductive cows is "+counter);
        return counter;
}

}
