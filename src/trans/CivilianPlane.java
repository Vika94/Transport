package trans;

import java.util.Scanner;

public class CivilianPlane extends Air {
    int numberOfPassengers;
    boolean businessClass;

    @Override
    public double powerInKv() {
        System.out.println("Мощность в киловаттах - " + (power * 0.74));
        return power * 0.74;
    }

    @Override
    public void description() {
        System.out.println("\nМощность в л/с - " + power + "\nМаксимальная скорость - " + maxSpeed +
                "\nМасса, кг - " + mass + "\nБрэнд транспорта - " + brand +
                "\nРазмах крыльев, м - " + wingspan +
                "\nМинимальная длина взлетно-посадочной полосы, м - " + minRunwayLength +
                "\nКоличество пассажиров - " + numberOfPassengers +
                "\nНаличие бизнесс-класса - " + businessClass);
    }

    public void capacity() {
        System.out.println("Введите количество пассажиров для посадки в самолет, чел - ");
        Scanner scanner = new Scanner(System.in);
        int pas = scanner.nextInt();
        if (pas > numberOfPassengers) {
            System.out.println("Вам нужен самолет побольше ");
        } else if (pas < numberOfPassengers) {
            System.out.println("Посадка завершена. Взлетаем ");

        }
    }

}
