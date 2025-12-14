public class Article {
    private String nom;
    private double prix;
    public Article(String nom,double prix){
        this.nom=nom;
        this.prix=prix;
    }
    public void tostring(){
        System.out.println("NOM :"+this.nom+"\nPRIX : "+this.prix);
    }
    public String getNom(){
        return nom;
    }
    public double getPrix(){
        return prix;
    }
}
