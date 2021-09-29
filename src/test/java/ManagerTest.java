import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Paul", "SN123456A", 40000, "Front Of House");
    }

    @Test
    public void hasName() {
        assertEquals("Paul", manager.getName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2000.50);
        assertEquals(42000.50, manager.getSalary(), 0.01);
    }

    @Test
    public void canNotBeNegativeSalaryRaise() {
        manager.raiseSalary(-1000.50);
        assertEquals(40000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, manager.payBonus(), 0.01);
    }
}
