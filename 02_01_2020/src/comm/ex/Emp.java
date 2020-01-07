package comm.ex;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class Emp {

	private int empid;
	private String empname;
	private double salary;

	// dafault cons
	public Emp() {

	}

	/*
	Parameterized cons*/
	public Emp(int empid, String empname, double salary)

	{
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
			}
	
// creating new emp
	public static Emp createEmp(int empid , String empname , double salary) {
		 return new Emp(empid , empname, salary);
	}
public void display ()
{
	System.out.println(empid + empname + salary);
	
}
}
