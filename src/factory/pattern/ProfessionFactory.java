package factory.pattern;

public class ProfessionFactory {
	
	 public Profession getProfession(String typeOfProfession) {
		 if(typeOfProfession == null) {
			 return null;
		 }
		 
		 if(typeOfProfession.equalsIgnoreCase("Doctor")) {
			 return new Doctor();
		 }
		 
		 if(typeOfProfession.equalsIgnoreCase("Enginner")) {
			 return new Enginner();
		 }
		 
		 if(typeOfProfession.equalsIgnoreCase("Teacher")) {
			 return new Teacher();
		 }
		 
		 return null;
	 }
}
