package com.Addressbook;
import java.util.*;
public class AddressBookMain 
{
	static Scanner sc=new Scanner(System.in);
	int numOfContact=0;
	private Contact[] contactArray;
	
	public AddressBookMain()
	{
		contactArray=new Contact[5];
	}
	private void addNewContact(String firstName,String lastName,String address,String city,String state,int pinCode,long mobiileNumber,String emailId)
	{
		contactArray[numOfContact]=new Contact(firstName,lastName,address,city,state,pinCode,mobiileNumber,emailId);
		System.out.println(contactArray[numOfContact]);
		numOfContact++;
	}
	public void printContact()
	{
	System.out.println(contactArray);
	}
	public void editContact()
	{
		System.out.println("Enter The First Name And Last Name to edit the contact details");
		String firstName=sc.next();
		String lastName=sc.next();
		for(int i = 0; i < numOfContact; i++) 
		{
			if(contactArray[i].firstName.equals(firstName) && contactArray[i].lastName.equals(lastName)) 
			{
				System.out.print("Enter address,city,state,pincode,phonenumber,email");
				String ad=sc.next();
				contactArray[i].setAddress(ad);
				String ci=sc.next();
				contactArray[i].setCity(ci);
				String st=sc.next();
				contactArray[i].setState(st);
				int pin=sc.nextInt();
				contactArray[i].setPinCode(pin);
				long num=sc.nextLong();
				contactArray[i].setPhoneNumber(num);
				String em=sc.next();
				contactArray[i].setEmailId(em);
				System.out.println(contactArray[i]);
				break;
			}
		}
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter FirstName,Last Name,address,city,state,pincode,phonenumber,email");
	String fname=sc.next();
	String lname=sc.next();
	String addressNew=sc.next();
	String cityNew=sc.next();
	String stateNew=sc.next();
	int zip=sc.nextInt();
	long mobiileNumber=sc.nextLong();
	String email=sc.next();
	AddressBookMain Contact1=new AddressBookMain();
	Contact1.addNewContact(fname,lname,addressNew,cityNew,stateNew,zip,mobiileNumber,email);
	Contact1.editContact();
	}
}
