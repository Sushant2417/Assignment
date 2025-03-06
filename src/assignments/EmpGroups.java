package assignments;

public class EmpGroups {

	public static void main(String[] args) {
		
		
		// 2 D Arrays
		
		 String EmpNamesandID [] []= {{"Employeenames1" ,"Employeenames2" , "Employeenames3" }, { "EmployeeId1", "EmployeeId2", "EmployeeId1"}};
		
		 
	 
		// Or Seperate Arrays
		
		String [] EmpNames = { "Bharat", "ABC", "XYZ"};
		
		
		
		 int [] EmpID = { 1234,1235,1236};
		 
	
				
		Emplyoees obj = new Emplyoees();
			
		
		System.out.println(  ("Employee Name:" + obj.Employeenames1)    +  "Employee Id:" + obj.EmployeeId1); 
		System.out.println(   "Employee Name:" + obj.Employeenames2   +  "Employee Id:" + obj.EmployeeId2);
		System.out.println(   "Employee Name:" + obj.Employeenames3   +  "Employee Id:" + obj.EmployeeId3);	
	}

		
		
}
