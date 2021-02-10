import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mila", "RS159264L", 200);
    }

    @Test
    public void hasName(){
        assertEquals("Mila", developer.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("RS159264L", developer.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(200, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        developer.raiseSalary(50);
        assertEquals(250, developer.getSalary(), 0.01);
    }

    @Test
    public void doNotRaiseDeveloperSalary() {
        developer.raiseSalary(-10);
        assertEquals(200, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus(){
        developer.payBonus();
        assertEquals(202, developer.getSalary(), 0.01);
    }
}
