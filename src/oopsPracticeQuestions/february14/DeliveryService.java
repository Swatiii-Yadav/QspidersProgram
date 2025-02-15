package oopsPracticeQuestions.february14;

public interface DeliveryService {
    double calcTime();
    double calcFees();
    void displayDetails();
}
class BikeDeliveryDetails implements DeliveryService{
    private final BikeDelivery bikeDelivery;

    BikeDeliveryDetails(){
        this.bikeDelivery=new BikeDelivery();
    }
    @Override
    public double calcTime() {
        return bikeDelivery.calculateFees();
    }

    @Override
    public double calcFees() {
    return bikeDelivery.calculateTime();
    }

    @Override
    public void displayDetails() {
        System.out.println("Details:");
        bikeDelivery.getDeliveryDetails();
    }
}

class DroneDeliveryDetails implements DeliveryService{
    private final DroneDelivery droneDelivery;

    DroneDeliveryDetails(){
        this.droneDelivery=new DroneDelivery();
    }
    @Override
    public double calcTime() {
        return droneDelivery.calculateFees();
    }

    @Override
    public double calcFees() {
        return droneDelivery.calculateTime();
    }

    @Override
    public void displayDetails() {
        System.out.println("Details:");
        droneDelivery.getDeliveryDetails();
    }
}
