package az.edu.bhos.lesson05;
import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }
    public Human getMother() {
        return mother;
    }
    public Human getFather() {
        return father;
    }
    public Human[] getChildren() {
        return children;
    }
    public Pet getPet() {
        return pet;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    @Override
    public String toString() {
        return "Family{mother="+mother.getName()+" father="+father.getName()+" children="+ Arrays.toString(children)+" pet="+pet.toString()+"}";
    }
}
