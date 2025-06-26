import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int countCargo = 12, cargo = 1;// Кол-во контейнеров в грузовик
        int countConteiner = 27, conteiner = 1; // Кол-во яшиков в контейнер
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите количество ящиков: ");
        int countBox = in.nextInt();

        if (countBox > 0)
        {
            System.out.println("Грузовик " + cargo + ":");
            System.out.println("\tКонтейнер " + conteiner + ":");

            for (int i = 1; i <= countBox; i++)
            {
                System.out.println("\t\tЯщик " + i);
                if (i%countConteiner == 0 & conteiner%countCargo == 0) System.out.println("Грузовик " + ++cargo + ":");
                if (i%countConteiner == 0) System.out.println("\tКонтейнер " + ++conteiner + ":");
            }
            System.out.println("===============================");
            System.out.println("Необходимо :");
            System.out.println("Грузовиков : " + cargo + " шт");
            System.out.println("Контейнеров : " + conteiner + " шт");


        } else
        {
            System.out.println("Не верно указано кол-во ящиков");
        }

    }

}