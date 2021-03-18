package designprinciples;

public class Repairclass implements ProcessAccessoryRepair,ProcessPhoneRepair{

	@Override
	public void processAccessoryRepair(String accessoryType) {
           System.out.println("The accessory type is "+accessoryType+" and it is repaired");  		
	}

	@Override
	public void processPhoneRepair(String modelName) {
    	System.out.println("The model name is "+modelName+" and your phone is repaired");
		
	}
}
