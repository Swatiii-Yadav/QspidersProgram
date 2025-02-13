package oopsPracticeQuestions.february13;

//base interface Crop
public interface Crop {
    void growth();

    void nutrients();

    void irrigate();

    void status();

}


//Derived class wheat
class Wheat implements Crop {
    String cropName;
    int growthStage;
    int health;
    String[] stages={"Germination", "Tillering", "Heading", "Ripening"};
    Wheat(){
        this.cropName="Wheat";
        this.growthStage=0;
        this.health=75;
    }

    @Override
    public void growth() {
        if (growthStage < stages.length - 1) {
            growthStage++;
            System.out.println(cropName+" is now at " + stages[growthStage] + " stage.");
        } else {
            System.out.println(cropName+" is ready for harvest!");
        }
    }

    @Override
    public void nutrients() {
        System.out.println("Applying Nitrogen and Phosphorus to Wheat.");
        health += 11;
    }

    @Override
    public void irrigate() {
        System.out.println("Irrigating "+cropName+" moderately.");
        health += 5;
    }

    @Override
    public void status() {
        System.out.println(cropName+" Growth stage:- "+growthStage+" health "+health+"%");
    }
}



//derived class Rice
class Rice implements Crop {
    String cropName;
    int growthStage;
    int health;
    String[] stages = {"Seedling", "Tillering", "Panicle Initiation", "Grain Filling"};
    Rice(){
        this.cropName="Rice";
        this.growthStage=0;
        this.health=100;
    }
    @Override
    public void growth() {
        if (growthStage < stages.length - 1) {
            growthStage++;
            System.out.println(cropName+" is now at " + stages[growthStage] + " stage.");
        } else {
            System.out.println(cropName+" is ready for harvest!");
        }
    }

    @Override
    public void nutrients() {
        System.out.println("Applying Nitrogen and Potassium to Rice. ."+cropName);
        health += 10;
    }

    @Override
    public void irrigate() {
        System.out.println("Flooding the Rice field for irrigation");
        health += 12;
    }

    @Override
    public void status() {
        System.out.println(cropName+" Growth stage:- "+growthStage+" health "+health+"%");
    }
}

//derived class corn

class Corn implements Crop {
    String cropName;
    int growthStage;
    int health;
    String[] stages =  {"Germination", "Vegetative", "Reproductive", "Maturity"};

    @Override
    public void growth() {
        if (growthStage < stages.length - 1) {
            growthStage++;
            System.out.println(cropName+" is now at " + stages[growthStage] + " stage.");
        } else {
            System.out.println(cropName+" is ready for harvest!");
        }
    }

    @Override
    public void nutrients() {
        System.out.println("Applying Nitrogen during Corn's vegetative stage ."+cropName);
        health += 12;
    }

    @Override
    public void irrigate() {
        System.out.println("Irrigating Corn during critical pollination stage moderately.");
        health += 7;
    }

    @Override
    public void status() {
        System.out.println(cropName+" Growth stage:- "+growthStage+" health "+health+"%");
    }
}