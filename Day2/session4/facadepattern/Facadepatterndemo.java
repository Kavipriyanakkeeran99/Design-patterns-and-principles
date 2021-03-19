package facadepattern;

import java.util.Scanner;

public class Facadepatterndemo {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
		
		Shapemaker s=new Shapemaker();
		System.out.println("Choose any shape you want to draw.");
		String ans=sc.nextLine();
		switch(ans) {
		case "circle":
			s.drawcircle();
			break;
		case "rectangle":
			s.drawrectangle();
			break;
		case "square":
			s.drawsquare();
			break;
		default:
			System.out.println("Enter the valid shape");
            break;
		}
		
	}

}
