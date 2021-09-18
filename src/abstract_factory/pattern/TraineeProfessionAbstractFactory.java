package abstract_factory.pattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory{

	@Override
	Profession getProfession(String typeOfProfession) {

		if(typeOfProfession == null) {
			return null;
		}else if(typeOfProfession.equalsIgnoreCase("Enginner")) {
			return new TraineeEngineer();
		}else if(typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new TraineeTeacher();
		}
		return null;
	}
	
	

}
