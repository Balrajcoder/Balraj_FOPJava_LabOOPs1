package oops;

import java.util.Random;

public class CredentialService {
	
	public String generateEmailAddress(String firstName,String lastName,String dept)
	{
		String emailAddress= firstName+lastName+"@"+dept+".abc.com";
		return emailAddress;
	}
	
	public String  generatePassword(int length)
	{
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters ="!@#$%^&*()_+/-";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	      for(int i = 4; i< length ; i++) {
	          password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	       }
	      
	       return String.valueOf(password);
		
	}
	
	public void  showCredentials(String firstName,String lastName,String dept)
	{
		System.out.println("Dear "+ firstName +" your generated credentials are as follows");
		System.out.println("Email---->"+generateEmailAddress(firstName, lastName, dept));
		System.out.println("Password---->"+generatePassword(8));			
	}
	

}
