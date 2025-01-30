public abstract class AbstractParkingSpace {
    protected boolean occupied;
    protected Vehicle vehicle;

    public AbstractParkingSpace() {
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (occupied) {
            throw new RuntimeException("Parking space is already occupied.");
        }
        this.vehicle = vehicle;
        this.occupied = true;
    }

    public void vacate() {
        this.vehicle = null;
        this.occupied = false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
