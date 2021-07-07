package trans;

import java.util.Scanner;

public class Cars extends GroundTransport {
    String bodyType;
    int numberOfPassengers;

    @Override
    public double powerInKv() {
        System.out.println("Мощность авто в киловаттах - " + (power * 0.74));
        return power * 0.74;
    }

    @Override
    public void description() {
        System.out.println("Мощность, л/с - " + power + "\nМаксимальная скорость, км/ч - " + maxSpeed +
                "\nМасса, кг - " + mass + "\nБрэнд транспорта - " + brand +
                "\nКоличество колес - " + numberOfWheels + "\nРасход топлива,л/100км - " + expense +
                "\nТип кузова - " + bodyType + "\nКоличество пассажиров, чел  - "
                + numberOfPassengers);

    }

    int km;
    public void distance() {
        System.out.println("Введите время в движении для расчета расстояния, пройденого автомобилем,ч - ");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        km = maxSpeed * hour;
        System.out.println("За время " + hour + " ч, автомобиль " + brand +
                " двигаясь со скоростью " + maxSpeed + " км/ч проедет " + km + " км");
        expense();

    }

    private void expense() {
        int expenseOfMaxSpeed;
        expenseOfMaxSpeed = (km * expense) / 100;
        System.out.print("и израсходует " + expenseOfMaxSpeed + " л топлива");

    }


}
