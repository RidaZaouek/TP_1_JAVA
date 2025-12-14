public class Utilisateur {
    private String nom;
    private static int compteurUtilisateur=0;
    public Utilisateur(String nom){
        compteurUtilisateur++;
    }
    public static int getCompteurUtilisateurs(){
        return compteurUtilisateur;
    }

}
