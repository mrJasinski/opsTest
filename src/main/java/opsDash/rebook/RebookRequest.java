package opsDash.rebook;

import opsDash.merchant.Merchant;
import opsDash.vehicle.Vehicle;

import java.time.LocalDateTime;

class RebookRequest
{
    private int id;
    private LocalDateTime timestampRequested;
    private String number;
    private String requester;
    private Vehicle vehicle;
    private Merchant bookTo;
    private RebookReason reason;
    private String explanation;
    private RebookStatus status;
    private LocalDateTime timestampResolved;

    RebookRequest(final String requester, final Vehicle vehicle, final opsDash.rebook.RebookReason reason, final String explanation)
    {
        this.timestampRequested = LocalDateTime.now();
        this.number = createRebookRequestNumber(vehicle.getStockId(), this.timestampRequested);
        this.requester = requester;
        this.vehicle = vehicle;
        this.reason = reason;
        this.explanation = explanation;
        this.status = RebookStatus.RUNNING;
    }

    void changeStatus(RebookStatus status)
    {
        this.status = status;

        if (this.status.equals(RebookStatus.DONE) || this.status.equals(RebookStatus.REJECTED))
            this.timestampResolved = LocalDateTime.now();
    }

    private String createRebookRequestNumber(String stockId, LocalDateTime timestamp)
    {
        return stockId
                + timestamp.getYear()
                + timestamp.getMonthValue()
                + timestamp.getDayOfMonth()
                + timestamp.getHour()
                + timestamp.getMinute();
    }

    Vehicle getVehicle()
    {
        return this.vehicle;
    }

    RebookReason getReason()
    {
        return this.reason;
    }

    Merchant getBookTo()
    {
        return this.bookTo;
    }
}
