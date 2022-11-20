package classes;

import java.util.Scanner;

public class Dentist {
    private int ID;
    private String FIO;
    private int EXP;

    public Dentist() {
        ID = 0;
        FIO = "Имя не указано.";
        EXP = 0;
    }

    public Dentist(int id, String name, int exp) {
        ID = id;
        FIO = name;
        EXP = exp;
    }

    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ФИО дантиста: ");
        FIO = input.nextLine();
        System.out.print("Введите id дантиста: ");
        ID = input.nextInt();
        System.out.print("Введите опыт дантиста: ");
        EXP = input.nextInt();
    }

    public void Output() {
        System.out.println("ID дантиста: " + ID);
        System.out.println("ФИО дантиста: " + FIO);
        System.out.println("Опыт дантиста: " + EXP);
    }
}