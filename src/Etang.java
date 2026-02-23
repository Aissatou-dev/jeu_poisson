public class Etang extends SpotPeche {

    @Override
    protected Poisson creerPoisson() {
        return new Truite(aleatoire.nextInt(1, 16), aleatoire.nextInt(1, 11));
    }

}