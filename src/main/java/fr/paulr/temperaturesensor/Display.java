package fr.paulr.temperaturesensor;

public class Display implements Observator{

    @Override
    public void updateTemperature(int temperature) {
        System.out.println("Température actuelle : "+temperature+"°C");
    }
}
