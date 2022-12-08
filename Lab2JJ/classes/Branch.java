package classes;

import java.util.Scanner;

public class Branch {
    private int ID;
    private String Street;
    private int Number_House;

    public Branch() {
        ID = 0;
        Street = "Адрес не указан";
        Number_House = 0;
    }

    public Branch(int id, String street, int number_house) {
        ID = id;
        Street = street;
        Number_House = number_house;
    }

    public void Input() {
        Scanner input = new Scanner(System.in,"windows-1251");
        System.out.print("Введите id филиала: ");
        ID = input.nextInt();
        input.nextLine();
        System.out.print("Введите улицу филиала: ");
        Street = input.nextLine();
        System.out.print("Введите номер дома филиала: ");
        Number_House = input.nextInt();
    }

    public void Output() {
        System.out.println("ID филиала: " + ID);
        System.out.println("Адрес филиала: " + Street + " " + Number_House);
    }
}