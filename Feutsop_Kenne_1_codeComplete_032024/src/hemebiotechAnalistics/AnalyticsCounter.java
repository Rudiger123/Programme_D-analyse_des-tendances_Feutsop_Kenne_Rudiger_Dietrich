package hemebiotechAnalistics;


import java.util.HashMap;

public class AnalyticsCounter {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

	//creation d'un objet de la classe ReadSymptomDataFromFile
	ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("D:\\Programme d'analyse des tendances_Feutsop_kenne\\Feutsop_Kenne_1_codeComplete_032024\\symptoms.txt");
		
	//lecture des symptoms dans le fichier et stockage dans une liste de chaine de caractere ..
	AnalysticsMethods analystic = new AnalysticsMethods(read.GetSymptoms());

	//la map qui contiendra l'ensemble des symptoms et leurs occurences ..
	HashMap<String, Integer> counterMap = analystic.occurencesMap();

	//le stockage des symptoms et de leurs occurences dans le fichier result.out....
	analystic.generateOuput(counterMap);

	}
}