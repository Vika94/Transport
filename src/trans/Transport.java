package trans;

public abstract class Transport {
    int power;
    int maxSpeed;
    int mass;
    String brand;

    public abstract double powerInKv();


    public abstract void description();
}
