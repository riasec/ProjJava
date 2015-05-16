package com.mycompany.ahmed.sami.boumehdi.tv;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application
{
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main( String[] args )
    {
        logger.info("Lancement de l'application");
        System.out.println( "ProjetTele - Boumehdi Ahmed-Sami - Groupe C" );
        System.out.println();
        String[] programmeTV  = new String[24];
        
        /*********************************************************************
                                ARRAYLIST A VERIFIER
        *********************************************************************/
        ArrayList<String> programmeList = new ArrayList<>();
        programmeList.add("fiction, 21, 2, Database, 1970, Codd, non");
        programmeList.add("divertissement, 18, TPMP, Cyril");
        programmeList.add("reportage, 4, 1, Les perruches d'Alaska, animalier");
        programmeList.add("FICTION, 10, 2, A.I., 2001, Steven Spielberg, OUI");
        programmeList.add("reportage, 2, 1, test2, monde");
        programmeList.add("reportage, 0, 1, test, culturel");
        logger.info("La liste de programmes a tester a ete creee");
        
        /********************************************************************
                            AFFICHAGE DE L'ARRAYLIST A TESTER
        *********************************************************************/
        System.out.println("A tester :");
        for(String s : programmeList)
        {
            logger.trace("Passage dans la boucle d'affichage");
            System.out.println(s);
        }
        System.out.println();
        /*
        Traitement de l'array
        */
        
         for (String progAtester : programmeList) {
            logger.trace("Passage dans la boucle de traitement des programmes.");
            StringTokenizer stk = new StringTokenizer(progAtester, ",");
            String sType = stk.nextToken().toUpperCase(); //type de programme
            logger.trace("Decoupage du premier mot de la liste.");
            if("DIVERTISSEMENT".equals(sType))
            {
                Divertissement tmp = Divertissement.creationObjet(progAtester);
                if(tmp.verif()==true)
                {
                    logger.trace("Verification du respect des contraintes de <{}>",progAtester);
                    if (programmeTV[tmp.getDebut()] != null || programmeTV[tmp.getDebut()+1] != null)
                {
                    System.out.println("Le créneau choisi pour : " + progAtester + " est déjà utilisé.");
                    logger.trace("La case programmeTV[{}] ou programmeTV[{}] est deja utilisee. On ne peut pas programmer {}",tmp.getDebut(),tmp.getDebut()+1,progAtester);
                }
                else
                {
                    programmeTV[tmp.getDebut()]=progAtester;
                    programmeTV[tmp.getDebut()+1]=progAtester; //car les divertiss. durent forcément 2h
                    logger.trace("Affectation de <{}> dans programmeTV[{}] et programmeTV[{}]",progAtester,tmp.getDebut(),tmp.getDebut()+1);
                } 
                }
            }
            if("REPORTAGE".equals(sType))
            {
                Reportage tmp = Reportage.creationObjet(progAtester);
                if(tmp.verif()==true)
                {
                    logger.trace("Verification du respect des contraintes de <{}>",progAtester);
                    if (programmeTV[tmp.getDebut()] != null)
                    {
                        System.out.println("Le créneau choisi pour : " + progAtester + " est déjà utilisé.");
                        logger.trace("La case programmeTV[{}] est deja utilisee. On ne peut pas programmer {}",tmp.getDebut(),progAtester);
                    }
                    else 
                    {
                        programmeTV[tmp.getDebut()]=progAtester;
                        logger.trace("Affectation de <{}> dans la case programmeTV[{}]",progAtester,tmp.getDebut());
                    }
                }
            }
            if("FICTION".equals(sType)) 
            {
                Fiction tmp = Fiction.creationObjet(progAtester);
                int variableDeCalcul=tmp.getDuree()+tmp.getDebut()-1;
                if(tmp.verif() ==true)
                { 
                    logger.trace("Verification du respect des contraintes de <{}>",progAtester);
                    for(int i = variableDeCalcul; i>=tmp.getDebut(); i--)
                    {
                        if (programmeTV[i] != null)
                        {
                            System.out.println("Le créneau choisi pour : " + progAtester + " est déjà utilisé.");
                            logger.trace("La case programmeTV[{}] est deja utilisee. On ne peut pas programmer {}",i,progAtester);
                        }
                        else {programmeTV[i]=progAtester;
                        logger.trace("Affectation de <{}> dans programmeTV[{}]",progAtester, i);    
                        }
                    }
                }
            }
        }
        
        /********************************************************************
                AFFICHAGE DU PROGRAMME TV 
        ********************************************************************/ 
        
        System.out.println("Programme télé :");
       
        for(int i=0;i<24;i++)
        {   
            if (programmeTV[i] != null) {
                System.out.println(i + "h : " + programmeTV[i]);
            } else {
                System.out.println(i + "h ----- Créneau libre");
            }
            logger.trace("La valeur de programmeTV[{}] a ete affichee",i);
        }
    logger.info("Fin de l'execution de l'application");
    }
}
