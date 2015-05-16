/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ahmed.sami.boumehdi.tv;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ahmed-Sami
 */
public class Divertissement extends Programme {
    
    private String animateur;
    private static final Logger logger = LoggerFactory.getLogger(Divertissement.class);
    public Divertissement(int heure, String nom){
        this.heure=heure;
        this.duree=2;
        this.nom=nom;
        this.type="Divertissement";
    }
    public String getAnimateur() {
        return animateur;
    }
    public void setAnimateur(String animateur) {
       this.animateur = animateur;
    }
    public int getDebut()
    {
        return heure;
    }
    public static Divertissement creationObjet(String element)
    {
        logger.info("Entree dans la methode static creationObjet(String elt)");
        int idebut;
        Divertissement tmp;
        logger.info("Debut du decoupage");
        StringTokenizer stk = new StringTokenizer(element, ",");
        String sType = stk.nextToken().toUpperCase(); //type
        String stDebut = stk.nextToken().trim();//début
        logger.debug("Tentative de conversion de l'heure de debut");
            idebut = Integer.parseInt(stDebut);
        String stTitre = stk.nextToken().trim(); //titre
        String stAnimateur = stk.nextToken().trim(); //animateur
        logger.info("Fin du decoupage");
        tmp = new Divertissement(idebut,stTitre);
        tmp.setAnimateur(stAnimateur);
        logger.info("Sortie de la methode creationObjet. L'objet {} est cree.",element);
        return tmp;
    }
    public Boolean verif(){
        logger.info("Debut de la verification");
        Boolean test=false;
        if(this.heure<18 || this.heure>21) //car dure 2h et doit être programmé entre 18h et 23h
        {
            logger.info("Les heures ne sont pas correctes. On renvoie false");
            System.out.println("Mauvaise heure pour le divertissement : " + this.nom);
        }
        else { //on va vérifier si le début et l'heure qui suit sont prises (un divertissement dure 2h)
            test=true;
            logger.info("Les heures sont correctes. On renvoie true");
            } 
        logger.info("Fin de la verification");
        return test;
    }
}
