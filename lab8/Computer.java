package lab8;

public class Computer {
    private processor processor;
    private Memory memory;
    private DisplayCard displayCard;
    private SoundCard soundCard;
    
    public Computer() {
        processor = new processor("Intel", 8, 3.6, 16);
        memory = new Memory(16, "DDR4", 3200, "HYPERX");
        displayCard = new DisplayCard(8, "RTX 3060", "NVIDIA", 1800);
        soundCard = new SoundCard(6, 48000, "Realtek", "PCIe");
    }
    public void showInfo() {
        System.out.println("Computer specification: ");

        processor.printInfo();
        System.out.println();

        memory.printInfo();
        System.out.println();

        displayCard.printInfo();
        System.out.println();

        soundCard.printInfo();
    }
}
