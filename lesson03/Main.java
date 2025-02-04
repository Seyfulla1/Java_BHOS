public class Main {
    public static void main(String[] args) {
        Pet dog=new Pet("dog","Rock",5,75,new String[]{"eat","drink","sleep"});
        Human human=new Human("Michael","Karleone",1977,90,dog,null,null);
        System.out.println(dog);
        System.out.println(human);
    }
}
