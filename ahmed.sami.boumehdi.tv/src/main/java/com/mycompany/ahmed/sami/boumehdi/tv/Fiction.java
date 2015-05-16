/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ahmed.sami.boumehdi.tv;

/**
 *
 * @author Ahmed-Sami
 */
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fiction extends Programme {
    private int annee;
    private String realisateur;
    private boolean rediffusion;
    private static final Logger logger = LoggerFactory.getLogger(Fiction.class);
    public Fiction(int heure, int duree, String nom){
       this.type="Fiction";
       this.heure=heure;
       this.duree=duree;
       this.nom=nom;
    }

     public int getAnnee() {
         return annee;
     }
     public void setAnnee(int annee) {
        this.annee = annee;
     }
     public String getRealisateur() {
         return realisateur;
     }
     public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
     }
     public boolean getRediffusion() {
         return rediffusion;
     }
     public void setRediffusion(boolean rediffusion) {
        this.rediffusion = rediffusion;
     }
     public int getDuree()
     {
         return duree;
     }
     public int getDebut()
     {
         return heure;
     }
    public static Fiction creationObjet(String element)
    {
        logger.info("Entree dans la methode Fiction.creationObjet(String elt)");
        int idebut, iduree;
        Fiction tmp;
        int year;
        Boolean rediff;
        logger.info("Debut du decoupage");
        StringTokenizer stk = new StringTokenizer(element, ",");
        String sType = stk.nextToken().toUpperCase(); //type
        String stDebut = stk.nextToken().trim();//début
        logger.debug("Tentative de conversion de l'heure de debut de la fiction {}", element);
        idebut = Integer.parseInt(stDebut);
        String stDuree = stk.nextToken().trim();//durée
        logger.debug("Tentative de conversion de la duree de la fiction {}", element);
        iduree = Integer.parseInt(stDuree);
        String stTitre = stk.nextToken().trim(); //titre
        String stAnnee = stk.nextToken().trim(); //date
        logger.debug("Tentative de conversion de l'annee de la fiction {}", element);
        year=Integer.parseInt(stAnnee);
        String stRealis = stk.nextToken().trim(); // réalisateur
        String stRediff = stk.nextToken().trim().toUpperCase(); //rediff
        logger.info("Fin du decoupage");
        if("OUI".equals(stRediff))
        {rediff=true;} 
        else {rediff=false;}

        tmp = new Fiction(idebut,iduree,stTitre);
        tmp.setAnnee(year); // convertir s5 en int
        tmp.setRediffusion(rediff); // convertir s7 en booléen
        tmp.setRealisateur(stRealis);
        logger.info("L'objet fiction correspondant au programme {} a ete creee. Sortie de la methode creationObjet.",element);
        return tmp;
    }
}
