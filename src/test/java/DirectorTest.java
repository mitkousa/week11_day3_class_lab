import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Pikachu", "SN135531A", 55000, "Human Resource", 1500000);
    }

    @Test
    public void hasName() {
        assertEquals("Pikachu", director.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1500000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.25);
        assertEquals(56000.25, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(550.00, director.payBonus(), 0.01);
    }

}
