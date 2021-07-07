package trans;

import javax.sql.rowset.CachedRowSet;

public class Main {
    public static void main(String[] args) {
        Cars auto = new Cars();
        auto.power = 160;
        auto.maxSpeed = 290;
        auto.mass = 4600;
        auto.brand = "BMW";
        auto.numberOfWheels = 4;
        auto.expense = 8;
        auto.bodyType = "Седан";
        auto.numberOfPassengers = 5;
        auto.description();
        auto.powerInKv();
        auto.distance();

        Truck waggon = new Truck();
        waggon.power = 80;
        waggon.maxSpeed = 90;
        waggon.mass = 25000;
        waggon.brand = "МАЗ";
        waggon.numberOfWheels = 8;
        waggon.expense = 15;
        waggon.payloadCapacity = 18;
        waggon.description();
        waggon.powerInKv();
        waggon.weight();

        CivilianPlane plane = new CivilianPlane();
        plane.power = 650;
        plane.maxSpeed = 920;
        plane.mass = 120000;
        plane.brand = "Boing-737";
        plane.wingspan = 700;
        plane.minRunwayLength = 1500;
        plane.numberOfPassengers = 252;
        plane.businessClass = true;
        plane.description();
        plane.powerInKv();
        plane.capacity();

        MilitaryPlane plane1 = new MilitaryPlane();
        plane1.power = 950;
        plane1.maxSpeed = 1220;
        plane1.mass = 90000;
        plane1.brand = "Миг-29";
        plane1.wingspan = 450;
        plane1.minRunwayLength = 800;
        plane1.numberOfMissiles = 1;
        plane1.catapultingSystem = true;
        plane1.description();
        plane1.powerInKv();
        plane1.shot();
        plane1.catapult();


    }
}
