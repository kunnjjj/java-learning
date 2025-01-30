import java.util.ArrayList;
import java.util.List;

public abstract class ParkingLot<T extends AbstractParkingSpace> {
    protected List<T> spaces;

    public ParkingLot(int spaceCount, Class<T> spaceClass) {
        spaces = new ArrayList<>();
        try {
            for (int i = 0; i < spaceCount; i++) {
                spaces.add(spaceClass.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle exception
        }
    }

    public T findAvailableSpace() {
        for (T space : spaces) {
            if (!space.isOccupied()) {
                return space;
            }
        }
        return null; // No available space
    }
}
