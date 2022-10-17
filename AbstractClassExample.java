abstract class Automobile {
    private String vehicleNo;
    public abstract void start();
    public abstract void stop();
    public String getVehicleNo() {
        return vehicleNo;
    }
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
}
class Car extends Automobile {
    public void start() {
        System.out.println("Car " + getVehicleNo() + " has started");
    }
    public void stop() {
        System.out.println("Car " + getVehicleNo() + " has stopped");
    }
}
class Bike extends Automobile {
    public void start() {
        System.out.println("Bike " + getVehicleNo() + " has started");
    }
    public void stop() {
        System.out.println("Bike " + getVehicleNo() + " has stopped");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Automobile skyline = new Car();
        skyline.setVehicleNo("WB-4546-34");
        Automobile ninja = new Bike();
//        Automobile automobile = new Automobile();
        ninja.setVehicleNo("KA-8675-72");
        startAutomobile(skyline);
        startAutomobile(ninja);
        stopAutomobile(skyline);
        stopAutomobile(ninja);
    }

    public static void startAutomobile(Automobile automobile) {
        automobile.start();
    }
    public static void stopAutomobile(Automobile automobile) {
        automobile.stop();
    }

}