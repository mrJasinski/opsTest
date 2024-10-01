package opsDash.vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository
{

    List<Vehicle> findByMerchantId(int merchantId);

//    na poziomie sql w autach które nie mają daty opłacenia oraz aktywnych procesów rebook codziennie należy dodać dzień do lciznik daysToBePaid określającego czas płatności
    void incrementDaysToBePaid();

    Optional<Vehicle> findByStockId(String stockId);
}
