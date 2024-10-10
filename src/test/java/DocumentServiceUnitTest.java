import opsDash.utils.Country;
import opsDash.docs.DocumentService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DocumentServiceUnitTest
{
    @Test
    void calculateDelayStartDate_shouldAddOneMonthWhenIsRemIsTrue()
    {
//        given
        var docsStartDate = LocalDate.now();
        var country = Country.PL;
        var isRem = true;

//        system under test
        var toTest = new DocumentService();

//        when
        var result = toTest.calculateDelayStartDate(docsStartDate, country, isRem);

//        then
        assertEquals(LocalDate.now().plusMonths(1).plusWeeks(1), result);
    }

    @Test
    void calculateDelayStartDate_shouldNotAddOneMonthWhenIsRemIsFalse()
    {
//        given
        var docsStartDate = LocalDate.now();
        var country = Country.PL;
        var isRem = false;

//        system under test
        var toTest = new DocumentService();

//        when
        var result = toTest.calculateDelayStartDate(docsStartDate, country, isRem);

//        then
        assertEquals(LocalDate.now().plusWeeks(1), result);
    }
}