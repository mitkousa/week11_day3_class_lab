import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Duncan", "SN123457C", 35000);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.25);
        assertEquals(36000.25, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350.00, developer.payBonus(), 0.01);
    }
}
