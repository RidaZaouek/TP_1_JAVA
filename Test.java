public class Test {
    public static void main(String[] args){
        Article a1=new Article("SOURIS",400);
        Article a2=new Article("CLAVIER",700);
        Article a3=new Article("SMARTPHONE",4000);
        Panier p1=new Panier(0);
        p1.ajouterArticle(a1);
        p1.ajouterArticle(a2);
        p1.ajouterArticle(a3);
        System.out.println("L'AFFICHAGE DU PANIER : ");
        p1.afficherPanier();
        System.out.println("LE PRIX TOTAL DU PANIER EST "+p1.calculerTotal());
    }
}
