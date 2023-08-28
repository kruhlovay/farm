public class Main {
    public static void main(String[] args) {
        Chickens chicken1 = new Chickens(1);
    chicken1.setDairy(false);
    chicken1.setEgg(true);
    chicken1.setMeat(false);
    chicken1.addTypeOfChicken();
    chicken1.defineThePurposeOfAnimal();
    chicken1.isEgg();
    chicken1.defineAnimalHousing();
    chicken1.addTypeOfChicken();
    chicken1.isIncubationAvailable();

    Cows cow1 = new Cows(2);
    cow1.setAge(5);
    cow1.setDairy(true);
    cow1.setEgg(false);
    cow1.setMeat(false);
    cow1.addTypeOfCow();
    cow1.choseTypeOfAnimal();
    cow1.calculateMilkyCows();
    cow1.calculateNumberOfReproductiveCows();

    Cows cow2 = new Cows(3);
    cow2.setAge(12);
    cow2.setDairy(true);
    cow2.setEgg(false);
    cow2.setMeat(false);
    cow2.addTypeOfCow();

    Horses horse1 = new Horses(4);
    horse1.setAge(4);
    horse1.setSex("female");
    horse1.setBreed("Selle Francais");
    horse1.setHeight(170);
    horse1.isForSport();
    horse1.isForFarming();

        Horses horse2 = new Horses(5);
        horse2.setAge(12);
        horse2.setSex("male");
        horse2.setBreed("Haflingers");
        horse2.setHeight(220);
        horse2.isForSport();
        horse2.isForFarming();

        Horses horse3 = new Horses(6);
        horse3.setAge(1);
        horse3.setSex("male");
        horse3.setBreed("Shire");
        horse3.setHeight(122);
        horse3.isForSport();
        horse3.isForFarming();

        Pigs pig1 = new Pigs(7);
        pig1.addTypeOfPig();
        pig1.addGroupOfPig();
        pig1.addTypeOfHousing();
        pig1.setAge(2);
        pig1.setDairy(false);
        pig1.setMeat(true);
        pig1.setEgg(false);
        pig1.setWeight(25);
        pig1.setSterilizationNeeded(false);
        pig1.isSterilizationNeeded();
        pig1.isVetRequired();
        pig1.chooseTypeOfPig();
        pig1.toMeat();

        Sheep sheep1 = new Sheep(8);
        sheep1.setAge(3);
        sheep1.setSex("male");
        sheep1.setWeight(14);
        sheep1.setDairy(false);
        sheep1.setEgg(false);
        sheep1.setMeat(false);
        sheep1.setForWool(true);
        sheep1.setForBreeding(false);
        sheep1.describeSheep();

        Sheep sheep2 = new Sheep(9);
        sheep2.setAge(6);
        sheep2.setSex("female");
        sheep2.setWeight(20);
        sheep2.setDairy(false);
        sheep2.setEgg(false);
        sheep2.setMeat(false);
        sheep2.setForWool(false);
        sheep2.setForBreeding(true);
        sheep2.describeSheep();

        Pigs pig2 = new Pigs(10);
        pig2.addTypeOfPig();
        pig2.addGroupOfPig();
        pig2.addTypeOfHousing();
        pig2.setAge(10);
        pig2.setDairy(false);
        pig2.setMeat(true);
        pig2.setEgg(false);
        pig2.setWeight(18);
        pig2.setSterilizationNeeded(false);
        pig2.isSterilizationNeeded();
        pig2.isVetRequired();
        pig2.chooseTypeOfPig();
        pig2.toMeat();



    }
}