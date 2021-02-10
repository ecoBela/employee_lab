import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mr Burns", "KL271576B", 100, "Operations");
    }

    @Test
    public void hasName(){
        assertEquals("Mr Burns", manager.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("KL271576B", manager.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(100, manager.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        manager.raiseSalary(50);
        assertEquals(150, manager.getSalary(), 0.01);
    }

    @Test
    public void doNotRaiseManagerSalary(){
        manager.raiseSalary(-10);
        assertEquals(100, manager.getSalary(), 0.01);

    }

    @Test
    public void payBonus(){
        manager.payBonus();
        assertEquals(101, manager.getSalary(), 0.01);
    }

}
