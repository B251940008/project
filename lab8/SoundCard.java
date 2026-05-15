package lab8;

public class SoundCard {
	private float channels;
	private int sampleRate;
	private String brand;
	private String interFace;
	
	public SoundCard(float channels, int sampleRate, String brand, String interFace) {
		this.channels = channels;
		this.sampleRate = sampleRate;
		this.brand = brand;
		this.interFace = interFace;
	}
	 public void printInfo() {
			System.out.println("--Sound Card--");
			System.out.println("Channels: " + channels);
			System.out.println("SampleRate: " + sampleRate);
			System.out.println("Brand: " + brand);
			System.out.println("InterFace: " + interFace);
	
	    }
}
