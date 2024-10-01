package opsDash.vehicle;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
class VehicleService
{
    private final VehicleRepository vehicleRepo;

    public VehicleService(VehicleRepository vehicleRepo)
    {
        this.vehicleRepo = vehicleRepo;
    }

    Vehicle getVehicleByStockId(String stockId)
    {
        return this.vehicleRepo.findByStockId(stockId)
                .orElseThrow(() -> new NoSuchElementException("Vehicle with given stock id not found!"));
    }

    List<Vehicle> getVehiclesByMerchantId(int merchantId)
    {
        return this.vehicleRepo.findByMerchantId(merchantId);
    }

    void incrementDaysToBePaid()
    {
        this.vehicleRepo.incrementDaysToBePaid();
    }
}




