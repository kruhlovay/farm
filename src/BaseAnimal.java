public class BaseAnimal {
    public BaseAnimal(int id) {
        this.id = id;
    }

    public String type;
public int id;
public String product;
public boolean isDairy;
public boolean isMeat;
public boolean isEgg;

public String housing;


    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public boolean isDairy() {
        return isDairy;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public boolean isEgg() {
        return isEgg;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setDairy(boolean dairy) {
        isDairy = dairy;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    public void setEgg(boolean egg) {
        isEgg = egg;
    }

    public void defineTypeOfProduct(){
        if(isDairy){
            System.out.println("The animal is dairy. " + "Produced product is "+ getProduct());
        }
        else if(isEgg){
            System.out.println("The animal is egg. " + "Produced product is "+ getProduct());
        }
        else if(isMeat){
            System.out.println("The animal is meat. "+ "Produced product is "+ getProduct());
        }
        else {
            System.out.println("Not defined");
        }
    }

    public String defineAnimalHousing(){
        if(isDairy){
            housing = "Barn";
            System.out.println("The housing is "+housing + ".");
                   }
        if(isMeat){
            housing="Pigsty";
            System.out.println("The housing is "+housing + ".");
                   }
        if(isEgg){
            housing="Coop";
            System.out.println("The housing is "+housing + ".");
                   }
        else{
            System.out.println("Not defined.");
            housing = "Unassigned";
        }
        return housing;
    }

}
