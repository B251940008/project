package lab8;

public class Memory {
	private int size;
	private String type;
	private double speed;
	private String brand;
	
	public Memory(int size, String type, double speed, String brand) {
		this.size = size;
		this.type = type;
		this.speed = speed;
		this.brand = brand;
	}	
	
	 public void printInfo() {
		 
		System.out.println("--RAM--");
		System.out.println("Size: " + size + "Gb");
		System.out.println("Type: " + type);
		System.out.println("Speed: " + speed + "Mhz");
		System.out.println("Brand: " + brand);
		
	    }
	

}
