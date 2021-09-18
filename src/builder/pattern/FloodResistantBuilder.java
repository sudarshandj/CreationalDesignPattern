package builder.pattern;

public class FloodResistantBuilder implements Builder {

	private Home floodResistantHome = new Home();
	
	@Override
	public void buildFloor() {
		this.floodResistantHome.floor = "10 feets Above ground level floot";
	}

	@Override
	public void buildWalls() {
		this.floodResistantHome.walls = "water resistant walls";
	}

	@Override
	public void buildTerrace() {
		this.floodResistantHome.terrace = "water leakage resistant terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		return this.floodResistantHome;
	}

}
