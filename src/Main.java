public class Main {

    public static void main(String[] args) {
        Canne canne = new Canne(8);

        //Zone de pêche de départ
        SpotPeche etang = new Etang();
        for(int i = 0; i < 10; i++) {
            etang.pecher(canne);
        }
        System.out.println(canne);

        //Changement de zone
        SpotPeche lac = new Lac(0.3);
        for(int i = 0; i < 10; i++) {
            lac.pecher(canne);
        }
        System.out.println(canne);
    }

}