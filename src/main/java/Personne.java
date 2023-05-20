public class Personne {
    private String nom;
    private String prenom;
    private String dateDeNaissance;

    public Personne(String nom, String prenom, String dateDeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance='" + dateDeNaissance + '\'' +
                '}';
    }
}
