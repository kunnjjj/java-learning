import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {
    private TwoWheelerParkingLotManager twoWheelerManager;
    private FourWheelerParkingLotManager fourWheelerManager;

    public ParkingLotManager(int twoWheelerCount, int fourWheelerCount) {
        // Create lists for two-wheeler and four-wheeler spaces
        List<TwoWheelerParkingSpace> twoWheelerSpaces = new ArrayList<>();
        for (int i = 0; i < twoWheelerCount; i++) {
            twoWheelerSpaces.add(new TwoWheelerParkingSpace());
        }

        List<FourWheelerParkingSpace> fourWheelerSpaces = new ArrayList<>();
        for (int i = 0; i < fourWheelerCount; i++) {
            fourWheelerSpaces.add(new FourWheelerParkingSpace());
        }

        // Initialize respective parking lot managers
        this.twoWheelerManager = new TwoWheelerParkingLotManager(twoWheelerSpaces);
        this.fourWheelerManager = new FourWheelerParkingLotManager(fourWheelerSpaces);
    }

    // Helper function to get the appropriate parking lot manager based on vehicle
    // type
    private ParkingLotManager getVehicleManager(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case TWO_WHEELER:
                return twoWheelerManager;
            case FOUR_WHEELER:
                return fourWheelerManager;
            default:
                throw new RuntimeException("Unsupported vehicle type");
        }
    }

    // Park a vehicle based on its type
    public Ticket parkVehicle(Vehicle vehicle) {
        ParkingLotManager manager = getVehicleManager(vehicle);
        return manager.parkVehicle(vehicle);
    }

    // Vacate the parking space of a vehicle
    public void vacateParkingSpace(Vehicle vehicle) {
        ParkingLotManager manager = getVehicleManager(vehicle);
        manager.vacateParkingSpace(vehicle);
    }
}
