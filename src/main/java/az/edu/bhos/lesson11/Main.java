package az.edu.bhos.lesson11;


public class Main {
    public static void main(String[] args) {

    Woman loretta=new Woman("Loretta","Stinson",1948);
    Man jerome=new Man("Jerome","Whittaker",1940);
    Family family1=new Family(loretta,jerome);

    //-------------------------------------------------------------------

    Woman genevieve=new Woman("Genevieve","Scherbatsky",1945);
    Man scherbatskySr=new Man("Sr","Scherbatsky",1941);
    genevieve.setIq(100);
    scherbatskySr.setIq(70);
    Family family2=new Family(genevieve,scherbatskySr);

    //--------------------------------------------------------------------

        String[][] barneySchedule = {
                {DayOfWeek.MONDAY.name(), "drink"},
                {DayOfWeek.WEDNESDAY.name(), "drink more"},
                {DayOfWeek.FRIDAY.name(), "party"},
        };
        Man barney = new Man("Barney", "Stinson", 1975);
        barney.setSchedule(barneySchedule);

        String[][] robinSchedule = {
                {DayOfWeek.MONDAY.name(), "Drawing"},
                {DayOfWeek.WEDNESDAY.name(), "Playing badminton"},
                {DayOfWeek.FRIDAY.name(), "Reading books"},
                {DayOfWeek.SATURDAY.name(), "Partying"}
        };
    Woman robin=new Woman("Robin","Scherbatsky",1980,90,robinSchedule);
    Man ted=new Man("Ted","Mosby",1978);
    family2.addChild(robin);
    family2.addChild(ted);
    family2.addChild(barney);
    family2.bornChild();
        System.out.println(family2);
        System.out.println("----------------------------");
        family2.deleteChild(new Man("Ted","Mosby",1978));
        System.out.println(family2);






    }
}
