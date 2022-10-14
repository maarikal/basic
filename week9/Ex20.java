package week9;

import week9.measurement.AverageSensor;
import week9.measurement.ConstantSensor;
import week9.measurement.Sensor;
import week9.measurement.Thermometer;

public class Ex20 {
    public static void main(String[] args) {
        System.out.println("---Exercise 20.1------");
        ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println(ten.measure());
        System.out.println(minusFive.measure());

        System.out.println(ten.isOn());
        ten.off();
        System.out.println(ten.isOn());

        System.out.println();
        System.out.println("---Exercise 20.2------" );
        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
        // panin harjutuse 20.3 jaoks kinni, muidu see ei tööta
        // kumpula.off();
        // System.out.println("ifhe thermometer is of then temperature in Kumpula is "+kumpula.measure() + " degrees"); */

        System.out.println();
        System.out.println("---Exercise 20.3------");
        Sensor kumpula1 = new Thermometer();
        kumpula1.on();
        System.out.println("the temperature in Kumpula is "+kumpula1.measure() + " degrees");

        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula1);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees \n");

        System.out.println("---Exercise 20.4------");
        Sensor kumpula4 = new Thermometer();
        Sensor kaisaniemi4 = new Thermometer();
        Sensor helsinkiVantaa4 = new Thermometer();

        AverageSensor helsinkiArea4 = new AverageSensor();
        helsinkiArea4.addSensor(kumpula4);
        helsinkiArea4.addSensor(kaisaniemi4);
        helsinkiArea4.addSensor(helsinkiVantaa4);

        helsinkiArea4.on();
        System.out.println("the temperature in Helsinki area is " + helsinkiArea4.measure4() + " degrees");
        System.out.println("the temperature in Helsinki area is " + helsinkiArea4.measure4() + " degrees");
        System.out.println("the temperature in Helsinki area is " + helsinkiArea4.measure4() + " degrees \n");

        System.out.println("readings: "+ helsinkiArea4.readings());

    }
}
