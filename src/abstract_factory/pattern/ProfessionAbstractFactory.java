package abstract_factory.pattern;

public class ProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String typeOfProfession) {
		
		if(typeOfProfession == null) {
			return null;
		}else if(typeOfProfession.equalsIgnoreCase("Enginner")) {
			return new Enginner();
		}else if(typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		}
		return null;
	}

}
