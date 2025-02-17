package oopsPracticeQuestions.february17;

public class HotelBooking {
   static  void getRate(Rooms room){
       if (room!=null){
           if (room instanceof  StandardRoom){
               StandardRoom st=(StandardRoom) room;
               st.calcRate(4);
           }
           if (room instanceof  DeluxeRoom){
               DeluxeRoom dr=(DeluxeRoom) room;
               dr.calcRate(4);
           }
       }
   }

    static  void display(Rooms room){
        if (room!=null){
            if (room instanceof  StandardRoom){
                StandardRoom st=(StandardRoom) room;
                st.displayDetails();
            }
            if (room instanceof  DeluxeRoom){
                DeluxeRoom dr=(DeluxeRoom) room;
                dr.displayDetails();
            }
        }
    }
}
