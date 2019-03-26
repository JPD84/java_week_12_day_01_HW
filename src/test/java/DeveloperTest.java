import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class DeveloperTest{

        Developer developer;

        @Before
        public void before(){
            developer = new Developer("Jack Daniels", "JM 14 29 80 A", 35000);
        }

        @Test
        public void getName() {
            assertEquals("Jack Daniels", developer.getName());
        }

        @Test
        public void getNInumber(){
            assertEquals("JM 14 29 80 A", developer.getNInumber());
        }

        @Test
        public void hasSalary(){
            assertEquals(35000, developer.getSalary(), 0.01);
        }

        @Test
        public void getSalaryRaise(){
            developer.setRaiseSalary(2.0);
            assertEquals(35700, developer.getSalary(), 0.01);
        }

        @Test
        public void getpayBonus(){
            developer.getPayBonus();
            assertEquals(35350, developer.getSalary(), 0.01);
        }

        @Test
        public void setName() {
            developer.setName("Jack Sparrow");
            assertEquals("Jack Sparrow", developer.getName());
        }

        @Test
        public void setNInumber(){
            developer.setNInumber("JM 23 34 80 A");
            assertEquals("JM 23 34 80 A", developer.getNInumber());
        }

        @Test
        public void setSalary(){
            developer.setSalary(34000);
            assertEquals(34000, developer.getSalary(), 0.01);
        }



}
