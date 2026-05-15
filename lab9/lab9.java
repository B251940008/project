package lab9;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;

public class lab9 {
	  private int year;
	  private int month;
	  private int day;
	  private int time;
	  private int minute;
	  private int second;
	  private LocalDateTime ldt;
	  private DateTimeFormatter formatter;
	  public lab9() {
	    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	  }
	  public void setClock(int y, int mon, int d, int t, int min, int s) {
		  this.year = y;
		  this.month = mon;
		  this.day = d;	
		  this.time = t;
		  this.minute = min;
		  this.second = s;
		  ldt = LocalDateTime.of(year, month, day, time, minute, second);
	  }
	  public void autoSetClock() {
		  ldt = LocalDateTime.now();
	    
	  }
	  public void tickClock() {
		  tickClock(1000);	    
	  }
	  public void tickClock(int tick) {
		  System.out.println(tick + " секундийн турш ажиллаж эхэллээ...");
	        try {
	            for (int i = 0; i < tick; i++) {
	                ldt = ldt.plusSeconds(1); 
	                System.out.println("Current Time: " + ldt.format(formatter));
	                TimeUnit.MILLISECONDS.sleep(1000); 
	            }
	        } catch (InterruptedException e) {
	            System.out.println("Алдаа гарлаа: " + e.getMessage());
	        }
	        System.out.println("Цаг ажиллаж дууслаа.");
	    }
	
	  }
	
	


