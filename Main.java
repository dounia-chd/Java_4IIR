package test;

public class Main {
    public static void main(String[] args) {
      
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
        Livre livre2 = new Livre("L'Étranger", "Albert Camus", 1942);
        Livre livre3 = new Livre("1984", "George Orwell", 1949);

   
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);

      
        System.out.println("\nDétails du premier livre :");
        System.out.println("Titre : " + livre1.getTitre());
        System.out.println("Auteur : " + livre1.getAuteur());
        System.out.println("Année : " + livre1.getAnnee());
    }
}

