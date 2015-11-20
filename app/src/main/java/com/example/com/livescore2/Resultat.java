package com.example.com.livescore2;

/**
 * Created by Salah on 01/11/2015.
 */
public class Resultat {
    private int icon1;
    private String equipe1;
    private String resultat1;
    private String equipe2;
    private String resultat2;
    private int icon2;
    private String statut;

    public Resultat(int icon1, String equipe1, String resultat1, String equipe2, int icon2, String resultat2 , String statut) {
        this.icon1 = icon1;
        this.equipe1 = equipe1;
        this.resultat1 = resultat1;
        this.equipe2 = equipe2;
        this.icon2 = icon2;
        this.resultat2 = resultat2;
        this.statut=statut;
    }

    public String getStatut(){return statut;}

    public int getIcon1() {
        return icon1;
    }

    public String getEquipe1() {
        return equipe1;
    }

    public String getResultat1() {
        return resultat1;
    }

    public String getEquipe2() {
        return equipe2;
    }

    public String getResultat2() {
        return resultat2;
    }

    public int getIcon2() {
        return icon2;
    }


}
