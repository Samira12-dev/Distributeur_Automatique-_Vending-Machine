import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<String> produits = new ArrayList<>(List.of("Eau", "Soda", "Chips", "Chocolat"));
        ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0));
        ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));

        boolean continuer = true;

        
        while (continuer) {
            System.out.println("\n========== DISTRIBUTEUR AUTOMATIQUE =====");
            System.out.println("Produits disponibles :");

            
            for (int i = 0; i < produits.size(); i++) {
                System.out.println((i + 1) + ". " + produits.get(i)
                        + " - " + prix.get(i) + "£"
                        + " (Stock : " + stock.get(i) + ")");
            }

            System.out.println("0. Quitter");

            
            System.out.print("\nChoisissez un produit (0 pour quitter) : ");
            int choix = scanner.nextInt();

        
            if (choix == 0) {
                System.out.println("Merci ! À bientôt ");
                continuer = false;
            } else if (choix < 0 || choix > produits.size()) {
                System.out.println(" Choix invalide !");
            } else {
                System.out.println("Vous avez sélectionné : " + produits.get(choix - 1));
                System.out.println("(La gestion du paiement et du stock sera ajoutée plus tard.)");
            }
        }

        scanner.close();
    }
}