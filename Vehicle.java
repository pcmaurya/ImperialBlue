package BuilderPattern;

public class Vehicle {
	
	private int price;
	private String type;
	private String make;
	private int horsePower;
	private String model;
	private String color;
	private int door;
	
	private Vehicle(Builder builder){
		
		this.price = builder.price;
		this.type = builder.type;
		this.make = builder.make;
		this.horsePower = builder.horsePower;
		this.model = builder.model;
		this.color = builder.color;
		this.door = builder.door;
	}
	
	@Override
	public String toString() {
		return "Vehicle [price=" + price + ", type=" + type + ", make=" + make
				+ ", horsePower=" + horsePower + ", model=" + model
				+ ", color=" + color + ", door=" + door + "]";
	}

	public static class Builder{
		
		private int price;
		private String type;
		private String make;
		private int horsePower;
		private String model;
		private String color;
		private int door;
		
		Builder(){
			
		}
		
		public Builder price(int price){
			this.price=price;
			return this;
		}
		
		public Builder type(String type){
			this.type=type;
			return this;
		}
		
		public Builder make(String make){
			this.make=make;
			return this;
		}
		
		public Builder model(String model){
			this.model=model;
			return this;
		}
		
		public Builder horsePower(int horsePower){
			this.horsePower=horsePower;
			return this;
		}
		
		public Builder color(String color){
			this.color=color;
			return this;
		}
		
		public Builder door(int door){
			this.door=door;
			return this;
		}
		
		public Vehicle build(){
			return new Vehicle(this);
		}
		
	}

}
