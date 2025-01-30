public class Main {
    public static void main(String[] args) {
        DegreeProgram infosec=new DegreeProgram("Undergraduate","Information Security",5,4500,250);
        DegreeProgram chemeng=new DegreeProgram("Undergraduate","Chemical Engineering",4,6000,200);
        DegreeProgram criminalLaw=new DegreeProgram("Masters","Criminal Law",3,30000,120);
        double budget=25000;
        System.out.println(infosec);
        infosec.printCreditInfo();
        if(infosec.isAffordable(budget)){
            System.out.println(infosec.getName()+" is affordable");
        }else{
            System.out.println(infosec.getName()+" is not affordable");
        }
        System.out.println(chemeng);
        chemeng.printCreditInfo();
        System.out.println(criminalLaw);
        criminalLaw.printCreditInfo();



    }
}
