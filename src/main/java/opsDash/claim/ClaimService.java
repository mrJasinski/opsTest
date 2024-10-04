package opsDash.claim;

import org.springframework.stereotype.Service;

@Service
class ClaimService
{
    private final ClaimRepository claimRepo;

    ClaimService(ClaimRepository claimRepo)
    {
        this.claimRepo = claimRepo;
    }

//    przypisywanie reklamacji

//    wyciągnąć z bazy nieprzypisane reklamaacaje podług kraju/krajów
//    chyba że nowa reklamacja od razu zostaje przypisana?
//    i przypisać do agenta z puli zgodnie z zasadą aby każdy dostawał tyle samo
//    uwzględnia się tylko osoby obecne tego dnia w pracy

}
