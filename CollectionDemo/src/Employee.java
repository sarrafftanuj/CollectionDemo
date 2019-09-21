
public class Employee {
	private String ename;
	private double esal;
	
		
	public Employee(String ename, double esal) {
		super();
		this.ename = ename;
		this.esal = esal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}

}
