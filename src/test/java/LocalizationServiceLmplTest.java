import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceLmplTest {
    @Test
    void test_locale() {

        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test_locale1() {

        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual1 = localizationService.locale(Country.USA);
        String expected1 = "Добро пожаловать";
        Assertions.assertEquals(expected1, actual1);
    }
}
