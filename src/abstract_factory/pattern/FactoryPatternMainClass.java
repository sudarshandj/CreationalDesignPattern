package abstract_factory.pattern;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
		
		Profession profession = abstractFactory.getProfession("Enginner");
		
		profession.print();
	}

}
