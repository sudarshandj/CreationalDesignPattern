package factory.pattern;

public class FactoryPatternMainClass {
	
	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession profession =  professionFactory.getProfession("Teacher");
		
		profession.print();
	}

}
