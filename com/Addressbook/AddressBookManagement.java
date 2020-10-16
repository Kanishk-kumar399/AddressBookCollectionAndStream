package com.Addressbook;
import java.util.*;
import java.util.Map.Entry;
public class AddressBookManagement 
{
	static Scanner sc=new Scanner(System.in);
	public static Map<String,AddressBookMain> nameToAddressBookMap=new TreeMap<>();
	public static void addNewAddressBook()
	{
		AddressBookMain object=new AddressBookMain();
		System.out.println("Enter a unique name");
		String name=sc.next();
		object.maintainAddressBook();
		nameToAddressBookMap.put(name,object);
	}
	public static void main(String args[])
	{
		AddressBookManagement aBookManager=new AddressBookManagement();
		System.out.println("Enter 1 to add a new BOOK");
		int choice=sc.nextInt();
		if(choice==1)
			aBookManager.addNewAddressBook();
		else
			System.out.println("Invalid choice");
	}
}
