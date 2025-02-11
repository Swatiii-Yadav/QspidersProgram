package JavaProgram.oops.instanceOf;

public class Swiggy1 {
    static void AddItem(Food f){
        if (f!=null){
            if (f instanceof Halwa){
                Halwa h=(Halwa) f;
                h.eatHalwa();
            }
          else if (f instanceof PavBhaji){
                PavBhaji pb=(PavBhaji) f;
                pb.eatPAvBhaji();
            }
            else if (f instanceof Paratha){
                Paratha p=(Paratha) f;
                p.eatParatha();
            }
        }
    }
}
