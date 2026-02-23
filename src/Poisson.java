import java.util.Random;

public abstract class Poisson {

    protected int niveau;

    private Random aleatoire = new Random();

    public Poisson(int niveau) {
        this.niveau = niveau;
    }

    public abstract int getNbPoints();

    public abstract String getNom();

    public boolean tenterPecherAvec(Canne canne) {
        int val = aleatoire.nextInt(1, getNbPoints());
        return canne.getForce() > val;
    }
}