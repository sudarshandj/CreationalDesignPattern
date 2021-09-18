package prototype.pattern;

import java.util.Hashtable;

public class ProfessionCache {
	
	private static Hashtable<Integer, Profession> professionMap = new Hashtable<Integer , Profession>();
	
	public static Profession getCloneNewProfession(int id) {
		Profession cachedProfessionInstance = professionMap.get(id);
		return (Profession) cachedProfessionInstance.cloningMethod();
	}
	
	public static void loadProfessionCache() {
		Doctor doc = new Doctor();
		doc.id = 1;
		professionMap.put(doc.id, doc);
		
		Enginner eng =  new Enginner();
		eng.id = 2;
		professionMap.put(eng.id, eng);
		
		Teacher tec = new Teacher();
		tec.id = 3;
		professionMap.put(tec.id, tec);
	}

}
