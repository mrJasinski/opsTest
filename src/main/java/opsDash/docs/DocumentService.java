package opsDash.docs;

import opsDash.utils.Country;
import opsDash.vehicle.Vehicle;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DocumentService
{
    //    obliczanie opóźnienie dokumentów

    int getDocsDelayCompensation(Vehicle vehicle)
    {
//        kraj obśługujący dokumnenty
//        cena auta w euro
//        data dostarczenia
//        data startowa (opłacenia/zakończenia procedur eksportowych/przesłania cmr)
//        isRem

        var docsStartDate = vehicle.getDatePaid();

        if (vehicle.getDocsResponsibleCountry() == Country.SE)
            docsStartDate = getCmrSentDateByStockId(vehicle.getStockId());

        var delayStartDate = calculateDelayStartDate(docsStartDate, vehicle.getDocsResponsibleCountry(), vehicle.isRem());
        var docsDeliveryDate = vehicle.getDateDeliveredDocs();

        if (delayStartDate.isBefore(docsDeliveryDate))
            return countDelayCompensation(delayStartDate, docsDeliveryDate, vehicle.getPriceSold());

        return 0;
    }

    private LocalDate getCmrSentDateByStockId(String stockId)
    {
//        TODO placeholder - data wyciągana z bazy
        return LocalDate.now();
    }

    int countDelayCompensation(LocalDate delayStartDate, LocalDate deliveryDate, double carPrice)
    {
        var delayTime = countDelayInMonths(delayStartDate, deliveryDate);

        var compensationPerMonth = setMonthCompByCarPrice(carPrice);

        var compensation = roundToFive(delayTime * compensationPerMonth);

        if (compensation < 25)
            compensation = 0;

        return compensation;
    }

    int roundToFive(float toRound)
    {
        return 5*(Math.round(toRound/5));
    }

    float countDelayInMonths(LocalDate delayStartDate, LocalDate deliveryDate)
    {
        var delayDays = calculateDelayWorkingDays(delayStartDate, deliveryDate);

//        standard month has 21 weekdays
        return (float)delayDays / 21;
    }

    int calculateDelayWorkingDays(LocalDate startDate, LocalDate docsDeliveredDate)
    {
        var days = 0;

        var actualDate = startDate;

//        counting weekdays between docs delivery date and date when delivery delay starts
//        bank holidays not taken into account due to its minor influence

        while(actualDate.isBefore(docsDeliveredDate) || actualDate.isEqual(docsDeliveredDate))
        {
            if (!((actualDate.getDayOfWeek()).equals(DayOfWeek.SATURDAY)) && !((actualDate.getDayOfWeek()).equals(DayOfWeek.SUNDAY)))
                days++;

            actualDate = actualDate.plusDays(1);
        }

        return days;
    }

    public LocalDate calculateDelayStartDate(LocalDate docsStartDate, Country country, Boolean isRem)
    {
//        for most countries docs should be sent within 1 week from vehicle paid date
//        for ES it's five weeks amd for IT and NL two - extra deregistration procedures
        var weeksToAdd = 1;

        switch (country)
        {
            case ES -> weeksToAdd = 5;
            case IT, NL -> weeksToAdd = 2;
        }

        var startDate = docsStartDate.plusWeeks(weeksToAdd);

//        for rem cars additional month is added as third part company is involved

        if (isRem)
            startDate = startDate.plusMonths(1);

        return startDate;
    }

    int setMonthCompByCarPrice(double carPrice)
    {
        var comp = 150;

        if (carPrice < 1000)
            comp = 25;
        else if (carPrice >= 1000 && carPrice < 2000)
            comp = 50;
        else if (carPrice >= 2000 && carPrice < 4000)
            comp = 75;
        else if (carPrice >= 4000 && carPrice < 10000)
            comp = 100;

        return comp;
    }
}
