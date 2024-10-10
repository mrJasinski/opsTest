package opsDash.specialAccess;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SpecialAccessServiceUnitTest
{
//        List<SAReason> getReasonsForSAByDeliveryDate(LocalDate deliveryDate)
//    {
//        var reasons = new ArrayList<>(Arrays.asList(SAReason.values()));
//
//        if (deliveryDate == null)
//        {
//            reasons.clear();
//            reasons.add(SAReason.NRC);
//            reasons.add(SAReason.HAIL_DAMAGE);
//            reasons.add(SAReason.PURCHASE_ISSUE);
//            reasons.add(SAReason.MISSING_OR_DELAYED_DOCUMENTS);
//        }
//
//        if (deliveryDate != null)
//        {
//            reasons.remove(SAReason.NRC);
//            reasons.remove(SAReason.HAIL_DAMAGE);
//            reasons.remove(SAReason.PURCHASE_ISSUE);
//
//            if (deliveryDate.plusDays(90).isAfter(LocalDate.now()))
//            {
//                reasons.remove(SAReason.WRONG_DESCRIPTION );
//                reasons.remove(SAReason.REGISTRATION_ISSUE);
//                reasons.remove(SAReason.ACCIDENT_VEHICLE);
//                reasons.remove(SAReason.MISSING_OR_DELAYED_DOCUMENTS);
//            }
//        }
//
//        return reasons;
//    }

    @Test
    void getReasonsForSAByDeliveryDate_shouldContainReasonsNrcHailPurchaseIfDateDeliveredIsNull()
    {
//        given
        LocalDate deliveryDate = null;

//        system under test
        var toTest = new SpecialAccessService(null, null ,null);

//        when
        var result = toTest.getReasonsForSAByDeliveryDate(deliveryDate);

//        then
        assertTrue(result.contains(SAReason.NRC));
        assertTrue(result.contains(SAReason.HAIL_DAMAGE));
        assertTrue(result.contains(SAReason.PURCHASE_ISSUE));
    }

    @Test
    void getReasonsForSAByDeliveryDate_shouldNotContainReasonsNrcHailPurchaseIfDateDeliveredIsNotNull()
    {
//        given
        var deliveryDate = LocalDate.now();

//        system under test
        var toTest = new SpecialAccessService(null, null ,null);

//        when
        var result = toTest.getReasonsForSAByDeliveryDate(deliveryDate);

//        then
        assertFalse(result.contains(SAReason.NRC));
        assertFalse(result.contains(SAReason.HAIL_DAMAGE));
        assertFalse(result.contains(SAReason.PURCHASE_ISSUE));
    }
}