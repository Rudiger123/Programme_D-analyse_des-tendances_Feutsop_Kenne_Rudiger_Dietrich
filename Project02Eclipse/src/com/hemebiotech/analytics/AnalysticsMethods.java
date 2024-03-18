package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AnalysticsMethods implements IAnalyticsMethods {
    
   private List<String> list;

  
   public AnalysticsMethods(List<String> list)
   {
      this.list = list;
   }

   @Override
   public int countOccurences(String chaine)
   {
    //compteur d'occurences
    int compteur = 0;

     for (int i = 0; i < list.size(); i++) {
        //si la chaine correspond a l'element de la liste alors incrementer le compteur...
        if (chaine.equals(list.get(i)))
        {
           compteur = compteur + 1; 
        }
     }
     return compteur;
    }

   @Override
   public HashMap<String, Integer> occurencesMap()
   {
        // table associative contenant les symptomes et leurs occurences..
        HashMap<String, Integer> counterMap = new HashMap<>();

        for(String symptom : list)
        {
            //si la table associative ne contient pas deja le symptome alors ajoute-le.. 
            if (!counterMap.containsKey(symptom)) {
                counterMap.put(symptom,countOccurences(symptom));
            }
        }
        return counterMap;
   }

   @Override
   public void generateOuput(HashMap<String, Integer> mapList)
   {
        try( BufferedWriter writer = new BufferedWriter(new FileWriter("result.out", true))) {
            int i = 1;
            for (String key : convertSetToTreeSet(mapList.keySet())) {
                writer.append( i + " - " + key + " : " + mapList.get(key));
                writer.newLine();
                i++;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
   }
   /**
    * convertir le type set (ensemble non ordonnee) en treeSet(les ensembles ordonnes) pour trier l'ensemble..
    * @param set ensemble de symptomes non tries ...
    * @return l'ensemble des symptoms dans l'ordre alphabetique...
    */
    public TreeSet<String> convertSetToTreeSet(Set<String> set)
   {
      TreeSet<String> treeSet = new TreeSet<>();
      treeSet.addAll(set);
      return treeSet;
   }
   
}
