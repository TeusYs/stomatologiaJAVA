package classes;

import java.util.Scanner;

public class Service {
    private int ID;
    private String Title;
    private int Price;

    public Service() {
        ID = 0;
        Title = "Название не указано";
        Price = 0;
    }

    public Service(int id, String title, int price) {
        ID = id;
        Title = title;
        Price = price;
    }

    public void Input() {
        Scanner input = new Scanner(System.in, "windows-1251");
        System.out.print("Введите ID Услуги: ");
        ID = input.nextInt();
        input.nextLine();
        System.out.print("Введите название услуги: ");
        Title = input.nextLine();
        System.out.print("Введите цену услуги: ");
        Price = input.nextInt();
    }

    public void Output() {
        System.out.println("ID услуги: " + ID);
        System.out.println("Название и цена услуги: " + Title + " " + Price);
    }

    public int get_price() {
        return Price;
    }

    public void set_Price(int Price) {
        this.Price = Price;
    }
}