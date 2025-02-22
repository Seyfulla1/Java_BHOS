package az.edu.bhos.lesson07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HumanTest {
    static Human test1;
    static Human sameAsTest1;
    static Human sameAsTest1_1;
    static Human test2;
    static String[][] testSchedule1;

    @BeforeAll
    static void setUp() {
        testSchedule1=new String[][]{{DayOfWeek.MONDAY.name(),"Dancing"},{DayOfWeek.WEDNESDAY.name(),"football"},{DayOfWeek.SATURDAY.name(),"Partying"}};
        test1=new Human("Ali","Helehe",1990,990,testSchedule1);
        sameAsTest1=new Human("Ali","Helehe",1990,990,testSchedule1);
        sameAsTest1_1=new Human("Ali","Helehe",1990);// I have not included schedule in equals() so they are still equal
        sameAsTest1_1.setIq(990);
        test2=new Human("Veli","Helehe",1990,990,testSchedule1);
    }
    @Test
    void testToString() {
        String expected="Human{name='Ali', surname='Helehe', year=1990, iq=990, schedule=[[MONDAY, Dancing], [WEDNESDAY, football], [SATURDAY, Partying]]}";
        assertEquals(expected,test1.toString());
    }
    @Test
    void equalsShouldBeReflexive() {
        assertEquals(test1,test1);
    }
    @Test
    void equalsShouldBeSymmetric() {
        assertTrue(test1.equals(sameAsTest1) && sameAsTest1.equals(test1));
        assertFalse(test1.equals(test2) || test2.equals(test1));
    }
    @Test
    void equalsShouldBeTransitive() {
        assertTrue(test1.equals(sameAsTest1) && sameAsTest1.equals(sameAsTest1_1) && test1.equals(sameAsTest1_1));
    }
    @Test
    void equalsShouldBeConsistent() {
        assertEquals(test1,sameAsTest1);
        assertEquals(test1,sameAsTest1);
        assertEquals(test1,sameAsTest1);
        assertEquals(test1,sameAsTest1);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
        assertNotEquals(test1,test2);
    }
    @Test
    void hashCodesShouldBeEqualWhenObjectsAreEqual() {
        assertEquals(test1.hashCode(),sameAsTest1.hashCode());

    }
    @Test
    void hashCodesMayOnlyChangeIfTheObjectChanges() {
        int hashCode1=test1.hashCode();
        int hashCode2=test1.hashCode();
        int hashCode3=test1.hashCode();
        assertEquals(hashCode1,hashCode2);
        assertEquals(hashCode2,hashCode3);
        test1.setYear(test1.getYear()-5);
        int hashCode4=test1.hashCode();
        assertNotEquals(hashCode1,hashCode4);
    }

}