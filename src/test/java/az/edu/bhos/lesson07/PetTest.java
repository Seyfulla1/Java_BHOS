package az.edu.bhos.lesson07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PetTest {

    @Test
    void testToString() {
        Pet test=new Pet(Species.DOG,"Felipe Melo",41,99,new String[]{"cry","bark","lose"});
        String expected="DOG{nickname='Felipe Melo', age=41, trickLevel=99, habits=[cry, bark, lose], characteristics=can't fly, has 4 legs, has fur}";
        assertEquals(expected,test.toString());
    }
}