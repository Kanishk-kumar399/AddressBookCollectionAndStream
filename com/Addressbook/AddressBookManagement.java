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
	public enum SearchBy {
		CITY, STATE
	}
	/*UC8 search person by city/state in all address books*/
	public static void searchPersonInBook(String search)
	{
		int numberOfPerson=0;
		Iterator contactArray=nameToAddressBookMap.entrySet().iterator();
		while(contactArray.hasNext())
		{
			Map.Entry entry=(Map.Entry) contactArray.next();
			AddressBookMain a=(AddressBookMain)entry.getValue();
			List<Contact> list=a.getcontactArray();
			for(Contact con:list)
			{
				if(con.getCity().equals(search)||con.getState().equals(search))
				{
					System.out.println(con);
					numberOfPerson++;
				}
			}
			if(numberOfPerson==0)
				System.out.println("No person was found");
		}
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
		System.out.println(aBookManager.nameToAddressBookMap);
	}
}
