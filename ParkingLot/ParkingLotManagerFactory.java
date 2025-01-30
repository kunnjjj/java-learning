public class ParkingLotManagerFactory {
    public static ParkingLotManager getParkingLotManager(VehicleType type) throws Exception {
        switch (type) {
            case TWO_WHEELER:
                return new TwoWheelerParkingLotManager(5); // 5 is the number of parking spaces
            case FOUR_WHEELER:
                return new FourWheelerParkingLotManager(5);
            default:
                throw new RuntimeException("Unknown vehicle type.");
        }
    }
}
