package com.hemebiotech.analytics;

import java.util.HashMap;

/**
 * cette interface definit toutes les methodes concernant:
 * -l'ecriture dans le fichier de symptomes 
 * -la lecture dans le fichier source des symptoms
 * -le comptage des occurences de chaque symptomes dans la liste de symptones ...
 * - la generation d'un fichier result.out contenant l'ensemble des symptoms et leurs nombres d'occurences...
 */
public interface IAnalyticsMethods {


    /**
     * methode parcourt une liste et compte le nombre d'occurences de la chaine dans la liste
     * @param chaine donc on veut trouver le nombre d'occurences.
     * @return le nombre d'occurences de la chaine.
     */
    int countOccurences(String chaine);

    /**
     * cette methode permet de stocker les symoptoms et leurs occurences
     * dans une map ou la cle est le Symptom et le valeur est le nombre 
     * d'occurences ....
     * @param list
     * @return une collection map contenant les symptoms et leurs nombres d'occurences...
     */
    HashMap<String, Integer> occurencesMap();

    /**
     * methode permet d'afficher tous les symptomes et leurs occurences ...
     */
    void generateOuput(HashMap<String, Integer> mapList);

}