import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest{

    Director director;

    @Before
    public void before(){
        director = new Director("Jack Daniels", "JM 14 29 80 A", 35000, 60000);
    }

    @Test
    public void getName() {
        assertEquals("Jack Daniels", director.getName());
    }

    @Test
    public void getNInumber(){
        assertEquals("JM 14 29 80 A", director.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, director.getSalary(), 0.01);
    }

    @Test
    public void getSalaryRaise(){
        director.setRaiseSalary(2.0);
        assertEquals(35700, director.getSalary(), 0.01);
    }

    @Test
    public void getpayBonus(){
        director.getPayBonus();
        assertEquals(35700, director.getSalary(), 0.01);
    }

    @Test
    public void setName() {
        director.setName("Jack Sparrow");
        assertEquals("Jack Sparrow", director.getName());
    }

    @Test
    public void setNInumber(){
        director.setNInumber("JM 23 34 80 A");
        assertEquals("JM 23 34 80 A", director.getNInumber());
    }

    @Test
    public void setSalary(){
        director.setSalary(34000);
        assertEquals(34000, director.getSalary(), 0.01);
    }


}

