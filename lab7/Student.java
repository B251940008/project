package lab7;

public class Student {
	private String name; 
	private int age; 
	private String studentId; 
	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId= studentId;
		
	} 
	  public String getName(){
	        return this.name;
	    }
	  public int getage() {
		  return this.age;
	  }
	  public String getstudentId() {
		  return  this.studentId;
	  }
	  
	  public String toString() {
		 
	        return studentId + " " + name + " " + age;
		  
	  } 

}
