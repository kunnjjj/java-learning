import java.time.LocalDateTime;
import java.util.UUID;

public class ParkingTicket {
    private String ticketId;
    private Vehicle vehicle;
    private LocalDateTime entryTime;

    public ParkingTicket(Vehicle vehicle) {
        this.ticketId = UUID.randomUUID().toString(); // Generate a unique ticket ID
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now(); // Entry time captured when ticket is created
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
