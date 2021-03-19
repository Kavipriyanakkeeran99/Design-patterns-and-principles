package adaptorfactory;

public class MovableAdaptorImpl implements MovableAdaptor {
	
	private Movable luxuryCar;

	MovableAdaptorImpl(Movable luxuryCar){
		this.luxuryCar=luxuryCar;
	}
	
	//private Movable luxuryCar;
	
     public double getSpeed() {
    	 return convertMPHtoKMPH(luxuryCar.getSpeed());
     }
     
     private double convertMPHtoKMPH(double mph) {
    	 return mph*1.60934;
     }

	@Override
	public double getPrice() {
		return convertusdtoeuro(luxuryCar.getPrice());
	}
	 public double convertusdtoeuro(double price) {
		 return price*0.84;
	 }
     
}

