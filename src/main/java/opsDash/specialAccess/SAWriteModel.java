package opsDash.specialAccess;

import java.time.LocalDateTime;

class SAWriteModel
{
//    otrzymywany z kontrolera
    private String stockId;
    private String requesterMail;
    private LocalDateTime timestamp;
    private SAReason reason;
    private String justification;

    String getStockId()
    {
        return this.stockId;
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
