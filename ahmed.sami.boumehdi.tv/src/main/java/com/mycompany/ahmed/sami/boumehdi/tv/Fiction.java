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
}
