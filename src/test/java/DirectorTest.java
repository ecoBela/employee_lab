import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Alex", "KZ214782P", 75, "HR", 500);
    }

    @Test
    public void hasName(){
        assertEquals("Alex", director.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("KZ214782P", director.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(75, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(500, director.getBudget(), 0.01);
    }

    @Test
    public void raiseSalary(){
        director.raiseSalary(25);
        assertEquals(100, director.getSalary(), 0.01);
    }

    @Test
    public void payBonus(){
        director.payBonus();
        assertEquals(75.75, director.getSalary(), 0.01);
    }
}
