import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Peter", "SN141457C", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Peter", databaseAdmin.getName());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.25);
        assertEquals(31000.25, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, databaseAdmin.payBonus(), 0.01);
    }

}
