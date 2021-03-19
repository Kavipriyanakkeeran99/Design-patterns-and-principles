package adaptorfactory;
import java.util.*;
public class Test {
   
	
	public static void main(String args[]) {
	
   Movable m=new Buggattiveyron();
   MovableAdaptor ma=new MovableAdaptorImpl(m);
   System.out.println(ma.getSpeed());
   System.out.println(ma.getPrice());
}
}
