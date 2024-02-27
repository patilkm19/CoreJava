


import java.util.Scanner; //scanner Package

public class EmpNetSalary{

	
	public static void main(String[] args) //Main Method
	{
		
		int EmpId;
		String EmpName;
		Double EmpNetSalary;  //Variable declaration
		
		Scanner sc= new Scanner(System.in);   //Create object of scanner class
		
		System.out.println("Enter Employee Id :");
		EmpId = sc.nextInt();   //get user input
		System.out.println("Enter Employee Name :");
		EmpName = sc.next();
		
		System.out.println("Enter Employee Gross Salary :"); 
		double EmpGrossSalary = sc.nextDouble(); 
		System.out.println("Enter Employee Income Tax % :");
		double It = sc.nextDouble();
		System.out.println("Enter Employee Provident Fund % :");
		double Pf = sc.nextDouble();
		
		It = It*EmpGrossSalary/100; //calculate income tax
		Pf = Pf*EmpGrossSalary/100; //calculate provident fund
		EmpNetSalary = EmpGrossSalary - It - Pf;  // calculating Employee Net Salary
		System.out.println("Employee Net Salary is = " +EmpNetSalary); //Displaying Employee Net salary

		
		
		


				
	}

}
