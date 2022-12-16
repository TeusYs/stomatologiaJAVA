import classes.*;

public class main {
    public static void main(String args[]) {
        Service newService = new Service();
        newService.Input();
        System.out.println("\n" + "Service1:");

        Table[] newTable = new Table[3];
        for (int i=0;i<3;i++){
            newTable[i]= new Table();
            newTable[i].Input();
        }
    }
}