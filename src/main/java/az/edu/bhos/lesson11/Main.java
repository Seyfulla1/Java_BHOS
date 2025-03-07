package az.edu.bhos.lesson11;


public class Main {
    public static void main(String[] args) {

    Human loretta=new Human("Loretta","Stinson",1948);
    Human jerome=new Human("Jerome","Whittaker",1940);
    Family family1=new Family(loretta,jerome);

    //-------------------------------------------------------------------

    Human genevieve=new Human("Genevieve","Scherbatsky",1945);
    Human scherbatskySr=new Human("Sr","Scherbatsky",1941);
    Family family2=new Family(genevieve,scherbatskySr);

    //--------------------------------------------------------------------

        String[][] barneySchedule = {
                {DayOfWeek.MONDAY.name(), "drink"},
                {DayOfWeek.WEDNESDAY.name(), "drink more"},
                {DayOfWeek.FRIDAY.name(), "party"},
        };
        Human barney = new Human("Barney", "Stinson", 1975);
        barney.setSchedule(barneySchedule);

        String[][] robinSchedule = {
                {DayOfWeek.MONDAY.name(), "Drawing"},
                {DayOfWeek.WEDNESDAY.name(), "Playing badminton"},
                {DayOfWeek.FRIDAY.name(), "Reading books"},
                {DayOfWeek.SATURDAY.name(), "Partying"}
        };
    Human robin=new Human("Robin","Scherbatsky",1980,90,robinSchedule);
    Human ted=new Human("Ted","Mosby",1978);
    family2.addChild(robin);
    family2.addChild(ted);
    family2.addChild(barney);
        System.out.println(family2);
        System.out.println("----------------------------");
        family2.deleteChild(new Human("Ted","Mosby",1978));
        System.out.println(family2);

        for (int i = 0; i < 10000000; i++) {
            new Human("Ali", "Vali", 1945);
        }






    }
}
