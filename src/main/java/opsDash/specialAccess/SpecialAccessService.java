package opsDash.specialAccess;

import opsDash.vehicle.Vehicle;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
class SpecialAccessService
{
    private final SpecialAccessRepository saRepo;

    SpecialAccessService(final SpecialAccessRepository saRepo)
    {
        this.saRepo = saRepo;
    }

    //    zgłaszanie SA
    void requestSpecialAccess(SAWriteModel request)
    {
        var reason = request.getReason();

//

        var number = getHighestSARequestNumber();
        var vehicle = this.vehicleService.getVehicleByStockId(request.getVehicleStockId());
        var requester = this.employeeService.getEmployeeByEmial(request.getRequesterMail());
        var status = setStatusByReason(request.getReason());

        this.saRepo.save(new SARequest(
                number
                , vehicle
                , requester
                , request.getTimestamp()
                , reason
                , request.getJustification()
                , status
        ));
    }

    int getHighestSARequestNumber()
    {
        return this.saRepo.findHighestSARequestNumber()
                .orElse(10 ^ 5);
    }

    SAStatus setStatusByReason(SAReason reason)
    {
//        GRANTED_W/O_ADD_HUMAN_CHECK
//        missing or delay docs - check if not delivered // count delay
//        car delivery delay
//        late PU date actualization
//        first claim - np klient nie dokońca był świadomy zasad

//        WAITING_FOR_LOCAL_DEC
//        mileage manipulation
//        missing items
//        NRC
//        accident vehicle
//        wrong desc
//        body damage
//        hail damage - raczej dotyczy np przypadków gradobicia nad LC
//        transport damage - dla nieodebranych
//        errors/admin problems
//        engine/transmission damage
//        interior damage
//        underbody damage

//        WAITING_FOR_HOO
//        purchase problems
//        stolen car (zarówno zajęcie jak i faktyczna kradzież?)
//        registration problems

//        WAITING_FOR_HOS
//        sales gw - zakładam że to bardzije kwestie mechaniczne które powinny być zgłoszone w 7 dni



}


//    raporty
//  ilość wg powodu w danym miesiącu



    void SpecialAccessMethod(Vehicle vehicle)
    {
//        request fields
//        number
//        reason
//        explanation
//        car
//        requester
//        timestamp
//        status

//        reasons
//        mileage manipulation
//        missing docs
//        missing items
//        docs delay
//        NRC
//        accident vehicle
//        stolen car (zarówno zajęcie jak i faktyczna kradzież?)
//        wrong desc
//        errors/admin problems
//        first claim - np klient nie dokońca był świadomy zasad
//        body damage
//        engine/transmission damage
//        interior damage
//        underbody damage
//        registration problems
//        purchase problems
//        late PU date actualization
//        sales gw - zakładam że to bardzije kwestie mechaniczne które powinny być zgłoszone w 7 dni
//        transport damage - dla nieodebranych
//        car delivery delay
//        hail damage - raczej dotyczy np przypadków gradobicia nad LC

        //        podstawowe checki

        if (vehicle.isPickedUp())
        {
            if (vehicle.getDateDeliveredVehicle().plusYears(2).isBefore(LocalDate.now()))
            {
//                reject ze względu na przedawnienie
//                zmiana statys requestu na REJECTED - OVERDUE (np)
//                return "Case overdue 2 years!";
            }

            if ((vehicle.getDateDeliveredVehicle().plusDays(90)).isBefore(LocalDate.now()))
            {

            }
//        jeśli odebrany i minęło mniej (od daty odbioru) niż 90 dni lub więcej niż 2 lata reject
//        mileage manipulation

//          jeśli odebrany i minęło mniej (od daty odbioru) niż 7 dni reject
//        body damage
//        engine/transmission damage
//        interior damage
//        underbody damage
//        first claim
//        late PU date actualization
//        sales gw


//          jeśli odebrany i minęło mniej (od daty odbioru) niż 90 dni reject
//        missing/delayed docs
//        missing items
//        accident vehicle
//        stolen car
//        wrong desc
//        errors/admin problems
//        registration problems
//        car delivery delay
        }


//        tylko auta nieodebrane
//        NRC -
//        purchase problems
//        transport damage
//        hail damage

//        reasons w/o add human check
        //              missing/delayed docs - if no delivery date recorded in system + as below
        //        late PU date confirmation - sprawdzenie z logiem czy data odbioru jest wcześniejsza niż jej aktualizacja w systemie

//        reasons with dm check

//        hos check
        //              sales gw (termina na reklamację minął ale HoS chce pójść klientowi na rękę z powodów biznesowych)


//        reasons with hq check


//        w panelu auta jest przycisk requestSA dostępny dla opsika
//        dane auta zaciąga z auta
//        należy wybrać powód z listy
//              powody:
//              mileage manipulation

//              NRC
//              late PU date confirmation

//
//        i dać wyjaśnienie




//        na podstawie wybranego powodu
//        1 proces jest automatyczny
//        2 przechodzi prosto do hq
//        3 przechodzi przez dm/tl i do hq


//        odrzucenie w pkt  i 2 zwraca reklamację do opsika który informuje klienta o odrzuceniu
//        pkt nr 3 do dm który weryfikuje

    }
}
