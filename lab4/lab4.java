package lab4;
import java.util.Scanner;

	public class lab4 { 
		 private int year;
		 private int month;
		 private int day; 
		 
		  public lab4(String dt){
		 String [] values = dt.split("[-./]");
		  this.year = Integer.parseInt(values[0]);
		  this.month = Integer.parseInt(values[1]);
		  this.day = Integer.parseInt(values[2]);
		  
		  }
		  
		  private int getyearcode(int year){ 
			 int Yearcode = year % 100;
			return (Yearcode+(Yearcode/4)) % 7; 
		  }
		  private int getmonthcode(int month){ 
			 int[] MonthCode = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
			 return MonthCode [month - 1];
		  }
		  private int getcenturycode(int century) { 
			  switch(century){
			  case 17: return 4;
			  case 18: return 2;
			  case 19: return 0;
			  case 20: return 6;
			  case 21: return 4;
			  case 22: return 2;
			  case 23: return 0;
			  default: return 0;
			  }
		  }
		  private int getleapyearcode(int year, int month) {
			  boolean LeapYearCode = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		        if (LeapYearCode && (month == 1 || month == 2)) {
		            return 1;
		        }
		        return 0;
	 }
		  
		  private int dayofweek() {
			int yearCode = getyearcode(this.year);
		        int monthCode = getmonthcode(this.month);
		        int centuryCode = getcenturycode(this.year / 100);
		        int leapYearCode = getleapyearcode(this.year, this.month);
		        
		        // Томъёо: (YearCode + MonthCode + CenturyCode + DateNumber - LeapYearCode) % 7
		        int res = (yearCode + monthCode + centuryCode + this.day - leapYearCode) % 7;
		        
		        // Хэрэв үр дүн хасах гарвал (модуль үйлдлээс хамаарч) 7-г нэмж эерэг болгоно
		        if (res < 0) res += 7;
		        return res;
		  }
		  public void printdayofweek() {
		        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		        int dayIndex = dayofweek();
		        
		        System.out.println(this.year + " onii " + this.month + "-r sariin " + this.day + " bol " + days[dayIndex]);
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Ognoo oruulna uu (on.sar.odor): ");
		        String input = scanner.nextLine();
		        
		        lab4 dt = new lab4(input);
		        dt.printdayofweek();
		        
		        scanner.close();
		    }
	}


