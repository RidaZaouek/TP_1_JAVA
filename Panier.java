public class Panier {
    private Article[]objets;
    private int nombreArticles;
    public Panier(int nombreArticles){
        this.objets=new Article[5];
        this.nombreArticles=nombreArticles;
    }
    public void ajouterArticle(Article article){
        if(nombreArticles<5){

                this.objets[nombreArticles++]=article;
        }
        else{
            System.out.println("LE PANIER EST PLEIN");
        }
    }
    public double calculerTotal(){
        double somme=0.0;
        for(int i=0;i<this.nombreArticles;i++){
            somme+=this.objets[i].getPrix();
        }
        return somme;
    }
    public void afficherPanier(){
        for(int i=0;i<this.nombreArticles;i++){
            this.objets[i].tostring();
        }
    }
}
