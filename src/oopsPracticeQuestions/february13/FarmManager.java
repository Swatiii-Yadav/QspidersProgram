package oopsPracticeQuestions.february13;

public class FarmManager {
    //manage growth
    static void manageGrowth(Crop c){
        if (c!=null){
            if (c instanceof Wheat){
                Wheat wh=(Wheat) c;
                wh.growth();
            }
            else if(c instanceof  Rice){
                Rice rc=new Rice();
                rc.growth();
            }
           else if (c instanceof Corn){
               Corn cr=new Corn();
               cr.growth();
            }
           else if(c instanceof  Crop){
               c.growth();
            }
        }
    }

    //manage Nutrients
    static void manageNutrients(Crop c){
        if (c!=null){
            if (c instanceof Wheat){
                Wheat wh=(Wheat) c;
                wh.nutrients();
            }
            else if(c instanceof  Rice){
                Rice rc=new Rice();
                rc.nutrients();
            }
            else if (c instanceof Corn){
                Corn cr=new Corn();
                cr.nutrients();
            }
            else if(c instanceof  Crop){
                c.nutrients();
            }
        }
    }

    //manage irrigation
    static void manageIrrigation(Crop c){
        if (c!=null){
            if (c instanceof Wheat){
                Wheat wh=(Wheat) c;
                wh.irrigate();
            }
            else if(c instanceof  Rice){
                Rice rc=new Rice();
                rc.irrigate();
            }
            else if (c instanceof Corn){
                Corn cr=new Corn();
                cr.irrigate();
            }
            else if(c instanceof  Crop){
                c.irrigate();
            }
        }
    }
    //manage status
    static void manageStatus(Crop c){
        if (c!=null){
            if (c instanceof Wheat){
                Wheat wh=(Wheat) c;
                wh.status();
            }
            else if(c instanceof  Rice){
                Rice rc=new Rice();
                rc.status();
            }
            else if (c instanceof Corn){
                Corn cr=new Corn();
                cr.status();
            }
            else if(c instanceof  Crop){
                c.status();
            }
        }
    }
}
