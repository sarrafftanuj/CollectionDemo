import java.util.*;

public class TestSetDemo {

	public static void main(String[] args) {
		Account a1= new Account(101,"ramesh",10000);
		Account a2= new Account(102,"sumesh",5000);
		Account a3= new Account(103,"kamesh",1000);
		Set<Account> st=new TreeSet<Account>();
		st.add(a1);
		st.add(a2);
		st.add(a3);
		for(Account a:st)
		{
			System.out.println(a.getAccNo() +"\t"+a.getCustName() +"\t"+ a.getAccBal());
	}
	}
}
