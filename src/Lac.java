public class Lac extends SpotPeche {

    private double probabiliteCarpeDoree;

    public Lac(double probabiliteCarpeDoree) {
        this.probabiliteCarpeDoree = probabiliteCarpeDoree;
    }

    @Override
    protected Poisson creerPoisson() {
        boolean doree = aleatoire.nextDouble(0.0, 1.0) < probabiliteCarpeDoree;
        return new Carpe(aleatoire.nextInt(20, 31), doree);
    }
}