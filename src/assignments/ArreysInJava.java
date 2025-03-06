package assignments;

public class ArreysInJava {

	public static void main(String[] args) {
	
		
		
		// 1 D Array
		int a [] = new int [4];
		
            a[0] = 2;
            a[1] = 4;
            a[2] = 6;
            a[3] = 8 ;  
            
            
          System.out.println( a[3] );
            
            
          String employeename [] = {"sushant", "prashant","harsh"};  
          
          System.out.println(employeename [2]);
          
          
          String empname []= new String [5];
          
          empname [0] = "akshada";
          empname [1] = "sushant"; 
          
          System.out.println(empname [1]);
 
          
          
          String [] resource = new String [] {"IT","Mechanical","Civil","Electonics"};
          
          resource [0]= "Civil";
          resource [1]= "Electronics";
          resource [2]= "IT";
          resource [3]= "Mechanical";
       //   resource [4]= "Civil";
          
          System.out.println(resource [0]);
          
          
          // 2 D Array
          
          String [][]Project = {{"askhok","lalita","sangita"}, {"hemal","shamal","vidya" }};
          
          String [][]assignment = new String [2][3];
          
          assignment [0][0]="askhok";
          assignment [0][1]="lalita";
          assignment [0][2]="sangita";
          
          
          
          System.out.println(assignment [0][1]);
          
	}
	
	
	

}
