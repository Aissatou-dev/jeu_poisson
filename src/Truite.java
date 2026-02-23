public class Truite extends Poisson {

    private int force;

    public Truite(int niveau, int force) {
        super(niveau);
        this.force = force;
    }

    @Override
    public int getNbPoints() {
        return niveau + force;
    }

    @Override
    public String getNom() {
        return "Truite";
    }
}