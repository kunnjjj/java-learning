public class ParkingSpaceFactory {

    public static AbstractParkingSpace getParkingSpace(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerParkingSpace();
            case FOUR_WHEELER:
                return new FourWheelerParkingSpace();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
