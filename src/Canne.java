public class Canne {

    private int niveau;

    private int degradation = 0;

    private int score = 0;

    public Canne(int niveau) {
        this.niveau = niveau;
    }

    public void augmenterNiveau() {
        niveau++;
    }

    public void degrader() {
        degradation++;
    }

    public void reparer() {
        degradation = 0;
    }

    public int getForce() {
        return Math.max(0, niveau - degradation);
    }

    public void augmenterScore(int points) {
        score += points;
    }

    @Override
    public String toString() {
        return String.format("Canne à pêche niveau %s, degradation : %s, score : %s",  niveau, degradation, score);
    }
}