package az.edu.bhos.lesson07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HumanTest {

    @Test
    void testToString() {
        String[][] testSchedule={{DayOfWeek.MONDAY.name(),"Dancing"},{DayOfWeek.WEDNESDAY.name(),"football"},{DayOfWeek.SATURDAY.name(),"Partying"}};
        Human test=new Human("Ali","Helehe",1990,990,testSchedule);
        String expected="Human{name='Ali', surname='Helehe', year=1990, iq=990, schedule=[[MONDAY, Dancing], [WEDNESDAY, football], [SATURDAY, Partying]]}";
        assertEquals(expected,test.toString());
    }
}