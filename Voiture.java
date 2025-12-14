public class Voiture
{
    private String marque;
    private String modele;
    private int annee;
    public Voiture(String marque,String modele,int annee){
        this.marque=marque;
        this.modele=modele;
        this.annee=annee;
    }
    public void afficherDetails(){
        System.out.println("MARQUE: "+this.marque+"\nMODELE: "+this.modele+"\nANNEE: "+this.annee);
    }
    public String getModele(){
        return this.modele;
    }
    public void setModele(String modele){
        this.modele=modele;
    }
    public String getMarque(){
        return this.marque;
    }
    public void setMarque(String marque){
        this.marque=marque;
    }
    public int getAnnee(){
        return this.annee;
    }
    public void setAnnee(int annee){
        this.annee=annee;
    }

}
