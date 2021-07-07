package trans;

import java.util.Random;

public class MilitaryPlane extends Air {
    boolean catapultingSystem;
    int numberOfMissiles;

    @Override
    public double powerInKv() {
        System.out.println("Мощность авто в киловаттах - " + (power * 0.74));
        return power * 0.74;
    }

    @Override
    public void description() {
        System.out.println("\nМощность в л/с - " + power + "\nМаксимальная скорость, км/ч - " + maxSpeed +
                "\nМасса, кг - " + mass + "\nБрэнд транспорта - " + brand +
                "\nНаличие системы катапультирования - " + catapultingSystem +
                "\nРазмах крыльев, м - " + wingspan +
                "\nМинимальная длина взлетно-посадочной полосы, м - " + minRunwayLength +
                "\nКоличество боеприпасов, шт - " + numberOfMissiles);
    }

    public void shot() {
        if (numberOfMissiles == 0) {
            System.out.println("Боеприпасы отсутствуют ");
        } else System.out.println("Ракета запущена ");
    }

    public void catapult() {
        if (catapultingSystem = true) {
            System.out.println("Катапультирование прошло успешно ");
        } else System.out.println("У вас нет системы катапультирования ");
    }
}
