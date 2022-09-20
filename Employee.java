package oops;

import java.util.Scanner;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	
	
	public static void main(String args[])
	{
		
		Employee e1 =new Employee("balraj", "s");
		
		System.out.println("Please Enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human resource");
		System.out.println("4. Legal");
		
		CredentialService cred= new CredentialService();
		Scanner inpt= new Scanner(System.in);
		int dept= inpt.nextInt();
		switch(dept)
		{
		case 1:
			cred.showCredentials(e1.firstName, e1.lastName, "Tech");
			break;
		case 2:
			cred.showCredentials(e1.firstName, e1.lastName, "Admi");
			break;
		case 3:
			cred.showCredentials(e1.firstName, e1.lastName, "Huma");
			break;
		case 4:
			cred.showCredentials(e1.firstName, e1.lastName, "Lega");
			break;
			
		}
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
