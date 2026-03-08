package lab3;
import java.util.Scanner;
public class lab3 {
	    private String нэр;          
	    private String валют;       
	    private double хүү;     
	    private int хугацаа;           
	    private double эүлдэгдэл;       

	    public lab3(String нэр, String валют, double хүү, int хугацаа, double эүлдэгдэл) {
	        this.нэр = нэр;
	        this.валют = валют;
	        this.хүү = хүү;
	        this.хугацаа = хугацаа;
	        this.эүлдэгдэл = эүлдэгдэл;
	    }

	    // 2. Хуримтлагдсан хүү тооцоолох private метод
	    private double savingscalcaccrued() {
	        // Томьёо: Эхний үлдэгдэл * (Жилийн хүү / 12) * Хугацаа / 100
	        return эүлдэгдэл * (хүү / 12) * хугацаа / 100;
	    }

	    // 3. Эцсийн үлдэгдэл тооцоолох private метод
	    private double savingscalc() {
	        // Томьёо: Эхний үлдэгдэл + Хуримтлагдсан хүү
	        return эүлдэгдэл + savingscalcaccrued();
	    }

	    // 4. Үр дүнг форматтай хэвлэх public метод
	    public void savingsreport() {
	        double accruedInterest = savingscalcaccrued();
	        double finalBalance = savingscalc();
	        
	        System.out.println("\n-------------------------------------------");
	        System.out.printf("Та \"%s\"-д %,.1f%s-ийг %d сарын хугацаатай, жилийн %.1f%%-ийн хүүтэй хадгалуулбал:\n", 
	        		нэр, эүлдэгдэл, валют, хугацаа, хүү);
	        System.out.printf("Хадгаламжийн үлдэгдэл: %,.1f%s болно.\n", finalBalance, валют);
	        System.out.printf("Хуримтлагдсан хүү: %,.1f%s байна.\n", accruedInterest, валют);
	    }

	    // Программыг ажиллуулах үндсэн хэсэг
	    public static void main(String[] args) {
	        // Объект үүсгэж байна
	    	Scanner input = new Scanner(System.in, "UTF-8");

	        System.out.println("=== Хадгаламжийн тооцоолуур ===");

	        System.out.print("Хадгаламжийн нэр: ");
	        String нэр = input.nextLine();

	        System.out.print("Валют (тэмдэг): ");
	        String валют = input.next();

	        System.out.print("Жилийн хүү (%): ");
	        double хүү1 = input.nextDouble();

	        System.out.print("Хугацаа (сараар): ");
	        int хугацаа = input.nextInt();

	        System.out.print("Эхний үлдэгдэл: ");
	        double эүлдэгдэл = input.nextDouble();

	        // Гараас авсан утгуудаар объект үүсгэх
	        lab3 userSavings = new lab3(нэр, валют, хүү1, хугацаа, эүлдэгдэл);
	        
	        // Үр дүнг харуулах
	        userSavings.savingsreport();

	        input.close(); // Scanner-ийг хаах
	    }
	}

