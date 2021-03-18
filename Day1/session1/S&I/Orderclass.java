package designprinciples;

public class Orderclass implements ProcessOrder {
	
        @Override
		public void processOrder(String modelName) {
        	System.out.println("The model name is "+modelName+" Your order is processed");
	}
}
