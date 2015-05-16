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
public class Programme {
    protected int heure ;
    protected int duree;
    protected String nom;
    protected String type;
    public Programme(int heure, int duree, String nom)
    {
      this.heure=heure;
      this.duree=duree;
      this.nom=nom;
    }
    public Programme(int heure,String nom){
      this.heure=heure;
      this.nom=nom;
    }
    public int getDebut()
    {
      return heure;
    }
}
