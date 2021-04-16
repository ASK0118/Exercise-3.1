package Ex3p1;

import java.util.Scanner;

public class PressureCooker {
	
	Scanner input = new Scanner(System.in);
	
	String brand;
	String color;
	String model;
	double price;
	
	//Default Constructor
	PressureCooker(){
		
		System.out.print("Enter the brand: ");
		this.brand = input.next();
		
		System.out.print("Enter the color: ");
		this.color = input.next();
		
		System.out.print("Enter the model: ");
		this.model = input.next();
		
		System.out.print("Enter the price: ");
		this.price = input.nextDouble();
			
	}

	//Parameterized Constructor
	PressureCooker(String brand, String color, String model, double price){
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.price = price;
	}
}
