package opsDash.specialAccess;

import opsDash.vehicle.Vehicle;

import java.time.LocalDateTime;

public class SARequest
{
    private int id;
    private String number; // publiczny numer zgłoszenia - bardziej adekwatna nazwa
    private Vehicle vehicle;
    private String requester;   //placeholder - użytkownik
    private LocalDateTime timestampRequested;
    private String reason;  // placeholder - zapewne enum? ew skoro podobne powody są do np FR to encje?
    private String justificationRequested;
    private LocalDateTime timestampGranted;
    private boolean acceptedDM;
    private String justificationDM;
    private boolean acceptedHQ;
    private String justificationHQ;
    private String status;




}
