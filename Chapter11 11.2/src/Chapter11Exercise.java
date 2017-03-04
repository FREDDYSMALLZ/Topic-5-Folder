import java.util.*;
public class Chapter11Exercise {

	public static void main(String[] args) {
		Person person = new Person();
        Person student = new Student();
        Person employee = new Employee();
        Person faculty = new Faculty();
        Person staff = new Staff();

        System.out.println(person.toString() + person);
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

	}

}

class Person {
	  protected String name;//Protected modifiers to enable the members of the class to be accessed by the subclasses
	  protected String address;
	  protected String phone_Number;
	  protected String email_Address;

	  @Override
	  public String toString() {
	    return "Person";}
	    
	    public Person() {
	    }

	    public Person(String newName, String newAddress, String newPhone_number, String newEmail){
	        name = newName;
	        address = newAddress;
	        phone_Number = newPhone_number;
	        email_Address = newEmail;
	    }

	    public void setName(String newName){
	        name = newName;
	    }

	    public String getName(){
	        return name;
	    }

	    public void setAddress(String newAddress){
	        address = newAddress;
	    }

	    public String getAddress(){
	        return address;
	    }

	    public void setPhone(String newPhone_number){
	        phone_Number = newPhone_number;
	    }

	    public String getPhone(){
	        return phone_Number;
	    }

	    public void setEmail(String newEmail){
	        email_Address = newEmail;
	    }

	    public String getEmail(){
	        return email_Address;
	    
	  }
	}

	class Student extends Person {
	  public static int Freshman = 1;
	  public static int Sophomore = 2;
	  public static int Junior = 3;
	  public static int Senior = 4;

	  protected int status;

	  @Override
	  public String toString() {
	    return "Student";
	  }
	}
	

	class Employee extends Person {
	  protected String office;
	  protected int salary;
	  protected Calendar dateHired;

	  @Override
	  public String toString() {
	    return "Employee";
	  }
	}

	class Faculty extends Employee {
	  public static int Dean = 1;
	  public static int Chairperson = 2;
	  public static int Professor = 3;
	  public static int Associate_Professor = 4;
	  public static int Senior_Lecturer = 5;
	  public static int Lecturer = 6;

	  protected String officeHours;
	  protected int rank;

	  @Override
	  public String toString() {
	    return "Faculty";
	  }
	}

	class Staff extends Employee {
	  protected String title;

	  @Override
	  public String toString() {
	    return "Staff's title is " + title;
	  }
	}
	
