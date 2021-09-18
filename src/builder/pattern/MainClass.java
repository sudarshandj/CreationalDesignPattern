package builder.pattern;

public class MainClass {

	public static void main(String[] args) {
		
		//EarthQuakerResistantBuilder earthQuakerResistantBuilder = new EarthQuakerResistantBuilder();
		FloodResistantBuilder floodResistantBuilder =  new FloodResistantBuilder();
		
		Director director = new Director(floodResistantBuilder);
		
		director.manageRequiredHomeConstruction();
		Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
		
		System.out.println(homeConstructedAtTheEnd.floor);
	}

}
