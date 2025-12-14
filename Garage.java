public class Garage {
    public static void main(String[] args){
        Voiture v1=new Voiture("peugeot","208",2021);
        Voiture v2=new Voiture("volkswagen","golf",2019);
        System.out.println("les infos de la premiere voiture :");
        v1.afficherDetails();
        System.out.println("les infos de la deuxieme voiture :");
        v2.afficherDetails();
        v2.setAnnee(2020);
        System.out.print("le modele de la deuxieme voiture :");
        System.out.println(v2.getModele());
        System.out.println("les infos de la deuxieme voiture apres modification de l'annee :");
        v2.afficherDetails();
    }
}
