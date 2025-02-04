

public class Main {
    public static void main(String[] args) {
    Human loretta=new Human("Loretta","Stinson",1948);
    Human jerome=new Human("Jerome","Whittaker",1940);
    Human barney=new Human("Barney","Stinson",1975,loretta,jerome);
    Human scherbatskySr=new Human("Sr","Scherbatsky",1941);
    Human genevieve=new Human("Genevieve","Scherbatsky",1945);
    Pet dog=new Pet("Bulldog","bd",6,66,new String[]{"eat","sleep","bark","drink"});
    Human robin=new Human("Robin","Scherbatsky",1980,90,dog,genevieve,scherbatskySr);
    System.out.println(robin);

    }
}
