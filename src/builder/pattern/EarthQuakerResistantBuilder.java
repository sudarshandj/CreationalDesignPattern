package builder.pattern;

public class EarthQuakerResistantBuilder implements Builder {
	
	private	Home earthquakeResistantHome = new Home();

	@Override
	public void buildFloor() {
		this.earthquakeResistantHome.floor = "Wooden floor";
	}

	@Override
	public void buildWalls() {
		this.earthquakeResistantHome.walls = "Wooden Walls";
	}

	@Override
	public void buildTerrace() {
		this.earthquakeResistantHome.terrace = "Wooden terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		return this.earthquakeResistantHome;
	}

}
