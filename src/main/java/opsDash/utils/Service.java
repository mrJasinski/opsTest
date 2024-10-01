package opsDash.utils;

public class Service
{


//    reklamacja
//    luźne pomysły

//    automat przypisujący do osoby

//    sloty na cmr kosztorys dokumenty
//    checki na podstawie wybranych powodów - np reklamacja uszkodzeń nadwozia/brakujących kół etc wymaga cmr
//    na poziomie pierwszej decyzji DM
//    wpsiuje się kwotę i uzasadnienie a następnie klik w przycisk "przekaż do sales"

    void makeFirstProposal()
    {
//        set claim actual amount to 1st proposal


//        notifySalesRep();
    }
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



//    incoming post
//    formularz przyjęcia
//    nadawca - external/zero/internal
//    stockId/pojazd
//    kraj dokumentów
//    reg doc 1, reg doc2 (checkbox jednoczęściowy), 2nd key, sb, ti, invoices, CoC, translation, excise, ośw o sprowadzeniu, insurance, other, navi medium (cd/sd), reg plates(0 - 3)
//    lokalizacja
//    formularz wypełnia pierwsza osoba przyjmująca docsy
//    nastepnie przy przekazaniu osoba przyjmująca weryfikuje co otrzymała i ew koryguje stan
//    finalnie wydanie docsów
//    przekazanie bezpośrednie/kurier
//    w przypadku przekazanie osobistego podpis na tablecie?
//    kurier przekazanie do adm

    void addDocs()
    {

    }





//    do panelu opsów odpowiedzialnych za dokumenty gdy klient kupi auto z dokumentami w lokalnym sejfie powiadomienie o wysyłaniu dokumentów

    void notifyAboutDocsToBeSent()
    {
//        inforamcje o klientcie do którego jest wysyłka
//        stan dokument? tj dr ti sb?

    }

//  pick up code request
//    gdy odbiór auta jest możliwy klient dostaje mail o mozliwości ustawienia daty odbioru
//    w panelu auta wybiera datę
//    warunek brzegowy na nastepny dzień tylko do 14:30
//    system sprawdza czy jest to dzień pracujący dla LC i czy sa wolne sloty
//    jeśli tak to wysyła info do LC
//    LC potwierdza i do klienta idzie mail z kodem odbioru (widoczny też w panelu auta)
//    LC nie potwierdza i wychodzi mail o braku możliwości odbioru w danym dniu więc klient wybiera inną datę

    void sendPickupCodeRequest()
    {
//        getLc - to which request is addressed
//        puDate - date requested by merchant
//        check if date is tomorrow request time is before 14:00 (or other given time)
//        check if LC works on given day
//        check if LC has enough slots
//        if any check fails propose next available day?

//        send request to LC to confirm and if it confirms send code to merchant

    }






//    fr

//    wniosek o fr
//    gdy powod tego wymaga opinia dm (np auto NRC w LC) tez sloty na film/zdjęcia


//    dla PL po zaakceptowaniu telefon do klienta i kwestia akcyzy (dla silników <2000 ccm)
//    dla CZ info dla TL OPS CZ
    



//    obliczanie wpływu przebiegu
//


//    formularz kontaktowy
//    kategoria i podkategoria zapytania
//    na tej podstawie przekazywanie do stosownej osoby

}
