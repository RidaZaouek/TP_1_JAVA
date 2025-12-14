public class Testu {
    public static void main(String[] args){
        Utilisateur u1=new Utilisateur("RIDA");
        Utilisateur u2=new Utilisateur("ADNANE");
        Utilisateur u3=new Utilisateur("IMRANE");
        System.out.println("LE NOMBRE TOTAL D'UTILISATEURS CREES : "+Utilisateur.getCompteurUtilisateurs());

    }
}
