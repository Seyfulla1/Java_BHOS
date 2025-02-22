package az.edu.bhos.lesson07;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

   static Human mother;
   static Human father;
   static Family family;
   static String[][] schedule1;
   static Human child1;
   static Human child2;
   static Human child3;

    @BeforeEach
    void setUp()
    {
         mother=new Human("Mother","Motherov",1970);
         father=new Human("Father","Fatherov",1965);
         family=new Family(mother,father);
         schedule1=new String[][]{{DayOfWeek.MONDAY.name(),"Doing Monday things"},{DayOfWeek.WEDNESDAY.name(),"Doing wednesday things"},{DayOfWeek.FRIDAY.name(),"Friday night hobby"},{DayOfWeek.SATURDAY.name(),"Partying"}};
         child1=new Human("Child1","Childov1",1995,100,schedule1);
         child2=new Human("Child2","Childov2",1997);
         child3=new Human("Child3","Childov3",1999);


    }

    @Test
    void testAddChild() {
        int originalChildrenCount=family.getChildren().length;
        family.addChild(child1);
        assertEquals(originalChildrenCount+1,family.getChildren().length);
        assertEquals(child1.getFamily(),family);
        assertEquals(family.getChildren()[family.countFamily()-3],child1);
    }

    @Test
    void testDeleteChildHuman() {
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);
        int originalChildrenCount=family.getChildren().length;
        family.deleteChild(child1);
        assertEquals(originalChildrenCount-1,family.getChildren().length);
        assertEquals(family.getChildren()[0],child2);
        assertEquals(family.getChildren()[1],child3);
        assertNull(child1.getFamily());
        family.addChild(child1);
        family.deleteChild(child3);
        assertEquals(family.getChildren()[0],child2);
        assertEquals(family.getChildren()[1],child1);
        originalChildrenCount=family.getChildren().length;
        family.deleteChild(child3);
        assertEquals(originalChildrenCount,family.getChildren().length);

        
    }
    @Test
    void testDeleteChildIndex() {
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);
        int originalChildrenCount=family.getChildren().length;
        //-----------------------------------
        boolean result=family.deleteChild(1);
        assertEquals(originalChildrenCount-1,family.getChildren().length);
        assertEquals(family.getChildren()[0],child1);
        assertEquals(family.getChildren()[1],child3);
        assertNull(child2.getFamily());
        assertTrue(result);
        //-----------------------------------
        originalChildrenCount=family.getChildren().length;
        result= family.deleteChild(2);
        assertEquals(originalChildrenCount,family.getChildren().length);
        assertFalse(result);
    }


    @Test
    void testCountFamily() {
        assertEquals(2,family.countFamily());
        family.addChild(child1);
        assertEquals(3,family.countFamily());
        family.addChild(child2);
        assertEquals(4,family.countFamily());
    }

    @Test
    void testToString() {
        family.addChild(child1);
        family.addChild(child2);
        family.setPet(new Pet(Species.DOG,"bd",6,66,new String[]{"eat","sleep","bark","drink"}));
        String expected="Family{\n" +
                "mother=Human{name='Mother', surname='Motherov', year=1970, iq=-1, schedule=[]}\n" +
                "father=Human{name='Father', surname='Fatherov', year=1965, iq=-1, schedule=[]}\n" +
                "children=[Human{name='Child1', surname='Childov1', " +
                "year=1995, iq=100, schedule=[[MONDAY, Doing Monday things], [WEDNESDAY, Doing wednesday things], [FRIDAY, Friday night hobby], [SATURDAY, Partying]]}, " +
                "Human{name='Child2', surname='Childov2', year=1997, iq=-1, schedule=[]}]\n" +
                "pet=DOG{nickname='bd', age=6, trickLevel=66, habits=[eat, sleep, bark, drink]}\n" + "}";
        assertEquals(expected,family.toString());
    }
    @Test
    void equalsShouldBeReflexive() {
        assertEquals(family, family);
    }
    @Test void equalsShouldBeSymmetric() {
        Family family2=new Family(mother,father);
        assertTrue(family.equals(family2) && family2.equals(family));
        Family family3=new Family(new Human("a","b",1990),new Human("c","d",1995));
        assertFalse(family.equals(family3) || family3.equals(family));
    }
    @Test void equalsShouldBeTransitive() {
        Family family2=new Family(mother,father);
        Family family3=new Family(mother,father);
        assertTrue(family.equals(family2) && family2.equals(family3) && family.equals(family3));
    }
    //I don't know how to check for consistency.
    // may be checking assertEquals a few times, but it does not make sense to me.

}