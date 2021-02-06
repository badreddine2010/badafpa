

public class exo{
    public static void main(String[] args) {
        // Initialisation des variables
        int[] tab1 = { 1, 14, 45, 3, 2 };
        // initialisation du 2e tableau vide qui aura la taille du tableau 1
        int[] tab2 = new int[tab1.length];
        // On affiche le 2e tableau vide
        System.out.println("Contenu du tableau 2 vide");
        for (int i : tab2) {
            System.out.println(i);
        }
        // on affecte les valeurs du tableau 1 dans le tableau 2
        for (int i = 0; i < tab1.length; i++) {
            tab2[i] = tab1[i];
        }
        //on affiche le contenu du tableau 1
        System.out.println("Contenu du tableau 1");
        for (int i : tab1) {
            System.out.println(i);
        }

        //on affiche le contenu du tableau 2 remplis
        System.out.println("Contenu du tableau 2");
        for (int i : tab2) {
            System.out.println(i);
        }
    }
}
