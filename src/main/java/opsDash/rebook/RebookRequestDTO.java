package opsDash.rebook;

import opsDash.vehicle.Vehicle;

class RebookRequestDTO
{
    private String requester;
    private Vehicle vehicle;
    private RebookReason reason;
    private String explanation;

    String getRequester()
    {
        return this.requester;
    }

    Vehicle getVehicle()
    {
        return this.vehicle;
    }

    RebookReason getReason()
    {
        return this.reason;
    }

    String getExplanation()
    {
        return this.explanation;
    }
}
