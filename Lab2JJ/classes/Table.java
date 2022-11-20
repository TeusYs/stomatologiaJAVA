package classes;

public class Table {
    private Client client;
    private Dentist dentist;
    private Service service;
    private Branch branch;

    public Table() {
        client = new Client();
        dentist = new Dentist();
        service = new Service();
        branch = new Branch();

    }

    public Table(Client new_client, Dentist new_dentist, Service new_service, Branch new_branch) {
        client = new_client;
        dentist = new_dentist;
        service = new_service;
        branch = new_branch;

    }

    public void Input() {
        client.Input();
        dentist.Input();
        service.Input();
        branch.Input();

    }

    // Метод вывода.
    public void Output() {
        client.Output();
        dentist.Output();
        service.Output();
        branch.Output();

    }
}