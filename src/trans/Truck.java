package trans;

import java.util.Scanner;

public class Truck extends GroundTransport {
    int payloadCapacity;

    @Override
    public double powerInKv() {
        System.out.println("Мощность авто в киловаттах - " + (power * 0.74));
        return power * 0.74;
    }

    @Override
    public void description() {
        System.out.println("\nМощность, л/с - " + power + "\nМаксимальная скорость, км/ч - " + maxSpeed +
                "\nМасса, кг - " + mass + "\nБрэнд транспорта - " + brand +
                "\nКоличество колес - " + numberOfWheels + "\nРасход топлива,л/100км - " + expense +
                "\nГрузоподъёмность,т - " + payloadCapacity);
    }

    public void weight() {
        System.out.println("Введите вес груза, который хотите перевезти, т - ");
        Scanner scanner = new Scanner(System.in);
        int mass = scanner.nextInt();
        if (mass > payloadCapacity) {
            System.out.println("Вам нужен грузовик побольше ");
        } else if (mass < payloadCapacity) {
            System.out.println("Грузовик загружен. Езжайте ");

        }
    }
}
