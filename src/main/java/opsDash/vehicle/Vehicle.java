package opsDash.vehicle;

import opsDash.merchant.Merchant;
import opsDash.utils.Country;

import java.time.LocalDate;

public class Vehicle
{
    private int id;
    private String stockId;
    private VehicleStatus status;
    private String manufacturer;
    private Country docsResponsibleCountry;
    private LocalDate dateBooked;
    private int daysToBePaid;
    private LocalDate datePaid;
    private boolean isRem;
    private double priceBought;
    private double priceSold;
    private LocalDate dateDeliveredDocs;
    private LocalDate dateDeliveredVehicle;


    public void bookToMerchant(Merchant merchant)
    {
        this.status = VehicleStatus.ASSIGNED_TO_MERCHANT;
        this.dateBooked = LocalDate.now();
    }

    public void changeStatus(final VehicleStatus status)
    {
        this.status = status;

        if (this.status.equals(VehicleStatus.PURCHASED))
        {
//            back to purchased means car is removed from merchant account so all connected data should be cleared
            this.dateBooked = null;
        }
    }

    public String getStockId()
    {
        return this.stockId;
    }

    public Country getDocsResponsibleCountry()
    {
        return this.docsResponsibleCountry;
    }

    public LocalDate getDatePaid()
    {
        return this.datePaid;
    }

    public boolean isRem()
    {
        return this.isRem;
    }

    double getPriceBought()
    {
        return this.priceBought;
    }

    public double getPriceSold()
    {
        return this.priceSold;
    }

    public LocalDate getDateDeliveredDocs()
    {
        return this.dateDeliveredDocs;
    }

    public LocalDate getDateDeliveredVehicle()
    {
        return this.dateDeliveredVehicle;
    }

    public boolean isPickedUp()
    {
//        if delivered date is not null it means vehicle is picked up
        return this.dateDeliveredVehicle != null;
    }
}
