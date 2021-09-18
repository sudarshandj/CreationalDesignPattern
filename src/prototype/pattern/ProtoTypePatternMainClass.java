package prototype.pattern;

public class ProtoTypePatternMainClass {

	public static void main(String[] args) {
		
		ProfessionCache.loadProfessionCache();
		
		Profession docProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);
		
		Profession engProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engProfession);
		
		Profession tecProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(tecProfession);
		
		Profession docProfession1 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession1);
	}

}
