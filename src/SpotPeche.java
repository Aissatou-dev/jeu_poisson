import java.util.Random;

public abstract class SpotPeche {

    protected Random aleatoire = new Random();

    public void pecher(Canne canne) {
        //Le poisson instancié dépend du spot de pêche concret
        Poisson poisson = creerPoisson();
        System.out.printf("%s apparaît!%n", poisson.getNom());
        if(poisson.tenterPecherAvec(canne)) {
            canne.augmenterNiveau();
            canne.augmenterScore(poisson.getNbPoints());
            System.out.println("Pêche réussie !");
        }
        else {
            canne.degrader();
            System.out.println("Pêche ratée !");
        }
    }

    //Méthode fabrique !
    protected abstract Poisson creerPoisson();

}