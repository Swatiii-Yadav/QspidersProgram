package JavaProgram.oops.polymorphism;

 class IRCTC {
    void search(String src,String destination){
        System.out.println("Route details");
    }
    void search(int trainNumber){
        System.out.println("Train details");
    }
    void search(String pnr){
        System.out.println("Ticket details");
    }

}
  public class MainClassForIRCTC {
      public static void main(String[] args) {
          IRCTC obj = new IRCTC();
          obj.search(12345);
          obj.search("bhopal","bengaluru");
          obj.search("Bpl12345");

      }
}

