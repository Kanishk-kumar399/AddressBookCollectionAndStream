package com.Addressbook;
import java.util.*;
public class AddressBookMain 
{
	static Scanner sc=new Scanner(System.in);
	private ArrayList<Contact> contactArrayList;
	
	public AddressBookMain()
	{
		contactArrayList=new ArrayList<>();
	}
	private void addNewContact(String firstName,String lastName,String address,String city,String state,int pinCode,long mobiileNumber,String emailId)
	{
		Contact object=new Contact(firstName,lastName,address,city,state,pinCode,mobiileNumber,emailId);
		contactArrayList.add(object);
	}
	public void editContact()
	{
		System.out.println("Enter The First Name And Last Name to edit the contact details");
		String firstName=sc.next();
		String lastName=sc.next();
		for(int i = 0; i <contactArrayList.size() ; i++) 
		{
			Contact object=contactArrayList.get(i);
			if(object.firstName.equals(firstName) && object.lastName.equals(lastName)) 
			{
				System.out.print("Enter address,city,state,pincode,phonenumber,email");
				String ad=sc.next();
				object.setAddress(ad);
				String ci=sc.next();
				object.setCity(ci);
				String st=sc.next();
				object.setState(st);
				int pin=sc.nextInt();
				object.setPinCode(pin);
				long num=sc.nextLong();
				object.setPhoneNumber(num);
				String em=sc.next();
				object.setEmailId(em);
				System.out.println(contactArrayList);
				break;
			}
		}
	}
	public void deleteContactDetails(String firstName, String lastName) {
		for(int i = 0; i < contactArrayList.size(); i++) 
		{
			Contact object=contactArrayList.get(i);
			if(object.firstName.equals(firstName) && object.lastName.equals(lastName)) {
				contactArrayList.remove(i);
				System.out.println("Contact deleted");
				break;
			}
		} 
	}
	public static void main(String args[])
	{	
	AddressBookMain addressBookContacts = new AddressBookMain();
	System.out.println("Enter number of contact details to enter:");
	int numOfContact = sc.nextInt();
	for(int i=0;i<numOfContact;i++)
	{
	System.out.print("Enter FirstName,Last Name,address,city,state,pincode,phonenumber,email");
	String fname=sc.next();
	String lname=sc.next();
	String addressNew=sc.next();
	String cityNew=sc.next();
	String stateNew=sc.next();
	int zip=sc.nextInt();
	long mobiileNumber=sc.nextLong();
	String email=sc.next();
	addressBookContacts.addNewContact(fname,lname,addressNew,cityNew,stateNew,zip,mobiileNumber,email);
	}
	addressBookContacts.editContact();
	System.out.println("Enter first name and last name of contact to be deleted: ");
	String firstname = sc.next();
	String lastname=sc.next();
	addressBookContacts.deleteContactDetails(firstname, lastname);	
	}
}
