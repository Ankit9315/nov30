package nov30;

public class person {
	
		   // fields
		   private String name;
		   private String email;
		   private String phoneNumber;

		   // constructor
		   public person(String theName)
		   {
		      this.name = theName;
		   }
		   public person(String theName,String email) {
			   this.name=theName;
			   this.email=email;
		   }
		   public person(String theName,String email,String phonenumber) {
			   this.name=theName;
			   this.email=email;
			   this.phoneNumber=phonenumber;
		   }
		   public person() {
			  System.out.println("Default constructor");
		   }
		   

		   // methods - getters
		   public String getName() { return this.name;}
		   public String getEmail() { return this.email;}
		   public String getPhoneNumber() { return this.phoneNumber;}

		   // methods - setters
		   public void setName(String theName) { this.name = theName;}
		   public void setEmail(String theEmail) {this.email = theEmail;}
		   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
		   public String toString()
		   {
		      return this.name + " " + this.email + " " + this.phoneNumber;
		   }

		   // main method for testing
		   public static void main(String[] args)
		   {
		      person p1 = new person("Sana");
		      System.out.println(p1+"    ");
		      person p2 = new person("Jean");
		      p2.setEmail("jean@gmail.com");
		      p2.setPhoneNumber("404 899-9955");
		      System.out.println(p2+"     ");
		      
		      person p3=new person("ankit","ankit3012@gamil.com","029 456-2346");
		      System.out.println(p3+"     ");
		      person p4=new person();
		      System.out.println(p4+"      ");
		   }
		}



