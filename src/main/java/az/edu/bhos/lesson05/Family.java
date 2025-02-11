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
    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        int newIndex = 0;
        for (int i = 0; i < children.length; i++) {
            if (i == index) {
                continue;
            }
            newChildren[newIndex] = children[i];
            newIndex++;
        }
        children[index].setFamily(null);
        children = newChildren;
        return true;
    }
    public int countFamily() {
        return children.length+2;
    }
    @Override
    public String toString() {
        return "Family{\nmother="+mother.toString()+"\nfather="+father.toString()+"\nchildren="+ Arrays.toString(children)+"\npet="+pet.toString()+"\n}";
    }
}
