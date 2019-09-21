import java.util.*;
public class TestMapDemo {

	public static void main(String[] args) {
		Map<String,	Integer> tm=new TreeMap<String, Integer>();
		tm.put("Maruti", 10000);
		tm.put("Aoyota", 20000);
		tm.put("BMW", 30000);
		tm.put("Maruti", 40000);
		System.out.println("treemap="+tm);
		
		tm.remove("Aoyota");
		System.out.println("treemap="+tm);
		
		
		
		Map<String,	Integer> hm=new HashMap<String, Integer>();
		hm.put("Maruti", 10000);
		hm.put("Aoyota", 20000);
		hm.put("BMW", 30000);
		hm.put("Maruti", 40000);
		System.out.println("hashmap="+hm);
		
	}

}
