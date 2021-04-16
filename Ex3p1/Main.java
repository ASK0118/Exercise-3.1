package Ex3p1;

public class Main {

	public static void main(String[] args) {
		PressureCooker Philips = new PressureCooker();
		
		System.out.println("\nPressure Cooker Information");
		System.out.println("Brand: "+ Philips.brand);
		System.out.println("Color: "+ Philips.color);
		System.out.println("Model: "+ Philips.model);
		System.out.println("Price: RM"+ Philips.price);
		
		PressureCooker Philips2 = new PressureCooker("Philips", "RED", "HD2139", 239.80);
		
		System.out.println("\nPressure Cooker Information");
		System.out.println("Brand: "+ Philips2.brand);
		System.out.println("Color: "+ Philips2.color);
		System.out.println("Model: "+ Philips2.model);
		System.out.println("Price: RM"+ Philips2.price);
	}

}
