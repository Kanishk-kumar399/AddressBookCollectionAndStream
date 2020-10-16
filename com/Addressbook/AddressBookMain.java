package com.Addressbook;

public class AddressBookMain 
{
	private String firstName;
    private String lastName;
    private String address;
    private String state;
    private String city;
    private int pinCode;
    private long phoneNumber;
    private String emailId;

    public AddressBookMain(String firstName,String lastName,String address,String city,String state,int pinCode,long phoneNumber,String emailId)
    {
     this.firstName=firstName;
     this.lastName=lastName;
     this.address=address;
     this.city=city;
     this.state=state;
     this.pinCode=pinCode;
     this.phoneNumber=phoneNumber;
     this.emailId=emailId;
    }
    @Override
    public String toString()
    {
    		return "First Name: "+firstName+" \nLast Name: "+lastName+"\nAddress :"+address+"\nCity: "+city+"\nPincode: "+pinCode+"\nState: "+state+"\nPhoneNumber: "+phoneNumber+"\nEmail ID: "+emailId;
    }
    public static void main(String args[])
    {
    	AddressBookMain Contact1=new AddressBookMain("Kumar","Kanishk","SH-3/40","Varanasi","UP",2210,884024123,"kanishk@gmail.com");
    	System.out.println(Contact1);
    }
}
