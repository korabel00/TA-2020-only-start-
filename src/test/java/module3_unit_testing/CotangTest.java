package module3_unit_testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangTest extends BaseTest {

    @Test(dataProvider = "valuesForCotangTest", groups = {"unitTests1"})
    public void cotangTest(long a, double expectedValue) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedValue, "Invalid tang value");
    }

    @DataProvider(name = "valuesForCotangTest")
    public Object[][] values() {
        return new Object[][]{
                {30, -0.1561199521616592},
                {90, -0.5012027833801532},
                {180, 0.7469988144140444},
                {360, -0.295845697968555},
        };
    }
}
