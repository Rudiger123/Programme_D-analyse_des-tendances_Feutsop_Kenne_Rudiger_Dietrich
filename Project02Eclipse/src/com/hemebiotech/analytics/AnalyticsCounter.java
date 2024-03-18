package com.hemebiotech.analytics;

import java.util.HashMap;

public class AnalyticsCounter {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

	//creation d'un objet de la classe ReadSymptomDataFromFile
	ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("D:\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		
	//lecture des symptoms dans le fichier et stockage dans une liste de chaine de caractere ..
	AnalysticsMethods analystic = new AnalysticsMethods(read.GetSymptoms());

	//la map qui contiendra l'ensemble des symptoms et leurs occurences ..
	HashMap<String, Integer> counterMap = analystic.occurencesMap();

	//le stockage des symptoms et de leurs occurences dans le fichier result.out....
	analystic.generateOuput(counterMap);

	}
}