import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jack Daniels", "JM 14 29 80 A", 35000);
    }

    @Test
    public void getName() {
        assertEquals("Jack Daniels", manager.getName());
    }

    @Test
    public void getNInumber(){
        assertEquals("JM 14 29 80 A", manager.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, manager.getSalary(), 0.01);
    }

    @Test
    public void getSalaryRaise(){
        manager.setRaiseSalary(2.0);
        assertEquals(35700, manager.getSalary(), 0.01);
    }

    @Test
    public void getpayBonus(){
        manager.getPayBonus();
        assertEquals(35350, manager.getSalary(), 0.01);
    }

    @Test
    public void setName() {
        manager.setName("Jack Sparrow");
        assertEquals("Jack Sparrow", manager.getName());
    }

    @Test
    public void setNInumber(){
        manager.setNInumber("JM 23 34 80 A");
        assertEquals("JM 23 34 80 A", manager.getNInumber());
    }

    @Test
    public void setSalary(){
        manager.setSalary(34000);
        assertEquals(34000, manager.getSalary(), 0.01);
    }



}
