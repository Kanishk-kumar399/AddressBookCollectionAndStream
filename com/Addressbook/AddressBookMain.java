package com.Addressbook;
import java.util.*;
public class AddressBookMain 
{
	static Scanner sc=new Scanner(System.in);
	private ArrayList<Contact> contactArrayList;
	private Map<String,Contact> nameToContactMap;
	public AddressBookMain()
	{
		contactArrayList=new ArrayList<>();
		nameToContactMap=new HashMap<>();
	}
	public void addNewContact()
	{
		System.out.println("Enter First Name");
		String firstName=sc.next();
		System.out.println("Enter last Name");
		String lastName=sc.next();
		System.out.println("Enter the Address");
		String address=sc.next();
		System.out.println("Enter the City");
		String city=sc.next();
		System.out.println("Enter the State");
		String state=sc.next();
		System.out.println("Enter the Pincode");
		int pinCode=sc.nextInt();
		System.out.println("Enter the Number");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter the Email");
		String emailId=sc.next();
		Contact contact=new Contact(firstName,lastName,address,city,state,pinCode,phoneNumber,emailId);
		contactArrayList.add(contact);
		nameToContactMap.put(contact.getFirstName()+" "+contact.getFirstName(),contact);
	}
	public void editContact()
	{
		System.out.println("Enter The First Name And Last Name to edit the contact details");
		String firstName=sc.next();
		String lastName=sc.next();
		String name=firstName+" "+lastName;
		Contact object=nameToContactMap.get(name);
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
	}
	public void deleteContactDetails() 
	{
		System.out.println("Enter The First Name And Last Name to delete the contact details");
		String firstName=sc.next();
		String lastName=sc.next();
			String name=firstName+" "+lastName;
			Contact object=nameToContactMap.get(name);
			contactArrayList.remove(object);
			nameToContactMap.remove(name);
		
	}
	public void maintainAddressBook()
	{	
		boolean check=true;
		while (check==true) 
		{
			System.out.println("\n1. Add Contact Details");
			System.out.println("\n2. Edit Contact Details");
			System.out.println("\n3. Delete Contact Details");
			System.out.println("\n4. Exit");
			System.out.println("\nEnter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:addNewContact();
			break;
			case 2:if(contactArrayList.size()==0)
					System.out.println("Plese Enter contacts");
					else
				    editContact();
			break;
			case 3:if(contactArrayList.size()==0)
					System.out.println("Plese Enter contacts");
					else
						deleteContactDetails();
			break;
			case 4:System.out.println("Exit");
				   check=false;
			break;
			}
		}
	}
}
