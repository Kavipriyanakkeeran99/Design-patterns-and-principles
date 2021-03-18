package singletonpattern;

public class Main {

	public static void main(String[] args) {
           
		DBConn dconn=DBConn.getInstance();
		
		
	     System.out.println(dconn.printMessage());
	}

}
