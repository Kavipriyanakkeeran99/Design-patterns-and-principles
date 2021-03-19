package builderpattern;

import java.util.ArrayList;

public class Meal {
      ArrayList<Item> items=new ArrayList<>();
      
      public void addItem(Item item) {
    	  items.add(item);
    	  }
      
      public float getCost() {
    	  float cost=0.0f;
    	  
    	  for(Item i:items) {
    		  cost+=i.price();
    	  }
    	  return cost;
      }
      
      public void showItems() {
    	  for(Item i:items) {
    		  System.out.println("Item : " + i.name());
              System.out.println("Packing : " + i.packing().pack());
              System.out.println("Price : " + i.price());
    	     }
    	  }

      }
      

