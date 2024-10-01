package opsDash.rebook;

import opsDash.utils.Country;
import opsDash.vehicle.VehicleStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
class RebookService
{
    private final opsDash.rebook.RebookRepository rebookRepo;

    RebookService(final opsDash.rebook.RebookRepository rebookRepo)
    {
        this.rebookRepo = rebookRepo;
    }

    void createRebookRequest(RebookRequestDTO dto)
    {
        this.rebookRepo.save(new RebookRequest(
                dto.getRequester()
                , dto.getVehicle()
                , dto.getReason()
                , dto.getExplanation()
        ));
    }

    List<RebookRequest> getRunningRequestsByStockId(String stockId)
    {
        return this.rebookRepo.findByStatusAndStockId(RebookStatus.RUNNING, stockId);
    }

    List<RebookRequest> getAllRunningRequests()
    {
        return this.rebookRepo.findByStatus(RebookStatus.RUNNING);
    }

    List<RebookRequest> getRunningRequestsByCountries(Set<Country> countries)
    {
        return this.rebookRepo.findByStatusAndCountries(RebookStatus.RUNNING, countries);
    }

    List<RebookRequest> getRunningRequestsByRequesterMail(String mail)
    {
        return this.rebookRepo.findByStatusAndRequesterMail(RebookStatus.RUNNING, mail);
    }

    void approveRequest(RebookRequest request)
    {
        request.changeStatus(RebookStatus.DONE);

        if (request.getReason().equals(RebookReason.ASSIGNED_WITHOUT_PO))
            request.getVehicle().changeStatus(VehicleStatus.PURCHASED);

        if (request.getReason().equals(RebookReason.BOOK_TO_ANOTHER_MERCHANT))
            request.getVehicle().bookToMerchant(request.getBookTo());

    }

    void rejectRequest(RebookRequest request)
    {
        request.changeStatus(RebookStatus.REJECTED);
    }




}
