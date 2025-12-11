package fr.paulr.temperaturesensor;

public interface Subject {
    void ajouterObservateur(Observator observateur);
    void supprimerObservateur(Observator observateur);
    void notifierObservateur();
}
