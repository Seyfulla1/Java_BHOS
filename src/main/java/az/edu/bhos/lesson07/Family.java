package az.edu.bhos.lesson07;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    static{
        System.out.println("Family class is loaded.");
    }
    {
        System.out.println("A new Family object is created.");
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = new Pet();
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

    public void addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        newChildren[children.length] = child;
        children = newChildren;
        child.setFamily(this);
    }
    public boolean deleteChild(Human human) {
        boolean found = false;

        for(Human child : children) {
            if(child.equals(human)) {
                found = true;
                break;
            }
        }
        if(!found) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        int index=0;
        for (Human child : children) {
            if (!child.equals(human)) {
                newChildren[index] = child;
                index++;
            }
        }
        human.setFamily(null);
        children = newChildren;
        return true;
    }
    public int countFamily() {
        return children.length+2;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if(that==null || that.getClass()!=this.getClass()){
            return false;
        }
        Family thatFamily = (Family) that;
        //I check only mother and father as they are the two main components of the family
        //As we can add and remove children, I didn't include them in comparison
        //However, if needed, Arrays.equals(children, thatFamily.children) can be used to check if the children are equal
        return Objects.equals(mother, thatFamily.mother) &&
                Objects.equals(father, thatFamily.father);
    }
    @Override
    public int hashCode() {
        int result=17;
        result=31*result+mother.hashCode();
        result=31*result+father.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "Family{\nmother="+mother.toString()+"\nfather="+father.toString()+"\nchildren="+ Arrays.toString(children)+"\npet="+pet.toString()+"\n}";
    }
}
