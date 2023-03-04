package ZadachaChata;

import java.util.Scanner;

import static ZadachaChata.TypeRoom.*;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     rentRoom();
    }

    public  static void rentRoom() throws IllegalArgumentException {
        System.out.println("Выберите один из вариантов комнат");
        System.out.println(STANDART + " " + STANDART.getStandardRoomBonus());
        System.out.println(COMFORT + " " + COMFORT.getComfortRoomBonus());
        System.out.println(LUX + " " + LUX.getDeluxeRoomBonus());
        System.out.println(PRESIDENT + " " + PRESIDENT.getPresidentRoomBonus());
        int i = scanner.nextInt();
        if (i < 0 && i > 4) {
            throw new IllegalArgumentException("Комнаты под данным номер не сущетсвует");
        }
        switch (i) {
            case 1 -> {
                System.out.println("Сколько у вас денег на счету?");
                if (scanner.nextInt() >= 70) {
                    System.out.println("Вам выдан номер " + STANDART + " +Вам выдан бонус " + STANDART.getStandardRoomBonus());
                    Hotel standartRoom = new Hotel(5, 1, 2, STANDART);
                } else {
                    System.out.println("Вам не хватает денег, Досвидания");
                }
            }
            case 2 -> {
                System.out.println("Сколько у вас денег на счету?");
                if (scanner.nextInt() >= 120) {
                    System.out.println("Вам выдан номер " + COMFORT + " +Вам выдан бонус " + COMFORT.getComfortRoomBonus());
                    Hotel comfortRoom = new Hotel(23, 2, 3, COMFORT);
                } else {
                    System.out.println("Вам не хватает денег, вы можете выбрать другой номер");
                }
            }
            case 3 -> {
                System.out.println("Сколько у вас денег на счету?");
                if (scanner.nextInt() >= 200) {
                    System.out.println("Вам выдан номер " + LUX + " +Вам выдан бонус " + LUX.getDeluxeRoomBonus());
                    Hotel luxRoom = new Hotel(56, 3, 4, LUX);
                } else {
                    System.out.println("Вам не хватает денег, вы можете выбрать другой номер");
                }
            }
            case 4 -> {
                System.out.println("Сколько у вас денег на счету?");
                if (scanner.nextInt() >= 200) {
                    System.out.println("Вам выдан номер " + PRESIDENT + " +Вам выдан бонус " + PRESIDENT.getPresidentRoomBonus());
                    Hotel presidentRoom = new Hotel(72, 4, 5, PRESIDENT);
                } else {
                    System.out.println("Вам не хватает денег, вы можете выбрать другой номер");
                }
            }
            default -> System.out.println("Такого номера нет");
        }
    }
}
