public class Carpe extends Poisson
{
    private boolean doree;

    public Carpe(int niveau, boolean doree) {
        super(niveau);
        this.doree = doree;
    }

    @Override
    public int getNbPoints() {
        return niveau * (doree ? 2 : 1);
    }

    @Override
    public String getNom() {
        return "Carpe";
    }
}
