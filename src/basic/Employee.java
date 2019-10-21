package basic;

public class Employee {

	public Employee() {
		
	}
public Employee(int sal) {
	this.sal=sal;
}
public void bonus() {
	 System.out.println("Sal of Emp"+ (sal+500));
	
}
int sal;
  public void add (int a, int b) {
	  sal= a+b;
	  System.out.println("Sal of Emp"+ sal);		  
  }
  
  public void mul (int a, int b) {
	  sal=a*b;
	  System.out.println("Sal of Emp"+ sal);
  }
  public void div (int a, int b) {
	  sal=a/b;
	  System.out.println("Sal of Emp"+ sal);
  }
  public void sub (int a, int b) {
	  sal=a-b;
	  System.out.println("Sal of Emp"+ sal);
  }
  
   String str="Employee";


	

}
