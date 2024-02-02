// Nested Class : Class within another class is called nested classes.
// This nested classes is to re use code and thus alternative to inheritance
// Also when we need all th classes at one place, we create inner classes.

package NestedClasses;

public class Department {
	
	private String dept_name;	
	private int capacity;
	private Employee[] employees; // Array to store employees (or array of Employee object)
	
	//constructor for Department 	
	Department(String dept_name,int capacity)
	{
		this.dept_name =dept_name;
		this.capacity=capacity;
		this.employees = new Employee[capacity];
		
	}
	
	//inner class to represent employee	
	public class Employee
	{
		private int emp_id;
		private String emp_name;
		
		Employee(int empid,String ename)
		{
			this.emp_id =empid;
			this.emp_name=ename;
		}
		
		// Getter methods for Employee
        public String getEmployeeName() {
            return emp_name;
        }

        public int getEmployeeId() {
            return emp_id;
        }
        
        //display method for Employee
        
        public void displayEmployeeInfo()
        {
        	System.out.println(" Employee id : "+emp_id);
        	System.out.println(" Employee Name : "+emp_name);
        	System.out.println("Department : "+dept_name);
        }    
      
    }
	
	  //method to add employee to the array of object defined in Department class
    public void addEmployee(int emp_id,String emp_name)
    {
    	for(int i=0;i<capacity;i++)
    	{
    		if(employees[i]==null)
    		{
    			employees[i] = new Employee(emp_id,emp_name);
    			System.out.println("Employee added in "+dept_name+" Department");
    			return;
    		}
    	}
    	System.out.println("Department is at full capacity. Cannot add more employees.");
    }    
	
	
	  //method todisplay all the employee in Department
    public void displayEmployees() 
     {        	
         System.out.println("Employees in " + dept_name + " department:");
         for(Employee employee :employees)
         {
        	 if(employee!=null)
        	 {
        		 employee.displayEmployeeInfo();
        		 System.out.println("--------------------->");
       
        	 }
         }
    
    } 
	public static void main(String[] args) {
       
		Department salesDept = new Department("Sales",5);
		
		
		// Adding employees to the SALES department
		salesDept.addEmployee(100, "Dheeraj Kumar");
		salesDept.addEmployee(200, "Neeraj Tripathi");
		salesDept.addEmployee(300, "Suman Sharma");		
		
		salesDept.displayEmployees();
      
	}

}
