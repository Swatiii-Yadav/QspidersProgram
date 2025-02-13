package oopsPracticeQuestions.february13;

public class MainClassForCorp {
    public static void main(String[] args) {
        //wheat
        System.out.println(" Wheat Growth status");
        System.out.println("------------------------------------");
        FarmManager.manageGrowth(new Wheat());
        FarmManager.manageStatus(new Wheat());
        FarmManager.manageIrrigation(new Wheat());
        FarmManager.manageNutrients(new Wheat());

        System.out.println("------------------------------------");
        System.out.println(" Rice Growth status");
        System.out.println("------------------------------------");
        FarmManager.manageGrowth(new Rice());
        FarmManager.manageStatus(new Rice());
        FarmManager.manageIrrigation(new Rice());
        FarmManager.manageNutrients(new Rice());


        System.out.println("------------------------------------");
        System.out.println(" Corn growth status");
        System.out.println("------------------------------------");
        FarmManager.manageGrowth(new Corn());
        FarmManager.manageStatus(new Corn());
        FarmManager.manageIrrigation(new Corn());
        FarmManager.manageNutrients(new Corn());
    }
}
