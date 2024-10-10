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


    void assignClaimToAgent(Claim toAssign)
    {
//        by claim country get available agent with skill/task claim with the lowest daily assigned claims number

    }

//    metody procesu od momentu rozpatrzenia przez DM
    void provideFirstProposal()
    {
//        z formularza
//        firstProposalAmount
//        firstProposalJustification
//        reklamacja której to dotyczy z linku?

//        zmiana statusu na WAITING_FOR_FIRST_FEEDBACK
//        powiadomienie handlowca
    }

    void provideFirstFeedback()
    {
//        cztery możliwości
//        YES - jeśli różne od zera wymaga podania podziąłu vouchera decyzja do wysyłki - TO_BE_SENT
//        NO - wymaga podania uzasadnienia i przekazuje sprawę do CE - WAITING_FOR_CE
//        CASH - tylko dla wybranych klientów? akceptacja kwoty i przekazuje sprawę do HoS - CASH_REQUEST
//        MORE_PROOFS - dodatkowy tydzień na dosłanie dowodów - WFAP

//        stosowne zmiany statusow i powiadomienia
    }

    void provideCarExpertFeedback()
    {
//        YES - zgoda z pierwszą propozycją sprawa trafia do handlowca aby poinformował klienta - INFORM_MERCHANT
//        NO - podniesienie np ze względów biznesowych wpisanie kwoty w stosowne pole i sprawa do decyzji HoS - WAITING_FOR_HOS
//        WFMP - dodatkowy tyczień na uzupełnienie dowodów - WFAP

    }

    void provideHOSDecision()
    {
//        kwota
//        ew uzasadnienie
//        info do handlowca - INFORM_MERCHANT
    }


//    reklamacja
//    luźne pomysły

//    automat przypisujący do osoby

//    sloty na cmr kosztorys dokumenty
//    checki na podstawie wybranych powodów - np reklamacja uszkodzeń nadwozia/brakujących kół etc wymaga cmr
//    na poziomie pierwszej decyzji DM
//    wpsiuje się kwotę i uzasadnienie a następnie klik w przycisk "przekaż do sales"
//    sprawa wyskakuje opiekunowi
//    ma pola do wpisania swojej odpowiedzi i yes/no/cash (cash jako opcja np dla wybranych klientów itd)
//    yes - dodatkowe pole na podział vouchera
//    no - sprawa trafia do CE
//    WFMP TODO
//    CE klika yes/no
//    yes - CE wpisuje swoją opinię sprawa wraca do opiekuna do przekazania klientowi i potwierdzenia pola informed? + podział/cash
//    no - CE podaje nową kwotę i wpisuje swoją opinię
//    WFMP TODO
//    zależnie od rynku przy no sprawa idzie do HoS lub to finalna propozycja -> sales przekazuje i potwierdza informed? + podział/cash
//    HoS podaje finalną kwotę i ew uzasadnienie
//    sales  przekazuje i potwierdza informed? + podział/cash
//    gdy sprawa jest do wysłania wraca do dm który potwierdza kwotę podział cash etc i wysyła
//    przy samych voucherach reklamacja trafia na status "closed - waiting for activation" i vouchery mają datę wystawienia (wazność 3msc)
//    na tym statusie można dowolnie manipulować voucherami
//    gdy klient zaakceptuje voucher reklamacja trafia na status "closed fully processed"  i oficjalnie zamknięta

//    proces cashowy
//    gdy handlowiec zawnioskuje o cash sprawa trafia do HoS (wniosek o cash zasadniczo oznacza zgodę na zaproponowaną kwotę)
//    HoS zatwierdza całośc w cash bądź częściowy
//    sprawa wraca do handlowca który informuje klienta
//    gdy całość jest w cashu to tylko potwierdza informed?
//    gdy z voucherem to podaje podział vouchera i potwierdza informed?
//    sprawa trafia do DM i zostaje wysłana
//    klient wprowadza dane bankowe co zostaje uznane za akceptację kwoty podziału itd
//    voucher zostaje wystawiony przy przelewie
//    sprawa zostaje zamknięta

}
