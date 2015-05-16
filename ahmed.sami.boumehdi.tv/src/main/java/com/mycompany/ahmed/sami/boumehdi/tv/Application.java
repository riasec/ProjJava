package com.mycompany.ahmed.sami.boumehdi.tv;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application
{
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main( String[] args )
    {
        System.out.println( "ProjetTele - Boumehdi Ahmed-Sami - Groupe C" );
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
        
    }
}
