package Day2;

import java.util.Scanner;
import java.util.regex.Pattern;
import Day2.ContactStack;
public class Contact {
	private String fName, lName, dob, gender, anniversary, address, area, city , pin, state, country, telephone, mobile, email, website;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(String anniversary) {
		this.anniversary = anniversary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	public static void validate(Contact c) throws ValueNotFoundException {
		
		//code for empty string
		if(c.getfName() == null)
		{
			System.out.println("first name");
			throw new ValueNotFoundException("Enter value");
			}	
		if(c.getlName() == null)
		{
			System.out.println("last name");
			throw new ValueNotFoundException("Enter value");
			}	
		if(c.getDob() == null)
		{
			System.out.println("dob");
			throw new ValueNotFoundException("Enter value");
			}	
		if(c.getEmail() == null)
		{
			System.out.println("emailnull");
			throw new ValueNotFoundException("Enter value");
			}
		
		
			// code for email validation
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
	/*		Pattern pat = Pattern.compile(emailRegex); 
			if (c.getEmail() == null) 
			{	
				System.out.println("emailNull");
				throw new ValueNotFoundException("Email error");
				}
			
			if(pat.matcher(c.getEmail()).matches())
			{
				System.out.println("email");
				throw new ValueNotFoundException("Email error");	
				}
		*/	
			
			//code for mobile or telephone
			if((c.getMobile() == null) & c.getTelephone()  == null)
			{
				System.out.println("mobile");
				throw new ValueNotFoundException("Enter value");
				}
}
		
		 
	
	
	
	
	public static void main(String[] args){
		Contact c = new Contact();
		Scanner sc = new Scanner(System.in);
		
		String fName = sc.nextLine(); String lName = sc.nextLine();
		String dob = sc.nextLine(); String email = sc.nextLine();
		String mobile = sc.nextLine(); String telephone = sc.nextLine();
		//System.out.println("first name"); */
		c.setfName(fName);
		c.setlName(lName);
		c.setDob(dob);
		c.setEmail(email);
		c.setTelephone(telephone);
		c.setMobile(mobile);
		
		int k = 0;
		Contact[] stack = new Contact[3];
		
		try{
			//System.out.println("try");
			ContactStack.push(stack, k, c);	
		//	System.out.println(k);
			ContactStack.pop(stack, k);
			//validate(c);
			
		}
		catch(ValueNotFoundException e)
		{ 
			e.printStackTrace();
		//	 System.out.println("Email invalid");
			
		//throw new ValueNotFoundException("Not found");
		}
	/*	catch(NullPointerException e)
		{ 
			e.printStackTrace();
		//	System.out.println("Email invalid");
			
		//throw new ValueNotFoundException("Not found");
		} */
 	}
		
}

