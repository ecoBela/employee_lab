import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Kevin", "CK234299Z", 50);
    }

    @Test
    public void hasName(){
        assertEquals("Kevin", databaseAdmin.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("CK234299Z", databaseAdmin.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        databaseAdmin.raiseSalary(50);
        assertEquals(100, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void doNotRaiseDatabaseAdminSalary() {
        databaseAdmin.raiseSalary(-10);
        assertEquals(50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void payBonus(){
        databaseAdmin.payBonus();
        assertEquals(50.50, databaseAdmin.getSalary(), 0.01);
    }

}
