import java.util.ArrayList;
import java.util.Scanner;

public class Chickens extends BaseAnimal{

    public Chickens(int id) {
        super(id);
    }
    ArrayList<String> typeOfChicken = new ArrayList<String>();
    void addTypeOfChicken(){
        typeOfChicken.add("Chick");
        typeOfChicken.add("Hen");
        typeOfChicken.add("Rooster");
    }

    public void isIncubationAvailable(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose the type of chicken: 1 for "+ typeOfChicken.get(0)+", 2 for "+typeOfChicken.get(1)+", 3 for "+typeOfChicken.get(2)+".");
        int x = s.nextInt();
        if(x==1){
            System.out.println("Incubation is not available");
        }
        if(x==2){
            System.out.println("Incubation is available");
        }
        if(x==3){
            System.out.println("Incubation is not available");
        }
    }

    public void defineThePurposeOfAnimal(){
        System.out.println("Press 1 if the chicken is a sitter" );
        System.out.println("Press 2 if the chicken is below 6 months");
        System.out.println("Press 3 if the chicken is used for eggs production");
        System.out.printf("Press 4 if the chicken is used for mating");
        System.out.println("Press 5 if the chicken is ready to be sent to meat production");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if(x==1){
            System.out.println("The purpose of a chicken is incubation");
        }
        else if(x==2){
            System.out.println("The chicken needs to be raised");
        }
        else if(x==3){
            System.out.println("The chicken is used for eggs production");
        }
        else if(x==4){
            System.out.println("The chicken is used for reproduction");
        }
        else if(x==5){
            System.out.println("The chicken is used for meat production");
        }
        else{
            System.out.println("Not defined");
        }

    }


}
