package opsDash.specialAccess;

import opsDash.vehicle.Vehicle;
import opsDash.employee.Employee;

import java.time.LocalDateTime;

public class SARequest
{
    private int id;
    private int number; // publiczny numer zgłoszenia - pierwszy jest 100 000 a nastepnie numer kolejny z bazy
    private Vehicle vehicle;
    private Employee requester;   //placeholder - użytkownik
    private LocalDateTime timestampRequested;
    private SAReason reason;  // placeholder - zapewne enum? ew skoro podobne powody są do np FR to encje?
    private String justificationRequested;
    private LocalDateTime timestampGranted;
    private boolean acceptedDM;
    private String justificationDM;
    private boolean acceptedHQ;
    private String justificationHQ;
    private SAStatus status;

    SARequest(
            final int number
            , final Vehicle vehicle
            , final Employee requester
            , final LocalDateTime timestampRequested
            , final SAReason reason
            , final String justificationRequested
            , final SAStatus status)
    {
        this.number = number;
        this.vehicle = vehicle;
        this.requester = requester;
        this.timestampRequested = timestampRequested;
        this.reason = reason;
        this.justificationRequested = justificationRequested;
        this.status = status;
    }


}
