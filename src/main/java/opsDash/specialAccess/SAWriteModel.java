package opsDash.specialAccess;

import java.time.LocalDateTime;

class SAWriteModel
{
//    otrzymywany z kontrolera
    private String vehicleStockId;
    private String requesterMail;
    private LocalDateTime timestamp;
    private SAReason reason;
    private String justification;

    String getVehicleStockId()
    {
        return this.vehicleStockId;
    }

    String getRequesterMail()
    {
        return this.requesterMail;
    }

    LocalDateTime getTimestamp()
    {
        return this.timestamp;
    }

    SAReason getReason()
    {
        return this.reason;
    }

    String getJustification()
    {
        return this.justification;
    }
}
