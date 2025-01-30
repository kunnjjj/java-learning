public class FourWheelerParkingLot extends ParkingLot<FourWheelerParkingSpace> {
    public FourWheelerParkingLot(int spaceCount) throws Exception {
        super(spaceCount, FourWheelerParkingSpace.class);
    }
}
