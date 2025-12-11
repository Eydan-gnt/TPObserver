/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package fr.paulr.temperaturesensor;

import fr.paulr.temperaturesensor.Sensor;
import fr.paulr.temperaturesensor.Alarm;
import fr.paulr.temperaturesensor.Display;
import fr.paulr.temperaturesensor.Database;

/**
 *
 * @author Utilisateur
 */
public class TemperatureSensor {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Alarm alarm = new Alarm();
        Display display = new Display();
        Database database = new Database();
        sensor.ajouterObservateur(display);
        sensor.ajouterObservateur(database);
        sensor.ajouterObservateur(alarm);
        sensor.setTemperature(25);
        sensor.setTemperature(35);
        sensor.setTemperature(32);
        sensor.setTemperature(-16);
        sensor.setTemperature(44);
    }

}
