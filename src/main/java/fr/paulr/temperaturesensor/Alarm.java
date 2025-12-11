package fr.paulr.temperaturesensor;

public class Alarm implements Observator {

    @Override
    public void updateTemperature(int temperature) {
        if (temperature > 30) {
            System.out.println("Alerte : température trop élevée !");
        }
    }

}
