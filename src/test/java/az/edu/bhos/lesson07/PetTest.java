package az.edu.bhos.lesson07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PetTest {

    static Pet test1;
    static Pet sameAsTest1;
    static Pet sameAsTest1_1;
    static Pet test2;

    @BeforeAll
    static void setUp() {
        test1=new Pet(Species.CAT,"gs",10,100,new String[]{"cry","miyau","lose"});
        sameAsTest1=new Pet(Species.CAT,"gs",10,100,new String[]{"cry","miyau","lose"});
        sameAsTest1_1=new Pet(Species.CAT,"gs",10,100,new String[]{"cry","miyau","lose"});
        test2=new Pet(Species.DOG,"Felipe Melo",41,99,new String[]{"cry","bark","lose"});
    }
    @Test
    void testToString() {
        String expected="DOG{nickname='Felipe Melo', age=41, trickLevel=99, habits=[cry, bark, lose], characteristics=can't fly, has 4 legs, has fur}";
        assertEquals(expected,test2.toString());
    }
    @Test
    void equalsShouldBeReflexive() {
        Pet test=new Pet(Species.CAT,"gs",10,100,new String[]{"cry","miyau","lose"});
        assertEquals(test,test);
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
        assertEquals(hashCode1,hashCode3);
        test1.setAge(test1.getAge()+1);
        assertNotEquals(hashCode1,test1.hashCode()); // not required to be not equal, but it better be


    }
}