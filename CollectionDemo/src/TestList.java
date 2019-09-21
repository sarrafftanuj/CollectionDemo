import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<Account> lst=getData();
		display(lst);
	}
	
	public static List<Account>getData()
	{
	
	Account a1= new Account(101,"ramesh",10000);
	Account a2= new Account(102,"sumesh",5000);
	Account a3= new Account(103,"kamesh",1000);
	
	List<Account> lst = new Hashset<Account>();
	lst.add(a1);
	lst.add(a2);
	lst.add(a3);
	return lst;
	}
	public static void display(List<Account> lst)
	{
		for(Account a: lst)
			System.out.println(a);
	}
	}