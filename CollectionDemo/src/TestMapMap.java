import java.util.*;


public class TestMapMap {

	public static void main(String[] args) {
		Map<String,Employee> emp=accept();
		display(emp);

	}
public static Map<String,Employee> accept()
{
	Map<String,Employee> emp=new HashMap<String,Employee>();
	emp.put("001", new Employee("Ram",1000));
	emp.put("553", new Employee("sam",2000));
	emp.put("1000", new Employee("aam",10000));
	emp.put("443", new Employee("lam",3000));
	return emp;
}
	public static void display(Map<String,Employee> emp)
	{
		Set<String> st=emp.keySet();
		
		for(String s:st)
		{
			Employee e= emp.get(s);
			System.out.println(s+"\t==>"+e.getEname()+"\t"+e.getEsal());
		}
	}
}
