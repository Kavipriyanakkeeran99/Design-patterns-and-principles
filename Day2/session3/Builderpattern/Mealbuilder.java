package builderpattern;

public class Mealbuilder {

	public Meal vegMeal() {
	Meal m=new Meal();
	m.addItem(new Vegburger());
	m.addItem(new Coke());
	return m;
	}
	
	public Meal nonvegMeal() {
		Meal m=new Meal();
		m.addItem(new ChickenBurger());
		m.addItem(new Pepsi());
		return m;
	}
}
