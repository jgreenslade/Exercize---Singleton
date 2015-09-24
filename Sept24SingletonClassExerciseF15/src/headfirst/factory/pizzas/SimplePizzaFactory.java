package headfirst.factory.pizzas;

public class SimplePizzaFactory {

	private static SimplePizzaFactory pizzaFactory;
	
	private SimplePizzaFactory() {
		
	}
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

	public static synchronized SimplePizzaFactory makeInstance() {
		if (pizzaFactory == null)
			pizzaFactory = new SimplePizzaFactory();
		return pizzaFactory;
	}
}
