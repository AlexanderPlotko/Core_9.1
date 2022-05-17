import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServisImplTest {
    @Test
    void test_byIP() {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp("127.0.0.1");
        Location expected = new Location(null, null, null, 0);
        Assertions.assertEquals(expected.getCity(), actual.getCity());
    }

    @Test
    void test_byIP_NY() {
        GeoService geoService = new GeoServiceImpl();
        Location actual1 = geoService.byIp("96.");
        Location expected1 = new Location("New York", Country.USA, null,  0);
        Assertions.assertEquals(actual1.getCountry(), expected1.getCountry());
    }

    @Test
    void test_byIP_MSK() {
        GeoService geoService = new GeoServiceImpl();
        Location actual1 = geoService.byIp("172.");
        Location expected1 = new Location("Moscow", Country.RUSSIA, null, 0);
        Assertions.assertEquals(actual1.getCountry(), expected1.getCountry());
    }
}
