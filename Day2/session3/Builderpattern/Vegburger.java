package builderpattern;

public class Vegburger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.5f;
	}

}
