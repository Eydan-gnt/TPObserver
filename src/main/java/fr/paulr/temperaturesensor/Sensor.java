package fr.paulr.temperaturesensor;

import java.util.ArrayList;

public class Sensor implements Subject {

    private ArrayList<Observator> observateurs = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifierObservateur();
    }

    //Methode observatorSubject

    @Override
    public void ajouterObservateur(Observator observator) {
        observateurs.add(observator);
    }

    @Override
    public void supprimerObservateur(Observator observator) {
        observateurs.remove(observator);
    }

    @Override
    public void notifierObservateur() {
        for (Observator o : observateurs) {
            o.updateTemperature(temperature);
        }
    }
}
