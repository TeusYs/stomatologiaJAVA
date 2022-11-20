import classes.*;

public class main {
    public static void main(String args[]) {
        System.out.println();
        int id_client = 331;
        String cient_name = "Петров П.П.";
        Client newClient1 = new Client();
        Client newClient2 = new Client(id_client, cient_name);
        newClient1.Input();
        System.out.println("\n" + "client1:");
        newClient1.Output();
        System.out.println("\n" + "client2:");
        newClient2.Output();
        System.out.println("\n");

        int id_dentist = 3;
        String dentist_name = "Васильев В.П.";
        int EXP_dentist = 15;
        Dentist newDentist1 = new Dentist();
        Dentist newDentist2 = new Dentist(id_dentist, dentist_name, EXP_dentist);
        newDentist1.Input();
        System.out.println("\n" + "dentist1:");
        newDentist1.Output();
        System.out.println("\n" + "dentist2:");
        newDentist2.Output();
        System.out.println("\n");

        int id_branch = 32;
        String street = "Ленина";
        int house_number = 15;
        Branch newBranch1 = new Branch();
        Branch newBranch2 = new Branch(id_branch, street, house_number);
        newBranch1.Input();
        System.out.println("\n" + "branch1:");
        newBranch1.Output();
        System.out.println("\n" + "branch2:");
        newBranch2.Output();
        System.out.println("\n");

        int id_service = 42;
        String title = "Пломба";
        int price = 432;
        Service newService1 = new Service();
        Service newService2 = new Service(id_service, title, price);
        newService1.Input();
        System.out.println("\n" + "Service1:");
        newService1.Output();
        System.out.println("\n" + "service2:");
        newService2.Output();
        System.out.println("\n");

        Table newTable1 = new Table();
        Table newTable2 = new Table(newClient1, newDentist1, newService1, newBranch1);
        newTable1.Input();
        System.out.println("\n" + "dl1:");
        newTable1.Output();
        System.out.println("\n" + "dl2:");
        newTable2.Output();
        ;
    }
}