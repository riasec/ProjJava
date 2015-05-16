/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ahmed.sami.boumehdi.tv;

import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ahmed-Sami
 */
public class Reportage extends Programme {
   
    private String theme;
    
    private static final Logger logger = LoggerFactory.getLogger(Reportage.class);
    
    public Reportage(int heure, int duree, String nom)
    {
        super(heure,duree,nom);
        this.type="Reportage";
    }
    public String getTheme()
    {
        return theme;
    }
    public void setTheme(String theme)
    {
        this.theme=theme;
    }
    public static Reportage creationObjet(String element)
    {
        logger.info("On entre dans la methode creationObjet");
        int idebut, iduree;
        Reportage tmp;
        logger.info("Debut du decoupage");
        StringTokenizer stk = new StringTokenizer(element, ",");
        String sType = stk.nextToken().toUpperCase(); //type
        String stDebut = stk.nextToken().trim();//début
        logger.debug("Tentative de conversion de l'heure de debut");
            idebut = Integer.parseInt(stDebut);
        String stDuree = stk.nextToken().trim();//durée
        logger.debug("Tentative de conversion de la duree");
            iduree = Integer.parseInt(stDuree);
        String stTitre = stk.nextToken().trim(); //titre
        String stTheme = stk.nextToken().trim(); //animateur
        logger.info("Fin du decoupage");
        tmp = new Reportage(idebut,iduree,stTitre);
        tmp.setTheme(stTheme);
        logger.info("Sortie de la methode creationObjet, le programme {} est cree", element);
        return tmp;
    }
    public Boolean verif()
    {   
        
        logger.info("Debut de la verification");
        Boolean test;  
        test = false;
        if (this.duree == 1) //1h obligatoire
        {
            if(this.heure>=14 && this.heure<=17) //tranche horaire creuse
            {   
                logger.info("Bonne duree et bon creneau horaire. On renvoie <true>");
                test=true;
            }
            else if (this.heure>=0 && this.heure<=5) //tranche horaire creuse
            {   
                logger.info("Bonne duree et bon creneau horaire. On renvoie <true>");
                test=true;
            }
            else {
                logger.info("Bonne duree mais mauvaise heure de debut. On renvoie <false>");
                System.out.println("Mauvaise heure de début pour le reportage : " + this.nom);
            }
        logger.info("Fin de la verification");
        }
        else
        {
            logger.info("Mauvaise duree. On renvoie <false>");
            System.out.println("Mauvaise durée pour le reportage : " + this.nom);
        
        }
     return test;
    }
}
