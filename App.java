package BuilderPattern;

public class App {
	
	public static void main(String arg[]){
		
		Vehicle  vehicle = new Vehicle.Builder().price(1500).model("Accord").color("red").door(4).build();
		
		System.out.println(vehicle);
	}

}
