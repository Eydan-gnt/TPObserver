package fr.paulr.temperaturesensor;

public class Database implements Observator{

    @Override
    public void updateTemperature(int temperature) {
        System.out.println("Ajout à la base de donnée");
    }
}
