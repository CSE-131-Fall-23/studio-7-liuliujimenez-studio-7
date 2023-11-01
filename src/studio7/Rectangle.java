package studio7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rectangle {
	
	Scanner in = new Scanner(System.in);
	
	public double length = in.nextDouble();
	public double width = in.nextDouble();
	
	public static void main(String[] args) {
		System.out.println("Please enter the length of the rectangle:");
		length = in.nextDouble();
	}

}
