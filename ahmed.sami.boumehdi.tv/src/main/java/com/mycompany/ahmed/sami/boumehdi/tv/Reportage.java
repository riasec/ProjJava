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
    public Reportage(int heure, int duree, String nom){
        this.type="Reportage";
        this.heure=heure;
        this.duree=duree;
        this.nom=nom;
    }
    public String getTheme()
    {
        return theme;
    }
    public void setTheme(String theme)
    {
        this.theme=theme;
    }
    public int getDebut(){return heure;}
    
}
