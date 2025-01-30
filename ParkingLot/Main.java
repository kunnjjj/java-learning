import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create two-wheeler and four-wheeler vehicles
        Vehicle twoWheeler = new Vehicle("AB123", VehicleType.TWO_WHEELER);
        Vehicle fourWheeler = new Vehicle("XY456", VehicleType.FOUR_WHEELER);

        // Create parking spaces for two-wheelers and four-wheelers
        List<TwoWheelerParkingSpace> twoWheelerSpaces = new ArrayList<>();
        twoWheelerSpaces.add(new TwoWheelerParkingSpace());
        
        List<FourWheelerParkingSpace> fourWheelerSpaces = new ArrayList<>();
        fourWheelerSpaces.add(new FourWheelerParkingSpace());

        // Get the appropriate manager using the factory
        ParkingLotManager<TwoWheelerParkingSpace> twoWheelerManager = (ParkingLotManager<TwoWheelerParkingSpace>) ParkingLotManagerFactory
                .getParkingLotManager(VehicleType.TWO_WHEELER, twoWheelerSpaces);

        Ticket ticket1 = twoWheelerManager.parkVehicle(twoWheeler);
        System.out.println("Ticket issued for two-wheeler: " + ticket1.getVehicle().getLicensePlate());

        ParkingLotManager<FourWheelerParkingSpace> fourWheelerManager = (ParkingLotManager<FourWheelerParkingSpace>) ParkingLotManagerFactory
                .getParkingLotManager(VehicleType.FOUR_WHEELER, fourWheelerSpaces);

        Ticket ticket2 = fourWheelerManager.parkVehicle(fourWheeler);
        System.out.println("Ticket issued for four-wheeler: " + ticket2.getVehicle().getLicensePlate());

        // Vacate parking space
        twoWheelerManager.vacateParkingSpace(twoWheeler);
        System.out.println("Two-wheeler parking space vacated.");
    }
}
