package opsDash.rebook;

import opsDash.utils.Country;

import java.util.List;
import java.util.Set;

interface RebookRepository
{
    RebookRequest save(RebookRequest toSave);

    List<RebookRequest> findByStatus(RebookStatus status);
    List<RebookRequest> findByStatusAndCountries(RebookStatus status, Set<Country> countries);
    List<RebookRequest> findByStatusAndStockId(RebookStatus status, String stockId);
    List<RebookRequest> findByStatusAndRequesterMail(RebookStatus status, String mail);
}
