package designPatterns.BehavioralDesignPattern.ObserverDP;

public class MainClassForAmazonNotify {
    public static void main(String[] args) {
        StockUpdateAmazon upd=new StockUpdateAmazon();
        NotifyViaEmail email1=new NotifyViaEmail("swati@0512");
        NotifyViaMessage ms1=new NotifyViaMessage("swati05");
        NotifyViaEmail email2=new NotifyViaEmail("swatiyadav@0512");
        NotifyViaMessage ms2=new NotifyViaMessage("yadav-swati");
        email1.update();
        email2.update();
        ms1.update();
        ms2.update();
        upd.setData(50);


    }
}
