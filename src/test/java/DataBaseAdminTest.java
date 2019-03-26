import TechStaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class DataBaseAdminTest{

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Jack Daniels", "JM 14 29 80 A", 35000);
    }

    @Test
    public void getName() {
        assertEquals("Jack Daniels", dataBaseAdmin.getName());
    }

    @Test
    public void getNInumber(){
        assertEquals("JM 14 29 80 A", dataBaseAdmin.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void getSalaryRaise(){
        dataBaseAdmin.setRaiseSalary(2.0);
        assertEquals(35700, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void getpayBonus(){
        dataBaseAdmin.getPayBonus();
        assertEquals(35350, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void setName() {
        dataBaseAdmin.setName("Jack Sparrow");
        assertEquals("Jack Sparrow", dataBaseAdmin.getName());
    }

    @Test
    public void setNInumber(){
        dataBaseAdmin.setNInumber("JM 23 34 80 A");
        assertEquals("JM 23 34 80 A", dataBaseAdmin.getNInumber());
    }

    @Test
    public void setSalary(){
        dataBaseAdmin.setSalary(34000);
        assertEquals(34000, dataBaseAdmin.getSalary(), 0.01);
    }




}

