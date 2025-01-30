public class TwoWheelerParkingLot extends ParkingLot<TwoWheelerParkingSpace> {
    public TwoWheelerParkingLot(int spaceCount) throws Exception {
        super(spaceCount, TwoWheelerParkingSpace.class);
    }
}
