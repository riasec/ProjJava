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
}
